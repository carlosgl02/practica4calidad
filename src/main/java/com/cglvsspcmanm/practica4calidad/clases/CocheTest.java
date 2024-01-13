package com.cglvsspcmanm.practica4calidad.clases;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CocheTest {

    private Coche coche;
    private Coche cochef;
    private Coche coche2;

    @Before
    public void setUp() {
        coche = new Coche("Toyota");
        cochef = new Coche("Opel");
    }

    @Test
    public void testAssertEquals() {
        coche.acelerar(50);
        cochef.acelerar(500);
        Assert.assertEquals("La velocidad después de acelerar debería ser igual a 50", 50, coche.getVelocidad());
        Assert.assertEquals("La velocidad después de acelerar debería ser igual a 50", 50, cochef.getVelocidad());
    }

    @Test
    public void testAssertTrue() {
        coche.acelerar(10);
        cochef.acelerar(-500);
        Assert.assertTrue("La velocidad debe ser mayor que 0 después de acelerar", coche.getVelocidad() > 0);
        Assert.assertTrue("La velocidad debe ser mayor que 0 después de acelerar", cochef.getVelocidad() > 0);
    }

    @Test
    public void testAssertFalse() {
    	cochef.acelerar(-1);
        Assert.assertFalse("El coche no debe tener velocidad negativa", coche.getVelocidad() < 0);
        Assert.assertFalse("El coche no debe tener velocidad negativa", cochef.getVelocidad() < 0);
    }

    @Test
    public void testAssertNotNull() {
        Assert.assertNotNull("El coche no debe ser nulo", coche);
        Assert.assertNotNull("El coche2 no debe ser nulo", coche2);
        
    }
    @Test
    public void testAssertNull() {
        Coche cocheNull = null;
        Assert.assertNull("El coche debe ser nulo", cocheNull);
    }

    @Test
    public void testAssertSame() {
        Coche otroCoche = coche;
        Assert.assertSame("Las referencias de coche y otroCoche deben apuntar al mismo objeto", coche, otroCoche);
    }

    @Test
    public void testAssertNotSame() {
        Coche otroCoche = new Coche("Toyota");
        Assert.assertNotSame("Las referencias de coche y otroCoche no deben apuntar al mismo objeto", coche, otroCoche);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expectedVelocities = {0, 10, 20};
        coche.acelerar(10);
        coche.acelerar(10);
        int[] actualVelocities = {coche.getVelocidad() - 20, coche.getVelocidad() - 10, coche.getVelocidad()};
        Assert.assertArrayEquals("Los arrays de velocidades esperadas y actuales deben ser iguales", expectedVelocities, actualVelocities);
    }

    
}

