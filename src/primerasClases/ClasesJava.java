package primerasClases;

import java.math.*;

public class ClasesJava {

    public static void main (String[] args) {

        // Las clases en java se dividen en dos grupos. Propias y predefinidas
        // Las clases predefinidas, se organizan en API Java

        // Siempre que vayamos a usar un método y este sea static tenemos que poner la clase delante
        // Por ejemplo sqrt es static double
        // Quiere decir que devuelve un double y static quiere decir que hay que poner Math.sqrt

        // int raiz = Math.sqrt(9); -> Esto nos da error porque como hemos visto antes, devuelve
        // Un double y estamos diciendo que lo almacene en un int

        /* Clase Math */

        double raiz = Math.sqrt(3);
        System.out.println(raiz);

        // Otra opción es hacer un casting (o conversión explicita)
        int raiz2 = (int)Math.sqrt(3);
        System.out.println(raiz2);

        int potencia = (int)Math.pow(3, 4);
        System.out.println(potencia);

        // La clase Math pertenece a java.lang que al ser de las clases principales no hace
        // falta importarlo. Pero si queremos usar, por ejemplo, la clase BigInteger, pertenece al
        // paquete java.math (que no es lo mismo que la clase Math) tenemos que importarla
        // Para ello ponemos import java.math.BigInteger al comienzo del fichero.
        // O podemos importar todas las clases de java.math usando un * import java.math.*;

        BigInteger base = BigInteger.valueOf(25);
        int exponente = 321;
        BigInteger potencia2 = base.pow(exponente);
        System.out.println(potencia2);

        System.out.println(" ");

        double numeroPi = Math.PI;
        BigDecimal numeroGrande = BigDecimal.valueOf(numeroPi);

        System.out.println(numeroGrande);

        System.out.println(" ");

        double numeroAleatorio = Math.random();
        System.out.println(Math.round(numeroAleatorio * 100));

        int absoluto = Math.abs(-45);
        System.out.println(absoluto);

        int mayor = Math.max(4, 9);
        System.out.println(mayor);


        System.out.println(" ");

        /* Clase String */

        String nombre = "Jorge"; // nombre es una instancia de la clase String
        // Por lo que ahora se podrían usar los métodos de la clase String usando el objeto de la
        // clase nombre
        System.out.println(nombre.toUpperCase());

        // Los métodos más importantes de String
        // length() -> Devuelve la longitud de una cadena
        String cadena = "Esto es una cadena";
        System.out.println(cadena.length());
        // charAt(n) -> Devuelve la posición de un caracter dentro de la cadena
        System.out.println(cadena.charAt(8));
        // substrings(x, y) -> Devuelve una subcadena dentro de la cadena, siendo X el carácter
        // a partir del cual se extrae e Y el nº de caracteres que se quieren extraer.
        System.out.println(cadena.substring(8, 11));
        // equals(cadena) -> Devuelve true si dos cadenas que se comparan son iguales y false si no lo son.
        System.out.println(nombre.equals(cadena));
        // equalsIgnoreCase(cadena) -> igual que equals(cadena) pero sin tener en cuenta mayúsculas y minúsculas
        String comparacion = "comparación";
        String comparacion2 = "COMPARACIÓN";

        System.out.println(comparacion.equals(comparacion2)); // false
        System.out.println(comparacion.equalsIgnoreCase(comparacion2)); // true

    }
}
