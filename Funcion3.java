public class Funcion3 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Calculadora básica");
        System.out.println("Ingresa el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println("La suma es: " + miSuma(num1,num2));
        System.out.println("La resta es: " + miResta(num1,num2));
        System.out.println("La multiplicacion es: " + miMultiplicacion(num1,num2));
        System.out.println("La division es: " + miDivicion(num1, num2));
    }

    public static int miSuma(int n1, int n2) {
        return n1 + n2;
    }
    public static int miResta(int n1, int n2) {
        return n1 - n2;
    }
    public static int miMultiplicacion(int n1, int n2) {
        return n1 * n2;
    }
    public static double miDivicion(int n1, int n2) {
        if (n2 !=  0) {
            return (double) n1/n2;
        } else {
            return 0;
        }        
    }
}
