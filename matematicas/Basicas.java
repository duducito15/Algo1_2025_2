package matematicas;
//Libreria de funciones matematicas
public class Basicas {
    // Funcion que retorna el resultado de la suma de 2 numeros enteros
    public static int miSuma(int n1, int n2) {
        return n1 + n2;
    }

    // Funcion que retorna el resultado de la resta de 2 numeros enteros
    public static int miResta(int n1, int n2) {
        return n1 - n2;
    }

    // Funcion que retorna el resultado de la producto de 2 numeros enteros
    public static int miMultiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    // Funcion que retorna el resultado de la division de 2 numeros enteros
    public static double miDivicion(int n1, int n2) {
        if (n2 != 0) {
            return (double) n1 / n2;
        } else {
            return 0;
        }
    }
}
