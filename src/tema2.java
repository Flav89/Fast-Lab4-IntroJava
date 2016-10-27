/**
 * Created by fav on 10/27/2016.
 * /*
 Se se calculeze suma primelor n numere naturale,
 unde n este declarat ca si
 int n = 20; //sau o alta valoare
 */

public class tema2 {
    public static void main(String[] args) {
        int n = SkeletonJava.readIntGUI("Introduceti numarul:");
        int count = 0;
        int sum = 0;


        do {

            sum = sum + count;
            count++;
        }
        while (count <= n);


        SkeletonJava.printGUI("Suma primelor " + n + " numere naturale este: " + sum);


    }
}

