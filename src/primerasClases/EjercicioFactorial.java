package primerasClases;

import javax.swing.*;
import java.math.BigInteger;

public class EjercicioFactorial {

    public static void main (String[] args) {

        int numElegido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        BigInteger acumulado = BigInteger.ONE;

        for (int i = numElegido; i > 0; i--) {
            acumulado = acumulado.multiply(BigInteger.valueOf(i));
        }

        System.out.println("El factorial del número que has elegido es: "+ acumulado);
    }
}
