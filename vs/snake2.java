import processing.core.PApplet;

public class snake2 extends PApplet {
    static int s = 600;
    static int n = 50;
    static int w = s / n;
    static float x;
    static float y;
    static int speed;
    static float speedx;
    static float speedy;
    static float cx;
    static float cy;
    static boolean q = false;
    static boolean q1 = true;
    static int score = 0;

    public static void main(String[] args) {
        PApplet.main("snake2");
    }

    public void start() {
        x = w / 2;
        y = w / 2;
        speed = w;
        speedx = speed;
        speedy = 0f;
        cx = random(w / 2, s - w / 2);
        cy = random(w / 2, s - w / 2);
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
            rect(x, y, w, w);
            if (dist(cx, cy, x, y) < w) {
                cx = random(w / 2, s - w / 2);
                cy = random(w / 2, s - w / 2);
                fill(color(0, 240, 120));
                circle(cx, cy, w);
                score = score + 1;
            } else {
                fill(color(0, 240, 120));
                circle(cx, cy, w);
            }

            x = x + speedx;
            y = y + speedy;

            if (x < 0 || x > s || y < 0 || y > 600) {
                gameover();
            }

        }
        fill(0);
        line(0, 601, 600, 601);
        text("score : " + Integer.toString(score), 20, 650);
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
