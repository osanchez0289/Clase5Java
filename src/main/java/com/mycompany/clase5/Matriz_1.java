package com.mycompany.clase5;

public class Matriz_1 {

    public static void main(String[] args) {
        int i, j, suma = 0;
        int matriz[][], matriz2[][];
        matriz = new int[3][3]; matriz2=new int [3][3];

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                matriz[i][j] =(int) Math.floor(Math.random() * 9);
            }
        }
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                if (i == 0) {
                    if (j == 0) {
                        matriz2[j][i] = matriz[2][0];
                    } else {
                        if (j == 2) {
                            matriz2[j][i] = matriz[0][0];
                        } else {
                            matriz2[j][i] = matriz[j][i];
                        }
                    }
                } else {
                    if (i == 2) {
                        if (j == 0) {
                            matriz2[j][i] = matriz[2][2];
                        } else {
                            if (j == 2) {
                                matriz2[j][i] = matriz[0][2];
                            } else {
                                matriz2[j][i] = matriz[j][i];
                            }
                        }
                    } else {
                        matriz2[j][i] = matriz[j][i];
                    }
                }
            }
        }
        for (i = 0; i <= 2; i++) {
            suma = matriz[0][i] + matriz[1][i] + matriz[2][i];
            System.out.println("  " + matriz[0][i] + " " + matriz[1][i] + "  " + matriz[2][i] + "  =  " + suma);
        }
        System.out.println("---------------");
        for (i = 0; i <= 2; i++) {
            suma = matriz[i][0] + matriz[i][1] + matriz[i][2];
            System.out.print(" " + suma + " ");
        }
        System.out.println(" ");
        System.out.println("---------------------------");
        System.out.println("Matriz invertida");
        for (i=0;i<=2;i++) {
			for (j=0;j<=2;j++) {
				System.out.print(matriz2[j][i]+" ");
			}
			System.out.println(" ");
        }
    }
}


