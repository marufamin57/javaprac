package com.maruf.p2;

public class create_contact {
    public static void main(String[] args) {
        contact c1= new contact("a",75);
        contact c2= new contact("b",50);
        contact c3= new contact("c",5);
        System.out.println(contact.count);
        c3.getid(); // acccess private variable
        System.out.println(sum(c1.grade,c2.grade,c3.grade));

    }
    static double sum(double ...a){
        double s=0;
        for (int i = 0; i < a.length; i++) {
            s=s+a[i];
        }
        return s;
    }
}
