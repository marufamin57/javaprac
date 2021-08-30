import java.util.Random;

import processing.core.PApplet;

public class snake1 extends PApplet {
    static int s = 600;
    static int n = 20;
    static int w = s / n;
    static float x;
    static float y;
    static int speed;
    static float speedx;
    static float speedy;
    static float cx;
    static float cy;

    public void start() {
        x = w / 2;
        y = w / 2;
        speed = w;
        speedx = speed;
        speedy = 0f;
    }

    public static void main(String[] args) {
        PApplet.main("snake1");
    }

    public void settings() {
        size(s, s);
        cx = random(w / 2, s - w / 2);
        cy = random(w / 2, s - w / 2);
    }

    public void setup() {
        frameRate(10);
        background(255);
        rectMode(CENTER);
    }

    public void draw() {
        background(255);
        fill(color(255, 200, 200));
        rect(x, y, w, w);
        if (dist(cx, cy, x, y) < w) {
            cx = random(w / 2, s - w / 2);
            cy = random(w / 2, s - w / 2);
            fill(color(0, 240, 120));
            circle(cx, cy, w);
        } else {
            fill(color(0, 240, 120));
            circle(cx, cy, w);
        }

        x = x + speedx;
        y = y + speedy;
    }

    public void keyPressed() {
        if (keyCode == DOWN) {
            speedx = 0;
            speedy = speed;
        }
        if (keyCode == RIGHT) {
            speedx = speed;
            speedy = 0;
        }
        if (keyCode == LEFT) {
            speedx = -speed;
            speedy = 0;
        }
        if (keyCode == UP) {
            speedx = 0;
            speedy = -speed;
        }
    }

}