package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class read_from_keyboard {
	public static void main(String[] args) {
		StringBuilder st= new StringBuilder();
		
		try(BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in))){
			String line;
			while((line=bufferedReader.readLine())!=null) {
				if(line.equals("exit")) {
					break;
				}
				st.append(line);
			}
		}catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println(st);
	}
}
