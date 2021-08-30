import java.util.Random;

import processing.core.PApplet;

public class snake extends PApplet {
    static int n=10;
    static int[] x= new int[n];
    static int[] y= new int[n];
    static int s=600;
    static Random random=new Random();
    static int r;
    public static void main(String[] args) {
        PApplet.main("snake");
    }
    public void settings(){
        size(s,s);
        for(int i=0; i<n;i++){
            x[i]=(int) i*(s/n);
            y[i]=(int) i*(s/n);
        }
    }
    public void setup(){
        frameRate(1);
        background(0);
    }
    public void draw(){
        for (int i = 0; i <x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                // color c= color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
                fill(color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                rect(x[i], y[j], s/n, s/n);
            }
            
        }
            }
}
