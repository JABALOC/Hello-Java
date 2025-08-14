package primerasClases;

import javax.swing.*;

public class EjercicioPeso {

    public static void main (String[] args) {


        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
        String genero = "";
        while ((!genero.equalsIgnoreCase("m")) && (!genero.equalsIgnoreCase("h"))) {
            genero = JOptionPane.showInputDialog("Introduce tu genero H/M");
        }
        if (genero.equalsIgnoreCase("m")) {
            System.out.println("Tu peso ideal es: " + (altura - 120));
        } else if (genero.equalsIgnoreCase("h")) {
            System.out.println("tu peso ideal es: " + (altura - 110));
        }

        String mensaje = switch (genero) {
           case "h" -> "en switch sale que tu peso ideal es: " + (altura - 110);
           case "m" -> "en switch sale que tu peso ideal es: " + (altura - 120);
           default -> "No has introducido un peso correcto";
        };

        System.out.println(mensaje);


        //Hombre 180-110 =70
        //Mujer 160-120 = 40
        //Usando JOptionPane
        //Para hombre H,h
        //Para mujer M,m
        //Cualquier otra cosa hará que la ventana vuelva a salir




    }
}
