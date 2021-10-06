package com.maruf.sel;

import java.io.IOException;

import pargraphmining.Mining;

class minetest {

    public static void main(String[] args) throws InterruptedException, IOException {
        Mining mining =new Mining();
        mining.getparagraph("https://en.wikipedia.org/wiki/Donald_Trump");
    }
}