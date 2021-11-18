//package io;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.io.Writer;
//import java.util.Iterator;
//
//import com.sun.swing.internal.plaf.basic.resources.basic;
//
//import interfaceprac.int1;
//
//public class createfile {
//	public static void main(String[] args) throws IOException {
//		File f=new File("src/io/c.txt");
//		f.createNewFile();
////		FileWriter file = new FileWriter(f);
//		String string="";
//		try {
////			BufferedWriter b = new BufferedWriter(file);
//			BufferedWriter b= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
//			for(int i=65;i<60+65;i++) {
//				string=string+(char) i;
//			}
//			b.write(string);
//			b.close();
//		} catch (Exception e) {
//			e.getMessage();
//		}
//	}
//
//}
