import java.util.Vector;

import processing.core.PApplet;

public class snake3 extends PApplet {
    static int s = 600;
    static int n = 50;
    static int w = s / n;
    Vector <Integer> x=new Vector<Integer>();
    Vector <Integer> y=new Vector<Integer>();
    static int speed;
    Vector <Integer> speedx=new Vector<Integer>();
    Vector <Integer> speedy=new Vector<Integer>();
    static float cx;
    static float cy;
    static boolean q = false;
    static boolean q1 = true;
    static int score = 0;

    public static void main(String[] args) {
        PApplet.main("snake3");
    }

    public void start() {
        x.add(w/2);
        y.add(w/2);
        speed = w;
        speedx.add(speed);
        speedy.add(0);
        cx = random(w / 2, s - w / 2);
        cy = random(w / 2, s - w / 2);
        score=0;
    }
    // public boolean iscrossed(){
    //     for(int i=0;i<x.size()-1;i++){
    //         if(x.lastElement()==x.get(i) && y.lastElement()==x.get(i)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public void update(){
        for(int i=0;i<x.size()-1;i++){
            x.set(i, x.get(i+1));
            y.set(i, y.get(i+1));
            speedx.set(i, speedx.get(i+1));
            speedy.set(i, speedy.get(i+1));
        }
    }
    public void plot(){
        for(int i=0;i<x.size();i++){
            rect(x.get(i), y.get(i), w, w);
        }
    }
    public void settings() {
        size(s, s + 100);

    }

    public void setup() {
        frameRate(10);
        background(255);
        rectMode(CENTER);
        textSize(60);
        fill(0);
        text("press any key", 20, 240);
    }

    public void gameover() {
        background(255);
        q1 = true;
        q = false;
        x.removeAllElements();
        y.removeAllElements();
        speedx.removeAllElements();
        speedy.removeAllElements();
        start();
        fill(0);
        text("game over", 20, 120);
        text("press any key", 20, 240);
    }

    public void draw() {
        if (q1) {
            if (keyPressed) {
                start();
                q = true;
                q1 = false;
            }
        }
        if (q) {
            background(255);
            fill(color(255, 200, 200));
            update();
            plot();
            // rect(x.lastElement(), y.lastElement(), w, w);
            if (dist(cx, cy, x.lastElement(), y.lastElement()) < w) {
                cx = random(w / 2, s - w / 2);
                cy = random(w / 2, s - w / 2);
                fill(color(0, 240, 120));
                circle(cx, cy, w);
                score = score + 1;
                if (speedx.lastElement()==speed) {
                    x.add(x.lastElement()+w/2);
                    y.add(y.lastElement());
                    speedx.add(speed);
                    speedy.add(0);
                }
                if (speedx.lastElement()==-speed) {
                    x.add(x.lastElement()-w/2);
                    y.add(y.lastElement());
                    speedx.add(-speed);
                    speedy.add(0);
                }
                if (speedy.lastElement()==speed) {
                    x.add(x.lastElement());
                    y.add(y.lastElement()+w/2);
                    speedx.add(0);
                    speedy.add(speed);
                }
                if (speedy.lastElement()==-speed) {
                    x.add(x.lastElement());
                    y.add(y.lastElement()-w/2);
                    speedx.add(0);
                    speedy.add(-speed);
                }
            } else {
                fill(color(0, 240, 120));
                circle(cx, cy, w);
            }
            // update();
            x.set(x.size()-1, x.lastElement()+speedx.lastElement());
            y.set(y.size()-1, y.lastElement()+speedy.lastElement());

            if (x.lastElement() < 0 || x.lastElement() > s || y.lastElement() < 0 || y.lastElement() > s) {
                gameover();
            }

        }
        fill(0);
        line(0, 601, 600, 601);
        text("score : " + Integer.toString(score), 20, 650);
    }

    public void keyPressed() {
        if (keyCode == DOWN) {
            if (speedy.lastElement()<0) {
            } else {
                speedx.set(speedx.size()-1, 0);
                speedy.set(speedy.size()-1, speed);
            }
        }
        if (keyCode == RIGHT) {
            if (speedx.lastElement()<0) {  
            }else{
                speedx.set(speedx.size()-1, speed);
                speedy.set(speedy.size()-1, 0);
            }
           
        }
        if (keyCode == LEFT) {
            if (speedx.lastElement() > 0) {
            }else{
                speedx.set(speedx.size()-1, -speed);
                speedy.set(speedy.size()-1, 0);
            }
        }
        if (keyCode == UP) {
            if (speedy.lastElement()>0) {
            } else {
                speedx.set(speedx.size()-1, 0);
                speedy.set(speedy.size()-1, -speed);
            }
        }
    }

}
