package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculadoraTest extends Calculadora {

    @Test
    public void somar() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);
    }

    @Test
    public void testeSomarComMock() {
        Calculadora calc = mock(Calculadora.class);
        when(calc.somar("1+2")).thenReturn(10);

        int resultado = calc.somar("1+2");
        assertEquals(10, resultado);

    }
}