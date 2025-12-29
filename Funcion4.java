import matematicas.*;
public class Funcion4 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("ingrese la longitud del Array de una dimensión: ");
        n = Integer.parseInt(System.console().readLine());

        int[] num = Basicas.crearArray(n);
        Basicas.mostrarArray(num);

    }
}
