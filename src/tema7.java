/**
 * Created by fav on 10/27/2016.
 */

    /*
    Se da un sir de numere.
    Sa se afiseze perechile de numere
    pentru care  primul numar este mai mare decat al doilea.
    de ex pt 11 13 9 8 16
    se va afisa   13 9 , 9 8
    */
public class tema7 {
    public static void main(String[] args) {
        int[] a = {11, 13, 9, 8, 7};


        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                SkeletonJava.printGUI(a[i] + " " + a[i+1]);
            }
        }


    }

    }

