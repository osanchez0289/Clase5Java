package com.mycompany.clase5;

public class Matriz {

    public static void main(String[] args) {
        int i, j;
        int matriz[][];
        matriz = new int[4][4];

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 9);
            }
        }
        

        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");

         
            }

            System.out.println(" ");
        }
    }
}
