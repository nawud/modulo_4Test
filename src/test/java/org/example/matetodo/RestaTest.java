package org.example.matetodo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaTest {
    // Operacion de una resta
    @Test
    public void testRestar_numerosPositivos_retornaResultadoCorrecto() {
        // Arrange
        Matetodo matetodo = new Matetodo();
        float numero1 = 10.5f;
        float numero2 = 4.3f;

        // Act
        float resultado = matetodo.restar(numero1, numero2);

        // Assert
        assertEquals(6.2f, resultado);
    }

    @Test
    public void testRestar_numerosNegativos_retornaResultadoCorrecto() {
        // Arrange
        Matetodo matetodo = new Matetodo();
        float numero1 = -8.5f;
        float numero2 = -3.5f;

        // Act
        float resultado = matetodo.restar(numero1, numero2);

        // Assert
        assertEquals(-5.0f, resultado);
    }

    @Test
    public void testRestar_numeroPositivoYNegativo_retornaResultadoCorrecto() {
        // Arrange
        Matetodo matetodo = new Matetodo();
        float numero1 = 9;
        float numero2 = 4;

        // Act
        float resultado = matetodo.restar(numero1, numero2);

        // Assert
        assertEquals(5, resultado);
    }
}
