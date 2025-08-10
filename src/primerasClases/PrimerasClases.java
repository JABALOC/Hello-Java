package primerasClases;

public class PrimerasClases {
    public static void main (String[] args) {
        int edad;
        edad = 37;
        String nombre = "Jorge";

        System.out.println(edad);
        System.out.println("Mi nombre es " + nombre);

        edad = 15;
        edad++;
        System.out.println(edad);

        edad+=10;
        System.out.println(edad);

        int num1 = 5;
        int num2 = 2;

        double resultado = num1/num2;
        System.out.println(resultado); // salida 2.0
        /* La salida es 2.0 porque internamente lo que hace es dividir los dos
        números enteros y después ya almacenarlos en la variable resultado
         */
    }
}
