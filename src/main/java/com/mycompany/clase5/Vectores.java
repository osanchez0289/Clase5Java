
package com.mycompany.clase5;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dato[];
        int dato1[];
        int dato2[];
        int i;
        String respuesta;
        int sumavector = 0, sumavector1 = 0, sumavector2 = 0;
        double promedio = 0, promedio1 = 0, promedio2 = 0;
        int vectormayor = 0, vectormayor1 = 0, vectormayor2 = 0, vectormenor = 51, vectormenor1 = 51, vectormenor2 = 51;
        dato = new int[10];
        dato1 = new int[20];
        dato2 = new int[30];
        respuesta = "s";

        while (respuesta.equals("s") || respuesta.equals("S")) {
            System.out.println("Empieza el primer vector");
            for (i = 0; i <= 9; i++) {

                dato[i] = (int) Math.floor(Math.random() * 50);
                if (dato[i] > vectormayor) {
                    vectormayor = dato[i];
                } else {
                }
                if (dato[i] < vectormenor) {
                    vectormenor = dato[i];
                }

                System.out.println(i + 1 + ")" + "corresponde a" + dato[i]);
            }

            System.out.println("Digite la posicion que desea cambiar");
            i = entrada.nextInt();

            System.out.println("Escriba el nuevo valor");
            dato[i - 1] = entrada.nextInt();

            for (i = 0; i <= 9; i++) {
                sumavector = sumavector + dato[i];
                promedio = sumavector / 10;

                System.out.println(i + 1 + ")" + "corresponde a " + dato[i]);

            }

            System.out.println("Empieza vector 2");
            for (i = 0; i <= 19; i++) {
                dato1[i] = (int) Math.floor(Math.random() * 100);
                sumavector1 = sumavector1 + dato1[i];
                promedio1 = sumavector1 / 20;
                if (dato1[i] > vectormayor1) {
                    vectormayor1 = dato1[i];
                } else {
                }
                if (dato1[i] < vectormenor1) {
                    vectormenor1 = dato1[i];
                }
                System.out.println(i + 1 + ")" + "corresponde a " + dato1[i]);
            }

            System.out.println("Empieza vector 3");
            for (i = 0; i <= 29; i++) {
                dato2[i] = (int) Math.floor(Math.random() * 200);
                sumavector2 = sumavector2 + dato2[i];
                promedio2 = sumavector2 / 30;
                if (dato2[i] > vectormayor2) {
                    vectormayor2 = dato2[i];
                } else {
                }
                if (dato2[i] < vectormenor2) {
                    vectormenor2 = dato2[i];
                }
                System.out.println(i + 1 + ")" + "corresponde a " + dato2[i]);

            }

            System.out.println("Desea continuar");
            respuesta = entrada.nextLine();
        }//fin while
        System.out.println("El dato mayor del vector 1 es: " + vectormayor);
        System.out.println("El dato menor del vector 1 es: " + vectormenor);
        System.out.println(("La suma de los numero de vector 1 es de: ") + sumavector);
        System.out.println("El promedio de vector 1 es de: " + promedio);
        System.out.println("-----------------------------------------------");

        System.out.println("El dato mayor del vector 2 es: " + vectormayor1);
        System.out.println("El dato menor del vector 2 es: " + vectormenor1);
        System.out.println(("La suma de los numero de vector 2 es de: ") + sumavector1);
        System.out.println("El promedio de vector 2 es de: " + promedio1);
        System.out.println("-----------------------------------------------");

        System.out.println("El dato mayor del vector 3 es: " + vectormayor2);
        System.out.println("El dato menor del vector 3 es: " + vectormenor2);
        System.out.println(("La suma de los numero de vector 3 es de: ") + sumavector2);
        System.out.println("El promedio de vector 3 es de: " + promedio2);
        System.out.println("-----------------------------------------------");

    }

}
