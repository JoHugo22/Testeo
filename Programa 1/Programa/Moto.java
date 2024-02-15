
package com.mycompany.trasporte;

public class Moto extends Vehiculo{
    public Moto(String tipoVehiculo, Integer pasajeros, String marca){
        super(tipoVehiculo, pasajeros, marca);
        
    }
    public void conducir(){
        System.out.println("Se encuentra en la moto");
        encender();
    }
        
    
}
