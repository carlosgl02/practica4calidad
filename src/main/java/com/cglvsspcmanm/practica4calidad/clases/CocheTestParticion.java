package com.cglvsspcmanm.practica4calidad.clases;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class CocheTestParticion {

	private Coche coche;

    @Before
    public void setUp() {
        coche = new Coche("Toyota");
    }

    // Métodos que modifican atributos (M)
    
    @Test
    public void cuandoAceleraIncrementaVelocidad() {
        // Partición de prueba para método que modifica el atributo 'velocidad'.
        coche.acelerar(10);
        Assert.assertEquals("La velocidad debe incrementarse en 10.", 10, coche.getVelocidad());
    }

    @Test
    public void cuandoFrenaDecrementaVelocidad() {
        // Partición de prueba para método que modifica el atributo 'velocidad'.
        coche.acelerar(20); 
        coche.frenar(10);
        Assert.assertEquals("La velocidad debe decrementarse en 10.", 10, coche.getVelocidad());
    }

    // Métodos que no modifican atributos pero los retornan (NM)

    @Test
    public void getVelocidadInicialEsCero() {
        // Partición de prueba para método que no modifica ningún atributo.
        Assert.assertEquals("La velocidad inicial del coche debe ser 0.", 0, coche.getVelocidad());
    }
}
