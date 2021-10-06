package com.maruf.sel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class textwrite {
    public static void main(String[] args) throws IOException {
        PrintWriter write = new PrintWriter(new FileWriter("a.txt"));
        write.flush();
        write.append("123789");
        char[] hello = { 'H', 'e', 'l', 'l', 'o', '!', '\n' };
        write.print(456);
        write.write(hello);
        write.close();

    }
}
