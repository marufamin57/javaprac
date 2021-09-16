import java.util.Vector;

import processing.core.PApplet;

public class set extends PApplet{
    static Complex z;
    int max=100;
    static Vector<con> v=new Vector<con>();
    public static void main(String[] args) {
        PApplet.main("set");
    }
    class con{
        Complex x;
        int count;
        con(Complex x, int count){
            this.x=x;
            this.count=count;
        }
    }
    public void settings() {
        size(1000, 1000);
        z= new Complex(0, 0);
        for(double i=-2;i<2; i=i+.1){
            for(double j=-2;j<2;j=j+.1){
                int cout=0;
                Complex c=new Complex(i, j);
                while (z.abs()<2 && cout<max ) {
                    z=(z.times(z)).plus(c);
                }
                v.add(new con(c,cout));
            }
        }

    }
    public void setup() {
        frameRate(1);
        translate(500, 500);
        // colorMode(HSB, 360 , 100, 100);
    }
    public void draw(){
        background(255);
        for(int i=0; i<v.size();i++){
            stroke(v.get(i).count/max);
            point((float) ((v.get(i).x.re())*100.0), (float) ((-v.get(i).x.im())*100.0));
        }

    }
    
}
