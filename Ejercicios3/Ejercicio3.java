package Ejercicios3;

public class Ejercicio3 {
    public static void main(String[] args) {
        final double EURO = 3.94;

        double euros;
        int soles = 0;

        System.out.println("Ingrese la cantidad en soles : ");
        soles = Integer.parseInt(System.console().readLine());

        euros = soles / EURO;

        System.out.printf("La cantidad en euros es :  %.3f", euros);
    }
}
