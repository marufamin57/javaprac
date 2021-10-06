package com.maruf.p2;

public class stringes {
    public static void main(String[] args) {
        // q1("qwertyuio");
        // q2();
        stringbuil();
    }
    static void stringbuil(){
        StringBuilder q= new StringBuilder("1+");
        System.out.println(q.toString());
        q.append("2+").append("3+");
        System.out.println(q.toString());
        System.out.println(q.toString());
    }
    static void q1(String a){
        System.out.println(a.length());
        System.out.println(a.indexOf("tyo"));
        System.out.println("\"\"\"");
        System.out.println(a.toUpperCase());
    }
    static void q2(){
        String q="4";
        System.out.println(q);
        q="789";
        System.out.println(q);
    }
}
