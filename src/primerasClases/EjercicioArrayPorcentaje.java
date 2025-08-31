package primerasClases;

public class EjercicioArrayPorcentaje {

    public static void main (String[] args) {

        double saldo = 10000;
        double porcentaje = 10;
        double acumulado = 0;
        double vuelta = 0;

        double [][] arrTabla = new double[6][4];

        for (int i = 0; i < 6; i++) {
            acumulado = saldo + ((porcentaje / 100) * saldo);


            for (int j = 0; j < 4; j++) {
                arrTabla[i][j] = acumulado;
                vuelta = acumulado + ((porcentaje / 100) * acumulado);
                acumulado = vuelta;
            }
            acumulado = saldo;
            porcentaje++;


        }
        for (double[] fila : arrTabla) {
            for (double z : fila) {
                System.out.print(z + " ");
            }
            System.out.println();

        }


        System.out.println();
        System.out.println("repetir ejercicio");
        // Ejemplo pildoras

        double intereses = 0.1;
        double capital;

        double[][] tablaSaldo = new double[6][5];

        for (int i = 0; i < 6; i++) {
            tablaSaldo[i][0] = 10000;
            capital = 10000;
            for (int j = 1; j < 5; j++) {
                capital = capital + (capital * intereses);
                tablaSaldo[i][j] = capital;
            }
            intereses += 0.01;
        }

        for (double fila[] : tablaSaldo) {
            for (double z : fila) {
                System.out.printf("%.2f ",z);
            }
            System.out.println();

        }
    }
}
