package com.example.labmatrizenteros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class LabMatrizEnterosApplication {

    private static Random random = new Random();
    private static int numero = (int)(Math.random()* 100 + 1);

    public static void main(String[] args) {
        int[][] soup = new int[3][5];

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

    public static void rellenarFila(int[][] soup, int i, int j) {
        soup[i][j] = random.nextInt(numero);
        if (j < soup[i].length - 1) {
            rellenarFila(soup, i, j + 1);
        }
    }
}
