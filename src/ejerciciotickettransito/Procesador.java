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
        
        // si corresponde generadorTicket
        generadorTicket.generar(new Ticket());
        
    }
}
