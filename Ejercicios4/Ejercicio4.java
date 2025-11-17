package Ejercicios4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int dia, mes;
        String signo = "";

        System.out.println("Ingrese el dia de su nacimiento: ");
        dia = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el mes de su nacimiento (1-12): ");
        mes = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1: //enero
                if (dia >= 1 && dia <= 19) {
                    signo = "Capricornio";
                } else if (dia >= 20 && dia <= 31) {
                    signo = "Acuario";
                }
                break;
            case 2: // febrero
                if (dia >= 1 && dia <= 18) {
                    signo = "Acuario";
                } else if (dia >= 19 && dia <= 29) {
                    signo = "Piscis";
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                break;
        }
    }
}
