public class Array5 {
    public static void main(String[] args) {
        double[] notas = new double[4];

        System.out.println("Para calcular la nota media necesito saber la ");
        System.out.println("nota de cada uno de tus exámenes.");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del examen no " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(System.console().readLine());
        }

        System.out.println("Tus notas son: ");
        double suma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print(notas[i] + " ");
            suma += notas[i];//suma = suma + notas[i];
        }

        System.out.println("\nLa media es " + suma / notas.length);
    }
}
