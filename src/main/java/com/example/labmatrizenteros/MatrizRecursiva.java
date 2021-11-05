package com.example.labmatrizenteros;

import java.util.Random;

public class MatrizRecursiva {

    //Solo es necesaria una instancia de estos objetos.
    private static Random random = new Random();
    private static final String numeros = "abcdefghijklmñopqrstuvwxyzABCDEFGHIJKLMÑOPQRSTUVWXYZ";
    private static int numerico = numeros.length() - 1;
    private static int numero = (int)(Math.random()* 100 + 1);


    public static void main(String[] args) {
        char[][] soup = new char[5][5];

        for (int i = 0; i < soup.length; i++) {
            rellenarFila(soup, i, 0);
        }

        //Salida
        for (int i = 0; i < soup.length; i++) {
            StringBuilder fila = new StringBuilder();
            fila.append("Fila " + i + ": ");
            for (int j = 0; j < soup.length; j++) {
                fila.append(soup[i][j]);
                fila.append(",");
            }
            System.out.println(fila);
        }

    }

    public static void rellenarFila(char[][] soup, int i, int j) {
        soup[i][j] = numeros.charAt(random.nextInt(numero));
        if (j < soup[i].length - 1) {
            rellenarFila(soup, i, j + 1);
        }
    }
}