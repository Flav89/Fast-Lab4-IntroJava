/**
 * Created by fav on 10/25/2016.
 * Se da un sir de numere ordonate crescator.
 * Se va determina daca un numar n exista in sir si daca exista se va afisa pozitia pe care s-a gasit, altfel se va
 * afisa -1.
 * Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat?
 * Numerele sunt:
 * int[] a = {1,3,4,6,7,8,10,12,14,23};
 */
public class tema1 {

    public static void main(String[] args) {


        int[] a = {1,3,4,6,7,8,10,12,14,23};
        int n = SkeletonJava.readIntGUI("Introduceti numarul:");
        int i = 0;
        boolean search = true;

        while (search && i < a.length) {
            if (a[i] == n) {
                SkeletonJava.printGUI("Numarul se afla pe pozitia " + i + " a sirului ");
                search = false;
            }
            i++;
        }

        if (search) {
            SkeletonJava.printGUI("-1");
        }
    }
}





