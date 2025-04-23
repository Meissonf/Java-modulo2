package com.example;

public class Mario extends Personaje{

    public Mario(String nombre){
        super(nombre);
    }

    public void Disparar(){
        System.out.println(getNombre() + " dispara");
    }
   
}


