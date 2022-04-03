package practice;

import java.util.ArrayList;

public class pascaltriangle {
    public static void main(String[] args) {
        ArrayList<Integer> triangle= new ArrayList<>();
        triangle.add(1);
        System.out.println(triangle);
        triangle.add(1);
        System.out.println(triangle);
        for (int i = 3; i < 20; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            for (int j = 0; j <i-2 ; j++) {
                temp.add(triangle.get(j)+triangle.get(j+1));
            }
            temp.add(1);
            triangle=temp;
            System.out.println(triangle);
        }
    }
}
