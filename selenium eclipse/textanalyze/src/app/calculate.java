package app;

import java.io.IOException;

import func.funcs;

public class calculate {
public static void main(String[] args) throws IOException {
	funcs func= new funcs();
	StringBuilder sb = new StringBuilder();
	sb=func.read("Donald Trump - Wikipedia.txt");
	System.out.println(func.charcount(sb, 't'));
	System.out.println(func.specificstr(sb, "Trump"));
	func.matcedword(sb, "Trump");
}
}
