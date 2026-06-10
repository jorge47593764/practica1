package test60.test60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class AppTest {



    @Test

    void casoCorrecto1() {

        assertTrue(App.esPalindromo("radar"));

    }



    @Test

    void casoCorrecto2() {

        assertFalse(App.esPalindromo("java"));

    }



    @Test

    void casoIncorrecto1() {

        assertTrue(App.esPalindromo("Radar"));

    }



    @Test

    void casoIncorrecto2() {

        assertTrue(App.esPalindromo("Dabale arroz a la zorra el abad"));

    }



    @Test

    void casoLimite() {

    	assertTrue(App.esPalindromo("")); // o assertFalse según corresponda

    }

}