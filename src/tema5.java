/**
 * Created by fav on 10/24/2016.
 */
        /*
        Se dau doua numere a si n. sa se afiseze numarul a la puterea n
        de ex
        a =3
        b = 2
        se va calcula 3*3
        */

public class tema5 {

    public static void main(String[] args) {

        int a = SkeletonJava.readIntGUI("Introduceti numar:");
        int n = SkeletonJava.readIntGUI("Numarul `a` va fi ridicat la puterea:");
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * a;
        }

        SkeletonJava.printGUI("rezultatul este: " + result);

    }
}



