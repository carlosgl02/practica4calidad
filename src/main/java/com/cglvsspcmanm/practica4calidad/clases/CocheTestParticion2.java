package com.cglvsspcmanm.practica4calidad.clases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CocheTestParticion2 {
	
	private Coche coche;

    @Before
    public void setUp() {
        coche = new Coche("Toyota");
    }
    
    @Test
    public void getMarcaRetornaMarcaCorrecta() {
        // Partición de prueba para método que no modifica ningún atributo.
        Assert.assertEquals("La marca del coche debe ser 'Toyota'.", "Toyota", coche.getMarca());
    }

}
