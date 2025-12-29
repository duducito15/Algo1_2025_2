import matematicas.Basicas;

public class Funcion3 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Calculadora básica");
        System.out.println("Ingresa el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresa el segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println("La suma es: " + Basicas.miSuma(num1,num2));
        System.out.println("La resta es: " + Basicas.miResta(num1,num2));
        System.out.println("La multiplicacion es: " + Basicas.miMultiplicacion(num1,num2));
        System.out.println("La division es: " + Basicas.miDivicion(num1, num2));
    }

   
}
