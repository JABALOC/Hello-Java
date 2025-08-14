package primerasClases;

import javax.swing.*;

public class EjercicioNumAleatorio {

    public static void main (String[] args) {

        int numAleatorio = (int)(Math.random() * 101);
        System.out.println(numAleatorio);
        int numElegido = -1;
        int contador = 0;

        System.out.println("Introduce un número aleatorio entre 0 y 100");

        while (numElegido != numAleatorio) {
            numElegido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            contador++;
            if (numElegido < numAleatorio) {
                System.out.println("El número que has elegido (" + numElegido + ") es menor");
                System.out.println(numAleatorio);
            } else if (numElegido > numAleatorio) {
                System.out.println("El número que has elegido (" + numElegido + ") es mayor");
                System.out.println(numAleatorio);
            }
        }

        System.out.println("Correcto, has acertado el número en " + contador + " intentos");


    }
}
