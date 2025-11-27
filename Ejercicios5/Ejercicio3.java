package Ejercicios5;

public class Ejercicio3 {
    public static void main(String[] args) {
        // do while
        int i = 0;

        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 101);
    }
}
