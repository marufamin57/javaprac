package func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class funcs {
	public StringBuilder read(String dir) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(dir));
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

	public int charcountwoutspace(StringBuilder s) {
		int count = 0;
		String temp = s.toString().replaceAll(" ", "");
		count = temp.length();
		return count;
	}
	 public int totalcharcount(StringBuilder s){
	        int count=0;
	        count=s.length();
	        return count;
	    }
	 public int charcount(StringBuilder s, char c){
	        int count=0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i)==c) {
	                count++;
	            }
	        }
	        return count;
	    }
	 public int charcountnotsens(StringBuilder s, char c){
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
	 
	 public int specificstr(StringBuilder s,String st) {
		 int c=0;
		 String temp= s.toString();
		 String[] str1= temp.split(" ");
		 for (String string : str1) {
			if (string.contains(st)) {
				c++;
			}
		}
		return c;
		
	}
	 public void matcedword(StringBuilder s, String st) {
		 String temp= s.toString();
		 String[] str1= temp.split(" ");
		 Vector<String> str2 = new Vector<String>();
		 for (String string : str1) {
			if (string.contains(st)) {
				str2.add(string);
			}
		}
		 if (str2.size()==0) {
			System.out.print("no match");
		} else {
			for (String string : str2) {
				System.out.print(string+"\n");
			}
		}
	}

}
