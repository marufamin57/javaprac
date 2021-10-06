package app;

import java.io.IOException;

import pargraphmining.Mining;

public class createtext {
	public static void main(String[] args) throws InterruptedException, IOException {
		Mining mining = new Mining();
		mining.getparagraph("https://en.wikipedia.org/wiki/Donald_Trump");
	}
}
