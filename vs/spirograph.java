import processing.core.PApplet;

public class spirograph extends PApplet {
    int s=900;
    int x=300;
    int y= 300;
    int r=150;
    int r2=r/2;
    double t=0.1;
    public static void main(String[] args) {
        PApplet.main("spirograph");
    }

    public void settings() {
        size(s, s);
    }
    public void setup() {
        frameRate(2);
        background(255);
    }
    public void draw() {
        background(255);
        noFill();
        // color(255, 255, 255);
        stroke(0);
        strokeWeight(2);
        ellipse(x, y,2* r,2* r);
        ellipse(x+(r+r2)*cos((float) t), y+(r+r2)*sin((float) t), 2*r2,2* r2);
        stroke(255,0,0);
        strokeWeight(10);
        point(x+r*cos((float) t), y+r*sin((float) t));
        t=t+.1;
    }
}
