import processing.core.PApplet;
import java.util.Scanner;

public class RobotLab extends PApplet{
    //variables
    Alice bot1;
    Bob bot2;
    Charlie bot3;
    int r = 0;
    int g = 0;
    int b = 0;

    public static void main(String[]args){
        PApplet.main("RobotLab");
        System.out.println("H3LLO");
        System.out.println("Welcome to R0b0tLAB");
    }

    public void settings(){
        size(500, 500);
    }

    public void setup(){
        bot1 = new Alice(this, color(100,230,0), (float) (20), (float) (20), (float)(2));
        bot2 = new Bob(this, color(255,0,0), (float)(50), (float)(50),(float)(2f), (float)(3f));
        bot3 = new Charlie(this, color(0,100,220), (float)(100), (float)(100), (float)(1));
    }

    public void draw(){
        background(0,22,0);
        bot1.drive();
        bot1.shape();
        bot2.drive();
        bot2.shape();
        bot3.keyPressed();
        bot3.shape();
    }
}
