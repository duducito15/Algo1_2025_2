public class TerminaCuandoNo {
    public static void main(String[] args) {
        int numero;
        String continuar = "s";

        do {
            System.out.print("Dime un número: ");
            numero = Integer.parseInt(System.console().readLine());

            // Muestra si es par o impar, pero acepta cualquier número
            if (numero % 2 == 0) {
                System.out.println("Qué bonito es el " + numero);
            } else {
                System.out.println("Has introducido un número impar: " + numero);
            }

            System.out.print("¿Quiere continuar? (s/n): ");
            continuar = System.console().readLine();

        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("Programa terminado.");
    }
}
