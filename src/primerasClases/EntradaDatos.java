package primerasClases;

import javax.swing.*;
import java.util.*;

public class EntradaDatos {

    public static void main (String[] args) {

        /* Clase Scanner */

        // Scanner es la clase
        // entrada nombre del objeto Scanner
        // new Scanner instancia de la clase Scanner
        // System.in para especificar que va a ser una entrada al sistema. Hasta ahora siempre hemos ejecutado
        // una salida mediante System.out
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = entrada.nextLine(); // Leemos la línea completa de texto
        System.out.println("Introduce tu edad");
        int edad = entrada.nextInt(); // Leemos un número entero
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

        // Si no cerramos el Scanner entrada, esto consume recursos, po lo que sería recomendable cerralo
        // para cerrar este Scanner se hace de la siguiente manera:
        entrada.close();


        /* JOptionPane.showInputDialog */

        String mensaje = JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println("Tu nombre es " + mensaje);
        // En este caso, vamos a pedir la edad, pero la clase JOptionPane almacena solo String, por lo que si
        // intentamos almacenar la edad en un int, nos da fallo
        String tuEdad = JOptionPane.showInputDialog("Introduce tu edad");
        System.out.println("Dentro de tres años tendrás " + (tuEdad + 3)); // salida Dentro de tres años tendrás 373
        // Para poder hacer esto, existe una clase que es ParseInt
        int tuEdad2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        System.out.println("Dentro de tres años tendrás " + (tuEdad2 + 3)); // salida Dentro de tres años tendrás 40

        //int tuEdad2 = Integer.parseInt(JOpt...)
        // parseInt al ser un método static hay que poner la clase Integer delante.
        // también se puede importat al principio poniendo import static java.lang.Integer.parseInt
        // y ya no haría falta ponerlo en en el código.
    }
}
