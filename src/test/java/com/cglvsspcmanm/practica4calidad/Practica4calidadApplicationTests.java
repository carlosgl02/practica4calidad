package com.cglvsspcmanm.practica4calidad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cglvsspcmanm.practica4calidad.clases.Coche;

@SpringBootTest
class Practica4calidadApplicationTests {

    private Coche coche;
    private Coche cochef;
    private Coche coche2;
    
    @Before
    public void setUp() {
        coche = new Coche("Toyota");
        cochef = new Coche("Opel");
    }
    
	@Test
	void contextLoads() {
	}
	
    @Test
    public void testAssertEquals() {
        coche.acelerar(50);
        cochef.acelerar(500);
        Assert.assertEquals("La velocidad después de acelerar debería ser igual a 50", 50, coche.getVelocidad());
        Assert.assertEquals("La velocidad después de acelerar debería ser igual a 50", 50, cochef.getVelocidad());
    }

}
