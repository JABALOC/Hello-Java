package primerasClases;

import javax.swing.*;

public class Arrays {

    public static void main (String[] args) {

        // Sintaxis

        int[] miArray = new int[5];

        miArray[0] = 15;
        miArray[1] = 25;
        miArray[2] = 8;
        miArray[3] = -7;
        miArray[4] = 92;

        // Alternativa

        int[] miArray2 = { 23, 5, 18, -734, 77};

        // Para imprimir el contenido de los Arrays se hace así

        System.out.println(miArray[0]);
        System.out.println(miArray[1]);
        System.out.println(miArray[2]);
        System.out.println(miArray[3]);
        System.out.println(miArray[4]);

        System.out.println(" ");
        // Para evitar imprimirlo uno a uno, es mejor usar el bucle for

        for (int i = 0; i < miArray2.length; i++) {
            System.out.println(miArray2[i]);
        }

        System.out.println(" ");

        // Uso del bucle for-each

        String[] paises = {"España", "Alemania", "Francia", "Rumanía", "Rusia", "China", "Japón", "Suiza"};

        /*for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);*/
        for (String elemento : paises) {
            System.out.println(elemento);
        }

        System.out.println(" ");
        //Arrays bidimensionales

        int[][] nuevoArray = new int[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++){
                nuevoArray[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));
            }

        }
        for (int i = 0; i < nuevoArray.length; i++) {
            for (int j = 0; j < nuevoArray[i].length; j++) {
                System.out.print(nuevoArray[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println(" ");
        // Sintáxis alternativa para declarar arrays de dos dimensiones

        int[][] arrBid = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        for (int i = 0; i < arrBid.length; i++ ) {
            for (int j = 0; j < arrBid[i].length; j++) {
                System.out.print(arrBid[i][j] + " ");
            }
            System.out.println(" ");
        }
        // Otra manera de imprimir el bucle
        for (int[] fila : arrBid) {
            System.out.println();
            for (int z : fila) {
                System.out.print(z + " ");
            }
        }


    }
}
