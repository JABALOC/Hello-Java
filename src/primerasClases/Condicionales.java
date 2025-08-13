package primerasClases;

import java.util.Scanner;

public class Condicionales {
    public static void main (String[] args) {

    /* if */

        int tuEdad;

        Scanner edad = new Scanner(System.in);
        tuEdad = edad.nextInt();

        if (tuEdad > 18) {
            System.out.println("Eres mayor de edad");
        } else if (tuEdad < 18) {
            System.out.println("Eres menor de edad");
        }

        if (tuEdad <= 18) {
            System.out.println("Eres muy joven");
        }else if (tuEdad <= 37) {
            System.out.println("Eres joven");
        }else if (tuEdad <= 60) {
            System.out.println("Eres maduro");
        }else if (tuEdad <= 90) {
            System.out.println("Eres muy mayor");
        } else {
            System.out.println("Donde vas con esa edad");
        }


    /* switch */

        System.out.println("Introduce mes");
        Scanner num_mes = new Scanner(System.in);
        String mes = num_mes.nextLine().toLowerCase();

        switch (mes) {
            case "enero":
                System.out.println("Estamos en enero");
                break;
            case "febrero":
                System.out.println("Estamos en febrero");
                break;
            case "marzo":
                System.out.println("estamos en marzo");
                break;
            case "abril":
                System.out.println("estamos en abril");
                break;
            default:
                System.out.println("Estamos en otro mes");
        }

        System.out.println(" ");
    /* Nueva modalidad switch */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce día de la semana");
        String dia = entrada.nextLine().toLowerCase();

        String resultado_semana = switch (dia) {
            case "lunes" -> "laborable";
            case "martes" -> "laborable";
            case "miercoles" -> "laborable";
            case "jueves" -> "laborable";
            case "viernes" -> "laborable";
            default -> "festivo";
        };

        System.out.println("El mes de " + dia + " es " + resultado_semana);
        //Esto se podría simplificar uniendo los valores de cada case que sean identicos

        String entreSemana = switch (dia) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> "entre semana";
            case "sabado", "domingo"  -> "fin de semana";
            default -> "no sabes ni lo que dices";
        };

        if (dia.equalsIgnoreCase("lunes") ||
            dia.equalsIgnoreCase("martes") ||
            dia.equalsIgnoreCase("miercoles") ||
            dia.equalsIgnoreCase("jueves") ||
            dia.equalsIgnoreCase("viernes") ||
            dia.equalsIgnoreCase("sabado") ||
            dia.equalsIgnoreCase("domingo")) {
                System.out.println("El " + dia + " es " + entreSemana);
        } else {
            System.out.println(entreSemana);
        }

        System.out.println(" ");
    /* Uso de yield */
        // Con yield podemos devolver más de una línea dentro de un switch

        String usoYield = switch (dia) {
            case "lunes", "martes", "miercoles", "jueves", "viernes" -> {
                System.out.println("Entre semana");
                yield "de lunes a viernes";
            }
            case "sabado", "domingo" -> {
                System.out.println("Fin de semana");
                yield "Sabado o domingo";
            }
            default -> "No es un día de la semana";
        };

        System.out.println(usoYield);



        System.out.println(" ");
    /* Operador ternario */

        // sintaxis
        // (condición) ? "valor si es verdad" : "valor si no es verdad"

        String resultado = (tuEdad < 18) ? "Eres menor de edad" : "Eres mayor de edad";

        System.out.println(resultado);
    }
}
