package com.maruf.p2;

public class contact {
    private int id=0;
    String name;
    double grade;
    public static int count=0;
    contact(String name,double grade){
        this.id=count++;
        this.name=name;
        this.grade=grade;
    }
    contact(String name){
        this(name,0);
    }
    void getid(){
        System.out.println(id); // acccess private variable
    }
}
