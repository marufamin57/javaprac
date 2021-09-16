

public class sleect10 {
    static boolean a = true;

    public static void main(String[] args) {
    while (a) {
        System.out.println("true");
        trfl();
    }
    System.out.println("false");
}
   static void trfl(){
        if (Math.random()<.5) {
            a=true;
        }else{
            a=false;
        }
    }
}
