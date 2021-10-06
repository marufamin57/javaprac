package com.maruf.sel;

import java.util.ArrayList;
import java.util.List;

public class listesc {
    public static void main(String[] args) {
        List<Integer> w= new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            w.add(i);
        }
        for (Integer integer : w) {
            System.out.println(integer);
        }
    }
}
