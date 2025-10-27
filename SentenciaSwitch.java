public class SentenciaSwitch {
    public static void main(String[] args) {

        System.out.println("Por favor, ingrese un número de mes: ");
        int mes = Integer.parseInt(System.console().readLine());

        String nombreDelMes;

        switch (mes) {
            case 1:
                nombreDelMes = "Enero";
                break;
            case 2:
                nombreDelMes = "Febrero";
                break;
            case 3:
                nombreDelMes = "Marzo";
                break;
            case 4:
                nombreDelMes = "Abril";
                break;
            case 5:
                nombreDelMes = "Mayo";
                break;
            case 6:
                nombreDelMes = "Junio";
                break;
            case 7:
                nombreDelMes = "Julio";
                break;
            case 8:
                nombreDelMes = "Agosto";
                break;
            case 9:
                nombreDelMes = "Setiembre";
                break;
            case 10:
                nombreDelMes = "Octubre";
                break;
            case 11:
                nombreDelMes = "Noviembre";
                break;
            case 12:
                nombreDelMes = "Diciembre";
                break;
            default:
                nombreDelMes = "no existe ese mes";
                break;
        }
        System.out.println("Mes " + mes + ": " + nombreDelMes);
    }
}
