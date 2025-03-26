package org.example.matetodo;

public class Matetodo {

    public float sumar(float n1, float n2) {
        return n1 + n2;
    }


    public int sumarImparesConsecutivos(int limite) {
        int suma = 0;
        for (int i = 1; i <= limite; i += 2) {
            suma += i;
        }
        return suma;
    }





}