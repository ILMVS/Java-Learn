package org.LMVS.JUnitProject.calculadora;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtensionContext;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @BeforeAll
    static void initAll() {
        System.out.println("Iniciando pruebas de la calculadora...");
    }
    @AfterAll
    static void tearDownAll() {
        System.out.println("Todas las pruebas de la calculadora han finalizado.");
    }


    @BeforeEach
    void setUp(TestInfo testInfo) {
        System.out.println("La prueba " + testInfo.getDisplayName() + " está iniciando.");
    }

    @AfterEach
    void tearDown(TestInfo testInfo)
    {
        System.out.println("La prueba " + testInfo.getDisplayName() + " ha finalizado.");
    } 

    @Test
    @DisplayName("Test de sumar")
    void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
        assertNotEquals(2, calculadora.sumar(-1, 1));
    }



    @Test
    @DisplayName( "Test de división")
//    @Disabled("Test de división deshabilitado temporalmente")
    void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertTrue( calculadora.dividir(6, 2) == 3);
        assertFalse( calculadora.dividir(6, 2) == 5);

    }
    @Test
    @DisplayName("Test dividir error")
    void testDividirError() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(1, 0), "No se puede dividir por cero");
    }

    @Test
    public void arregloTest() {
        int[] arreglo = {1, 2, 3, 4, 5};

        //compara el contenido del arreglo
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arreglo);
        assertNotEquals(new int[]{1, 2, 3}, arreglo);
    }
    @Test
    @DisplayName("Test de multiplicación")
    void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertSame(20, calculadora.multiplicar(4, 5), "La multiplicación debe ser 20");
        assertNotSame(16, calculadora.multiplicar(3, 5), "La multiplicación no debe ser 15");
    }

    @Test
    @DisplayName("Test de resta")
    void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertAll("Operaciones de resta",
                () -> assertEquals(1, calculadora.restar(3, 2), "3 - 2 debe ser 1"),
                () -> assertEquals(-1, calculadora.restar(2, 3), "2 - 3 debe ser -1"),
                () -> assertDoesNotThrow( () -> calculadora.restar(5, 2), "No debe lanzar excepción al restar 5 y 2" )
        );
    }


}