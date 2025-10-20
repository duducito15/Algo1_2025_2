package Ejercicios3;

public class Ejercicio2 {
    public static void main(String[] args) {
        final double EURO = 3.90;

        int euros;
        double soles;

        System.out.println("Ingrese la cantidad en euros : ");
        euros = Integer.parseInt(System.console().readLine());

        soles = euros * EURO;

        System.out.println("Ingrese la cantidad en soles es : " + soles);

    }
}
