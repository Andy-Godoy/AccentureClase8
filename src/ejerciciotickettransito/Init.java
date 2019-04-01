package ejerciciotickettransito;

import sensorvelocidad.*;
import sensorclima.*;

public class Init {
    public static void main(String[] args) {
        sensorvelocidad.Sensor sensorvelocidad = Factory.crearSensorVelocidad();
        sensorclima.Sensor sensorclima = Factory.crearSensorClima();
        
        while (true) {
            DatosVehiculo datosVehiculo = sensorvelocidad.sensarVehiculo();
            System.out.println(datosVehiculo);
            System.out.println(sensorclima.sensar());
        }
    }
}
