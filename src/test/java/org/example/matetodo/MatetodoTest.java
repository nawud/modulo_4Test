package org.example.matetodoTest;

import org.example.matetodo.Matetodo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatetodoTest {


    private final Matetodo matetodo = new Matetodo();

    @Test
    public void sumar_num_pasaTest() {
        // Arrange
        float num1 = 10;
        float num2 = 20;

        // Act
        float resultado = matetodo.sumar(num1, num2);

        // Assert
        assertEquals(30, resultado);
    }

    @Test
    public void sumarImparesConsecutivos_limite5_retornaSumaCorrecta() {
        // Arrange
        int limite = 5;

        // Act
        int resultado = matetodo.sumarImparesConsecutivos(limite);

        // Assert
        assertEquals(9, resultado); // 1 + 3 + 5 = 9
    }

    @Test
    public void sumarImparesConsecutivos_limite10_retornaSumaCorrecta() {
        // Arrange
        int limite = 10;

        // Act
        int resultado = matetodo.sumarImparesConsecutivos(limite);

        // Assert
        assertEquals(25, resultado); // 1 + 3 + 5 + 7 + 9 = 25
    }

    @Test
    public void sumarImparesConsecutivos_limite1_retornaSumaCorrecta() {
        // Arrange
        int limite = 1;

        // Act
        int resultado = matetodo.sumarImparesConsecutivos(limite);

        // Assert
        assertEquals(1, resultado); // Solo hay un número impar: 1
    }

    @Test
    public void sumarImparesConsecutivos_limiteNegativo_retornaCero() {
        // Arrange
        int limite = -5;

        // Act
        int resultado = matetodo.sumarImparesConsecutivos(limite);

        // Assert
        assertEquals(0, resultado); // No hay números impares positivos en un rango negativo
    }
}
