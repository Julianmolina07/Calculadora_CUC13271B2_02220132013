package Calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Test
    public void testPunto() {
        System.out.println("Punto");
        String cadena = "3.14";
        boolean expResult = true;
        boolean result = Calculadora.Punto(cadena);
        assertEquals(expResult, result);
        System.out.println("Resultado = " + result);
    }
    
    @Test
    public void testSuma() {
        System.out.println("Suma");
        String Numero = "5";
        String Signo = "+";
        String Numero1 = "3";
        String expResult = "8.0";
        String result = Calculadora.Respuesta(Numero, Signo, Numero1);
        assertEquals(expResult, result);
        System.out.println("Resultado = " + result);
    }

    @Test
    public void testResta() {
        System.out.println("Resta");
        String Numero = "10";
        String Signo = "-";
        String Numero1 = "3";
        String expResult = "7.0";
        String result = Calculadora.Respuesta(Numero, Signo, Numero1);
        assertEquals(expResult, result);
        System.out.println("Resultado = " + result);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("Multiplicacion");
        String Numero = "5";
        String Signo = "*";
        String Numero1 = "4";
        String expResult = "20.0";
        String result = Calculadora.Respuesta(Numero, Signo, Numero1);
        assertEquals(expResult, result);
        System.out.println("Resultado = " + result);
    }

    @Test
    public void testDivision() {
        System.out.println("Division");
        String Numero = "20";
        String Signo = "/";
        String Numero1 = "4";
        String expResult = "5.0";
        String result = Calculadora.Respuesta(Numero, Signo, Numero1);
        assertEquals(expResult, result);
        System.out.print("Resultado = " + result);
    }
    
}