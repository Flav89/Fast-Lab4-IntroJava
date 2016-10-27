/**
 * Created by fav on 10/27/2016.
 */
    /*
    Sa se calculeze factorialul unui numar a .
    factorialul este definit asa:
    factorial  = 1*2*3*4….*a
    */
    public class tema6 {
    public static void main(String[] args) {


        int a = SkeletonJava.readIntGUI("Introduceti numar:");
        int count = 1;
        int result = 1;

        do {
            result = result * count;
            count++;
        } while (count <= a);

        SkeletonJava.printGUI("Factorialul numarului " + a + " este: " + result);

    }
}




