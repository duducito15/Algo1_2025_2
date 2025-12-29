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

    //Funcion que calcula la potencia de un numero elevado a la n
    public static int miPotencia(int b, int p){
        int resultado=1;
        for (int i = 0; i < p; i++) {
            resultado = resultado * b; 
        }
        return resultado;
    }

    public static int[] crearArray(int l) {
        int[] arreglo = new int[l];
        for (int i = 0; i < l; i++) {
            arreglo[i] = (int) (Math.random() * 10 + 1);
        }
        return arreglo;
    }

    public static void mostrarArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+ " ");
        }
    }
}
