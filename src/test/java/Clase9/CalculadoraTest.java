package Clase9;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    final Calculadora calc = new Calculadora();

    @Test
    void sumar() {
        assertEquals(110, (calc.sumar(150,180)) / 3);
        assertNotEquals(2700, (calc.sumar(70,40)) * 25);
    }

    @Test
    void restar() {
        assertNotEquals(605, (calc.restar(90,50))*15);
    }

    @Test
    void multiplicar() {
        assertEquals(240, calc.multiplicar(80,3));
    }

    @Test
    void dividir() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(8,0));
        assertEquals(6.5, calc.dividir(13,2));
    }
}