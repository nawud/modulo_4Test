package org.example.matetodo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertEquals(9, resultado);
    }

    @Test
    public void sumarImparesConsecutivos_limite10_retornaSumaCorrecta() {
        // Arrange
        int limite = 10;

        // Act
        int resultado = matetodo.sumarImparesConsecutivos(limite);

        // Assert
        assertEquals(25, resultado);
    }

    @Test
    public void sumarImparesConsecutivos_limite1_retornaSumaCorrecta() {
        // Arrange
        int limite = 1;

        // Act
        int resultado = matetodo.sumarImparesConsecutivos(limite);

        // Assert
        assertEquals(1, resultado);
    }

    @Test
    public void sumarImparesConsecutivos_limiteNegativo_retornaCero() {
        // Arrange
        int limite = -5;

        // Act
        int resultado = matetodo.sumarImparesConsecutivos(limite);

        // Assert
        assertEquals(0, resultado);
    }


}
