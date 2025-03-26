package org.example.matetodo;

public class Resta {
    public float restar(float n1, float n2) {
        return n1 - n2;
    }

    public int restarParesConsecutivos(int limite) {
        int resta = 0;
        boolean primerParEncontrado = false;

        for (int i = 2; i <= limite; i += 2) {
            if (!primerParEncontrado) {
                resta = i;
                primerParEncontrado = true;
            } else {
                resta -= i;
            }
        }

        return resta;
    }
}
