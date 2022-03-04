
import java.util.Vector;

import processing.core.PApplet;

public class colorgame extends PApplet{
    static int s=900;
    static int n=3;
    static int rad= s/(n);
    static Vector<circle> circles=new Vector<>(); 
    static PApplet ran= new PApplet();
    static Vector<Integer> rads= new Vector<>();
    static void setcircles(){
        int r=(int) ran.random(20, 235);
        int g=(int) ran.random(20, 235);
        int b=(int) ran.random(20, 235);
        circles.removeAllElements();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                circles.add(new circle(rads.get(i), rads.get(j), rad, r,g,b));
            }
        }
        final int ranpos=(int) ran.random(0, 9);
        int a,b1,c;
        a=20*(int)  ran.random(-1, 2);
        b1=20*(int)  ran.random(-1, 2);
        c=20*(int)  ran.random(-1, 2);
        if (a==0 && b1==0 && c==0) {
            a=20;
            b1=20;
            c=20;
        }
        circles.set(ranpos, new circle(circles.get(ranpos).x, circles.get(ranpos).y, rad, circles.get(ranpos).r+a, 
        circles.get(ranpos).g+b1, circles.get(ranpos).b+c));
       
    }
    public static void main(String[] args) {
        PApplet.main("colorgame");
        for (int i = 0; i < n; i++) {
            rads.add(rad/2+i*rad);
          }
    }
    public void settings() {
        size(s, s);
    }
    public void setup() {
        frameRate((float) 0.5);
        background(255);
        setcircles();
    }
    public void draw() {
        background(255);
        setcircles();
        for (circle circle : circles) {
            fill(circle.r, circle.g, circle.b);
            circle(circle.x, circle.y, circle.rad);
            textSize(40);
            fill(255-circle.r,255-circle.g, 255-circle.b);
            text("r "+circle.r+" g "+circle.g+" b "+circle.b, circle.x-130, circle.y);
        }
    }
}
class circle{
    int x,y,rad,r,g,b;
    public circle(int x, int y, int rad, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.rad = rad;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
}
