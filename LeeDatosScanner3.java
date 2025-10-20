import java.util.Scanner;

public class LeeDatosScanner3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese 3 números (si quieres con decimales), separados por un espacio: ");

        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("La media de esos 3 numeros es: " + media);
    }
}
