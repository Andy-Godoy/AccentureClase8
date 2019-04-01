package ejerciciotickettransito;

import ejerciciotickettransito.gentickets.GeneradorTicket;
import sensorclima.TipoClima;
import sensorvelocidad.DatosVehiculo;

public class Procesador {    
    private GeneradorTicket generadorTicket;

    public Procesador(GeneradorTicket generadorTicket) {
        this.generadorTicket = generadorTicket;
    }
    
    public void procesar(
                DatosVehiculo datosvehiculo, 
                TipoClima tipoClima,
                Boolean esSabado) {
        
        // Aca iria la logica
        int limite = Limites.obtenerLimite(
                datosvehiculo.tipoVehiculo, 
                tipoClima);

        if (datosvehiculo.velocidadMedida > limite) {
            Ticket t = new Ticket(datosvehiculo, 1000);
            generadorTicket.generar(t);
        }
    }
}
