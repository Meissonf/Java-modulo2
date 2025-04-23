package com.example;

public class Main {
   
    public static void main(String[] args) {
        ServicioDeEntrega pedido1 = new Rappi();
        ServicioDeEntrega pedido2 = new UberEntrega();

        pedido1.entregar("Calle 123");
        pedido2.entregar("Calle 456");

        pedido1.cobrar(100);
        pedido2.cobrar(200);

    }
} 
