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


        /** Bucles determinados **/
        // Sabes cuantas veces se va a repetir

    }
}
