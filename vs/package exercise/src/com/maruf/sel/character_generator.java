package com.maruf.sel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class character_generator {
    public static char[] generator(){
        char[] a= new char[65];
        for (int i = 0,j=32; i < a.length; i++,j++) {
            a[i]=(char) j;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        char[] q=generator();
       
        PrintWriter write = new PrintWriter(new FileWriter("a.txt"));
        write.flush();
        for (char i : q) {
            write.append(i);
            write.append("\n");
        }
        write.close();
    }
}
