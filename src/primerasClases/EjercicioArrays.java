package primerasClases;

import javax.swing.*;
import java.util.Enumeration;

public class EjercicioArrays {

    public static void main(String[] args) {

        String[] paises = new String[9];

        for (int i = 0; i < 9; i++) {
            String pais = JOptionPane.showInputDialog("Introduce un país");
            paises[i] = pais;
        }
        for (String elemento : paises) {
            System.out.println(elemento);
        }


        System.out.println(" ");

        int[] almacen = new int[199];

        for (int i = 0; i < 199; i++) {
            int numAleatorio = (int)(Math.random() * 100);
            almacen[i] = numAleatorio;
        }

        for (int elemento : almacen) {
            System.out.println(elemento);
        }


    }
}
