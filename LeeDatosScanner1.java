import java.util.Scanner;

public class LeeDatosScanner1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = s.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = Integer.parseInt(s.nextLine());

        System.out.println("Tu nombre: " + nombre + " y tu edad es: " + edad);
    }
}
