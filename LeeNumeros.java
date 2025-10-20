public class LeeNumeros {
    public static void main(String[] args) {
       
        System.out.println("Por favor, introduce un número: ");
        int primerNumero = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce otro número: ");
        int segundoNumero = Integer.parseInt( System.console().readLine());

        int total = (2 * primerNumero) + segundoNumero;

        System.out.println("El primer número: "+primerNumero);
        System.out.println("El segundo número: "+segundoNumero);
        System.out.println("El doble del primer número más el segundo número es: "+total);
    }
}
