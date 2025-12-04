public class Array1 {
    public static void main(String[] args) {
        int[] edades = new int[5]; // definiendo el array 5

        edades[0]= 15;
        edades[1]= 18;
        edades[2]= 25;
        edades[3]= 11;
        edades[4]= 45;
       
        System.out.print(edades[2]+"\n");
        System.out.println("la segunda edad y la cuarta suman: " + (edades[1]+edades[3]));
    }
}
