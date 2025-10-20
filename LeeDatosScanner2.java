import java.util.Scanner;

public class LeeDatosScanner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce tu nombre y edad separado por un espacio: ");
        String nombre = s.next();
        int edad = s.nextInt();

        System.out.println("Tu nombre: " + nombre + " y tu edad es: " + edad);
    }
}
