    /*
    Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24].
    Altfel sa se afiseze ‘false'.
    */

    public class tema4  {

    public static void main(String[] args) {
        int n = SkeletonJava.readIntGUI("Introduceti nr:");

        if (n > 9 && n < 24) {
            SkeletonJava.printGUI("True");
        } else {
            SkeletonJava.printGUI("False");
        }

    }
}