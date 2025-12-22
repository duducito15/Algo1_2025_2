public class Funcion1 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!!");
        mensaje();

        System.out.println("Ingresa tu nombre: ");
        String nombre = System.console().readLine();
        mensaje1(nombre);

    }

    public static void mensaje() {
        System.out.println("Hola mundo desde la funcion mensaje!!!");
    }

    public static void mensaje1(String n) {
        System.out.println("Hola " + n);
    }

}
