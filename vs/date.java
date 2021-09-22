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
        shortfor();
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
