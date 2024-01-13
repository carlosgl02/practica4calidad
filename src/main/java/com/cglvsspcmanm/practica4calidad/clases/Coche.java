package com.cglvsspcmanm.practica4calidad.clases;

public class Coche {

    private String marca;
    private int velocidad;

    public Coche(String marca) {
        this.marca = marca;
        this.velocidad = 0; // Los coches empiezan parados.
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int incremento) {
       
            velocidad += incremento;
        
    }

    public void frenar(int decremento) {
        if (decremento > 0 && velocidad >= decremento) {
            velocidad -= decremento;
        }
    }
}

