import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by fav on 10/22/2016.
 */
public class exercitii3 {
    public static void main(String[] args) {
        int[] sir = {5, 6, 71, 8, 9};
        int sum = 0;
        int max =0;
        double avg;
        for (int i = 0; i<sir.length; i++) {
            System.out.println(sir[i]);
            sum = sum+sir[i];
            if (max<sir[i])
                max=sir[i];
        }
        avg =sum/(double)sir.length;
        System.out.println("avg:" + avg);
        System.out.println("max este:" +max);
    }
    }


