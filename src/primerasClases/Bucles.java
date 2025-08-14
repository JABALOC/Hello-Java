package primerasClases;

import javax.swing.*;

public class Bucles {

    public static void main (String[] args) {

        /** Bucles indeterminados **/
        // No sabes cuantas veces se va a repetir

        /* While */

        String password = "";
        String clave = "lunes";

        while (!password.equalsIgnoreCase(clave)) {
            password = JOptionPane.showInputDialog("Introduce una contraseña");
        }
        System.out.println("Contraseña correcta");


        /* Do while */
        // Con do while nos aseguramos que al menos una vez entre en el bucle sí o sí.

        int numeroEjemplo = 0;

        do {
            numeroEjemplo++;
            System.out.println("numeroEjemplo es " + numeroEjemplo);

        } while (numeroEjemplo < 5);

        /** Bucles determinados **/
        // Sabes cuantas veces se va a repetir

        /* bucle for */

        for (int i = 10; i > 0; i--) {
            System.out.println("Cuenta atras: " + i);
        }
        System.out.println("  ¡¡BOOOM!!  ");
    }
}
