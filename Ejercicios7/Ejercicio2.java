package Ejercicios7;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Nro " + (i + 1) + ": ");
            num[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("Los número en orden inverso: ");

        for (int i = 9; i >= 0; i--) {
            System.out.print("Nro " + (i + 1) + ": "+num[i] + "\n");
        }
    }
}
