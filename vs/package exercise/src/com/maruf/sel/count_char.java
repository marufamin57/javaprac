package com.maruf.sel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class count_char {
    public static void main(String[] args) throws IOException {
        StringBuilder s=getparagraph();
        System.out.println(totalcharcount(s));
        System.out.println(charcountwoutspace(s));
        System.out.println(charcount(s, 'X'));
        System.out.println(charcountcasesens(s, 'x'));
    }
    static int charcountcasesens(StringBuilder s, char c){
        if (((int)c >=65 && (int) c<=90) || ((int)c >=97 && (int) c<=122)) {
            if ((int)c >=65 && (int) c<=90) {
                return charcount(s, c)+charcount(s, (char)((int)c+32));
            }else{
                return charcount(s, c)+charcount(s, (char)((int)c-32));
            }
        }else{
            return charcount(s, c);
        }
    }
    static int charcount(StringBuilder s, char c){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c) {
                count++;
            }
        }
        return count;
    }
    static int totalcharcount(StringBuilder s){
        int count=0;
        count=s.length();
        return count;
    }
    static int charcountwoutspace(StringBuilder s){
        int count=0;
        String temp=s.toString().replaceAll(" ", "");
        count=temp.length();
        return count;
    }
    static StringBuilder getparagraph() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("genereted.txt"));
        StringBuilder str = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            str.append(line);
            // str.append(System.lineSeparator());
        }
        // System.out.println(str.toString());
        reader.close();
        return str;
    }

}
