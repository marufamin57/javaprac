public class methodoverloadinf {
    void met(){
        System.out.println("no arguments");
    }
    void met(int x){
        System.out.println("integer arguments "+ x);
    }
    void met(int x, String str){
        System.out.println("integer and string arguments "+ str+"  "+ x);
    }
    static double sum(double... x){
        double s=0;
        for (double i:x) {
            s=s+i;
        }
        return s;
    }
    public static void main(String[] args) {
        methodoverloadinf q= new methodoverloadinf();
        q.met();
        q.met(100);
        q.met(100, "asd");
        sum(4,7,9,40);
        System.out.println(sum(4,7,9,40));
        double[] a= {14,6,7};
        System.out.println(sum(a));
        double[] b= new double[]{1,2,3};
        System.out.println(sum(new double[]{1,2}));
    }

}
