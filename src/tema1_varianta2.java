
public class tema1_varianta2 {

    public static void main(String[] args) {
        int[] a = {1,3,4,6,7,8,10,12,14,23};
        int key = SkeletonJava.readIntGUI("Choose a number you would like to search:");

        int i = 0;
        boolean found = false;

        for (i = 0; i < a.length; i++) {
            if (a[i] == key) {
                found = true;
                break;
            }
        }

        if (found)
        {
            SkeletonJava.printGUI("Found " + key + " at index " + i + ".");
        } else {
            SkeletonJava.printGUI("-1");
        }
    }
}