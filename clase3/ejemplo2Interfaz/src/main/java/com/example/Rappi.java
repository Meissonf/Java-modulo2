package com.example;

public class Rappi implements ServicioDeEntrega{

    @Override
    public void entregar(String direccion) {
        System.out.println("Entregando a " + direccion + " con Rappi");
    }
    
    @Override
    public void cobrar(double monto) {
        System.out.println("Cobranza de " + monto + " con Rappi");
    }
    
}
