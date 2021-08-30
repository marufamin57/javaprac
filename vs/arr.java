public class arr {
    public static void main(String[] args) {
        int[] a= new int[10];
        a[0]=45;
        a[3]=789;
        int[] b={1,2,3};
        // int[] c=new int[] {1,2,3};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i : b) {
            System.out.println(i);
        }
    }
}
