package Ejercicios4;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve la media de tres notas e indica la condicion final");
        System.out.print("Por favor, introduzca la nota 1: ");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.print("Por favor, introduzca la nota 2: ");
        double nota2 = Double.parseDouble(System.console().readLine());
        System.out.print("Por favor, introduzca la nota 3: ");
        double nota3 = Double.parseDouble(System.console().readLine());

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media es: " + promedio);

        if (promedio >= 1 && promedio <= 10) {
            System.out.println("Calificación: Insuficiente");
        } else if (promedio >= 11 && promedio <= 12) {
            System.out.println("Calificación: Suficiente");
        } else if (promedio >= 13 && promedio <= 15) {
            System.out.println("Calificación: Bien");
        } else if (promedio >= 16 && promedio <= 20) {
            System.out.println("Calificación: Notable / Sobresaliente");
        } else {
            System.out.println("La nota ingresada está fuera de rango.");
        }

    }
}
