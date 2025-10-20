package Ejercicios3;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num1, num2, mul;

        System.out.println("Ingrese el primer número: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.parseInt(System.console().readLine());

        mul = num1 * num2;

        System.out.println("El producto de los numeros es: " + mul);
    }
}
