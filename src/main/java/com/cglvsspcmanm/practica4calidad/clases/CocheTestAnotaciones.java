package com.cglvsspcmanm.practica4calidad.clases;
import org.junit.*;
public class CocheTestAnotaciones {
    private static Coche coche;

    // Este método se ejecuta una vez, antes de cualquier prueba en esta clase.
    @BeforeClass
    public static void inicioDeClase() {
        System.out.println("Inicio de las pruebas de la clase CocheTest.");
        coche = new Coche("Toyota");
    }

    // Este método se ejecuta antes de cada prueba individual.
    @Before
    public void setUp() {
        System.out.println("Configuración para una nueva prueba.");
        coche.acelerar(-coche.getVelocidad()); 
    }

    // Este método se ejecuta después de cada prueba individual.
    @After
    public void tearDown() {
        System.out.println("Limpieza después de una prueba.");
    }

    // Este método se ejecuta una vez, después de todas las pruebas de esta clase.
    @AfterClass
    public static void finDeClase() {
        System.out.println("Todas las pruebas se han completado.");
    }

    // Ejemplo de un método de prueba.
    @Test
    public void cuandoAceleraIncrementaVelocidad() {
        coche.acelerar(50);
        Assert.assertEquals("La velocidad debe incrementarse en 50.", 50, coche.getVelocidad());
    }

    // Ejemplo de un método de prueba ignorado.
    @Ignore
    @Test
    public void estaPruebaNoSeEjecutara() {
        Assert.assertEquals("Este test está ignorado, por lo que no fallará aunque la condición sea falsa.", 0, 1);
    }
}
