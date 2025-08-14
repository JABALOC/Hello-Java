package primerasClases;

import javax.swing.*;

public class EjercicioFor {

    public static void main (String[] args) {

        String mail = JOptionPane.showInputDialog("Introduce tu correo electrónico");
        boolean arroba = false;
        int countArroba = 0;
        boolean punto = false;

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '.') {
                punto = true;
            }
            if ((mail.charAt(i) == '@')) {
                countArroba++;
                if (countArroba == 1){
                    arroba = true;
                } else if (countArroba > 1) {
                    arroba = false;
                }
            }
        }
        if (arroba && punto) {
            System.out.println("mail correcto");
        } else {
            System.out.println("mail incorrecto");
        }

        System.out.println(arroba);

    }
}
