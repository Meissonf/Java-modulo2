package com.example;

public class Personaje {
    private String nombre;
    private int vidas;

    public Personaje(String nombre){
        this.nombre = nombre;
        this.vidas = 3;
    }

    public String getNombre(){
        return nombre;
    }

    public void saltar(){
        System.out.println(nombre + " está saltando");
    }

    public void recibirDano(){
        vidas--;
        System.out.println(this.nombre + "perió una vida. Vidas restantes: " + vidas);
    }

}
