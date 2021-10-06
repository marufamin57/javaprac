package com.maruf.p1;

import com.maruf.p2.contact;

public class a2 {
    private static void pri1(){
        System.out.println("private class");
    }
    protected  void pri2(){
        System.out.println("protected class");
    }

    public static void main(String[] args) {
        pri1();
        new a2().pri2();
    }
}
