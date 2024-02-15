
package com.mycompany.trasporte;

public class Trasporte {

    public static void main(String[] args) {
        Moto motodos= new Moto("mototaxi", 3, "tornado");
        Auto autouno= new Auto("carro", 5, "Chevrolet");
        
        motodos.conducir();
        System.out.println(motodos.marca);
       
        autouno.conducir();
        System.out.println(autouno.marca);
       
    }
}
