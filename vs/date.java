import java.time.LocalDate;

public class date {
    private static final char x = '1';

    public static void main(String[] args) {
        // int date= LocalDate.now().getYear();
        // System.out.println(date);
        // int x=100;
        // int y=50;
        // System.out.println(x&y);
        // System.out.println(x|y);
        // System.out.println(~x);
        // System.out.println(x^y);
        // System.out.println(x<<1);
        // x='2';
        // switch1('2');
        // switch1(x);
        // System.out.println(minimum(500, 10));
        // zxc(50);
        // shortfor1();
        // breakprac();
        // System.out.println(sumrec(50));
        System.out.println(factorialnr(21));
    }
    static double factorialnr(int n){
        double f=1;
        if (n==0) {
            return f;
        }
        int i=1;
        while (i<=n) {
            f=f*i;
            i++;
        }
        return f;
    }
    static long factorialrec(Long n){
        long f=1;
        if (n==0) {
            return f;
        }
        f=n*factorialrec(n-1);
        return f;
    }
    static int sumrec(int n){
        int f=0;
        if (n<0) {
            return -1;
        }
        if (n==0) {
            return f;
        }
        f=n+sumrec(n-1);
        return f;
    }
    static void breakprac(){
        int i=0;
        int sum=0;
        while(true){
            if (i==5) {
                break;
            }
            System.out.println(i);
            i++;
        }
        lebel: for(int k=0;k<10;k++){
            for(int j=0;j<10;j++){
                if(k==1 && j==8){
                    break lebel;
                }
                sum++;
            }
        }
        System.out.println(sum);
    }
    static void shortfor1(){
        int[] c= {1,2,3};
        int[][] c1= {{1,2,3},{4,5,6}};
        for(int i=0; i<c.length;i++){
            System.out.print("  "+c[i]);
        }
        for (int[] i : c1) {
            System.out.println(" ");
            for (int j : i) {
                System.out.print("  "+j);
            }
        }
    }
    static void shortfor(){
        int[] arr={1,2,3,4,5};
        for (int i = 0, j=0; i < arr.length && j<arr.length;System.out.println(arr[i]),System.out.println(i+j+10), i++, j++);
    }
    static int minimum(int a, int s) {
        return (a < s) ? a : s;
    }

    static void zxc(int a){
        int q=0;
        String b=(a<q)?"negative":"positive";
        System.out.println(b);
    }

    static void switch1(char z) {
        switch (z) {
            case 'a':
                System.out.println(z);
                break;
            case 'b':
                System.out.println(z);
                break;
            case 'z':
                System.out.println(z);
                break;
            case x:
                System.out.println(z);
                break;
            default:
                System.out.println("123");
                break;
        }
    }

}
