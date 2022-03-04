import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import processing.core.PApplet;
import processing.core.PVector;

public class shortest extends PApplet {
    int s=1000;
    Vector<PVector> l;
    int n=100;
    Vector<PVector> l2;
    Vector<PVector> ref=new Vector<>();
    public static void main(String[] args) {
        PApplet.main("shortest");
    }

    public void settings() {
        size(s, s);
        int rx=0;
        int ry=0;
        l=new Vector<>();
        l.add(new PVector(0,0));
        for (int i = 0; i < n; i++) {
            l.add(new PVector((int) random(0, s),(int) random(0,s)));
        }
        l.add(new PVector(s,s));
        while (true) {
            PVector temp = short1(new PVector(rx,ry));
            ref.add(temp);
            if ((temp.x ==s) && (temp.y == s) ) {
                break;
            }else{
                rx=(int) temp.x;
                ry=(int) temp.y;
            }
        }

    }
    public void setup() {
        frameRate(2);
        background(255);
    }
    public void draw() {
        strokeWeight(20);
        stroke(0);
        for (int i = 0; i < l.size(); i++) {
            point(l.get(i).x, l.get(i).y);
        }
        strokeWeight(5);
        for (int i = 0; i < ref.size()-1; i++) {
            line(ref.get(i).x, ref.get(i).y, ref.get(i+1).x, ref.get(i+1).y);
        }


    }
    public PVector short1(PVector ref1){
    l2=new Vector<>(l);
    for (int i = 0; i < ref.size(); i++) {
        l2.remove(ref.get(i));
    }
    int id=500;
    float temp=1000;
    float min=500;
    for (int i = 0; i < l2.size(); i++) {
        temp=dist(ref1.x, ref1.y, l2.get(i).x, l2.get(i).y);
        if (temp<=min) {
            min=temp;
            id=i;
        }
    }
    return l2.get(id);
    }
}
