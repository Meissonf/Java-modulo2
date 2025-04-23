package com.example;

public class UberEntrega implements ServicioDeEntrega{

    @Override
    public void entregar(String direccion) {
      System.out.println("Entregando a " + direccion + " con Uber");
    }

    @Override
    public void cobrar(double monto) {
        System.out.println("Cobranza de " + monto + " con Uber");
    }
    
}
