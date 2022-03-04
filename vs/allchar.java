import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class allchar {
    public static void main(String[] args) {
        // for(int i=0; i<=5000; i++){
        //     char x=(char) i;
        //     System.out.println(x);
        // }
        Vector<Integer> asd=new Vector<>(Arrays.asList(1,2,3));
        Collections.shuffle(asd);
        asd.set(0, 10);
        System.out.println(asd);
        System.out.println(asd.contains(3));
    }
}
