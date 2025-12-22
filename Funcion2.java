public class Funcion2 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());
      
        if (esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
