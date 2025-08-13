package primerasClases;

public class UsoVariablesYConstantes {

    public static void main (String[] args) {
        int edad = 37;
        String nombre = "Jorge";

        System.out.println(nombre + " tiene "+ edad + " años");

        // Declaración multiple de variables
        int operador1, operador2, operador3;
        int a, b = 10; // Solo está inicializada la b


        // Para declarar una constante se usa final
        final int ejemplo;
        final int ejemplo2 = 10;

        final int akilometros = 1000;
        int kilometros = 4;

        int resultado = kilometros * akilometros;

        System.out.println("En "+ akilometros + " kilometros, hay " + resultado + " metros");
    }
}
