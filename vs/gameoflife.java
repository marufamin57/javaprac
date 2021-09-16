import java.util.Vector;

import processing.core.PApplet;

public class gameoflife extends PApplet {
    static int s = 600;
    static int n = 10;
    static int w = s / n;
    static box1[][] b = new box1[n][n];
    static boolean[][] st = new boolean[n][n];

    public static void main(String[] args) {
        PApplet.main("gameoflife");
    }


    public void settings() {
        size(s, s);
       
        start();

    }
    public void start(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                st[i][j]= setbomb();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = new box1(i * w, j * w,st[i][j]);
            }
        }
    }
    public void setup() {
        frameRate(1);
        background(255);
        textSize(40);
    }

    void count(int i, int j) {
        if (i == 0 && j == 0) {
            b[i][j].c = bool2int(b[1][1].state) + bool2int(b[1][0].state) + bool2int(b[0][1].state);
        }
        if (i == 0 && j == n - 1) {
            b[i][j].c = bool2int(b[0][n - 2].state) + bool2int(b[1][n - 1].state) + bool2int(b[1][n - 2].state);
        }
        if (i == n - 1 && j == 0) {
            b[i][j].c = bool2int(b[n - 2][0].state) + bool2int(b[n - 1][1].state) + bool2int(b[n - 2][1].state);
        }
        if (i == n - 1 && j == n - 1) {
            b[i][j].c = bool2int(b[n - 1][n - 2].state) + bool2int(b[n - 2][n - 1].state)
                    + bool2int(b[n - 2][n - 2].state);
        }
        if (i == 0 && (j != 0 && j != n - 1)) {
            b[i][j].c = bool2int(b[i][j - 1].state) + bool2int(b[i + 1][j - 1].state) + bool2int(b[i + 1][j].state)
                    + bool2int(b[i][j + 1].state) + bool2int(b[i + 1][j + 1].state);
        }
        if (i == n - 1 && (j != 0 && j != n - 1)) {
            b[i][j].c = bool2int(b[i][j - 1].state) + bool2int(b[i - 1][j - 1].state) + bool2int(b[i - 1][j].state)
                    + bool2int(b[i][j + 1].state) + bool2int(b[i - 1][j + 1].state);
        }
        if (j == n - 1 && (i != 0 && i != n - 1)) {
            b[i][j].c = bool2int(b[i - 1][j].state) + bool2int(b[i - 1][j - 1].state) + bool2int(b[i][j - 1].state)
                    + bool2int(b[i + 1][j].state) + bool2int(b[i + 1][j - 1].state);
        }
        if (j == 0 && (i != 0 && i != n - 1)) {
            b[i][j].c = bool2int(b[i - 1][j].state) + bool2int(b[i - 1][j + 1].state) + bool2int(b[i][j + 1].state)
                    + bool2int(b[i + 1][j].state) + bool2int(b[i + 1][j + 1].state);
        }
        if ((j != 0 && j != n - 1) && (i != 0 && i != n - 1)) {
            b[i][j].c = bool2int(b[i - 1][j - 1].state) + bool2int(b[i][j - 1].state) + bool2int(b[i + 1][j - 1].state)
                    + bool2int(b[i - 1][j].state) + bool2int(b[i + 1][j].state) + bool2int(b[i - 1][j + 1].state)
                    + bool2int(b[i][j + 1].state) + bool2int(b[i + 1][j + 1].state);
        }

    }

    public void draw() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count(i, j);
                if (b[i][j].state) {
                    fill(0, 0, 0);
                    rect(b[i][j].x, b[i][j].y, w, w);
                } else {
                    fill(255, 255, 255);
                    rect(b[i][j].x, b[i][j].y, w, w);
                }

            }
        }
        update();
    }
    void update(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j].state) {
                    if(b[i][j].c==2 || b[i][j].c==3){
                        b[i][j].state=true;
                    }else{
                        b[i][j].state=false;
                    }
                } else {
                    if (b[i][j].c==3) {
                        b[i][j].state=true;
                    }
                }
            }
        }
    }
    boolean setbomb() {
        float temp = random(1);
        if (round(temp) == 1) {
            return true;
        } else {
            return false;
        }
    }

    int bool2int(Boolean a) {
        if (a) {
            return 1;
        } else {
            return 0;
        }
    }
    public void mouseClicked(){
        start();
    }
    class box1 {
        int x;
        int y;
        boolean state;
        int c;

        public box1(int x, int y,boolean state) {
            this.x = x;
            this.y = y;
            this.state = state;
        }
    }
}