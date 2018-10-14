import processing.core.PApplet;
//import static processing.core.PApplet.radians;
//import static processing.core.PApplet.PI;


public class Bob{
    int colour;
    float x1;
    float y1;
    float x2;
    float y2;
    float x3;
    float y3;
    float centX;
    float centY;
    float xSpeed;
    float ySpeed;
    PApplet parent;


    public Bob(PApplet p, int colour, float centX, float centY, float xSpeed, float ySpeed){
        parent = p;
        this.colour = colour;
        this.x1 = centX+20;
        this.y1 = centY;
        this.x2 = centX-10;
        this.y2 = centY-10;
        this.x3 = centX-10;
        this.y3 = centY+10;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.centY=centY;
        this.centX=centX;
 
    }
    public void shape(){
        parent.fill(colour);
        parent.triangle(x1, y1, x2, y2, x3, y3);
        
    } 
   public void drive(){
        randomWalk();

    }

    public void randomWalk(){ 
        x1 += xSpeed;
        y1 += ySpeed;
        x2 += xSpeed;
        y2 += ySpeed;
        x3 += xSpeed;
        y3 += ySpeed;
        centX = centX;
        centY = centY;
        if(x1+13 >= parent.width || x1-33 < 0){
            xSpeed *= -1;
        }
        if(y1+13 >= parent.height || y1-23 < 0){
            ySpeed *= -1;
        }
        
     }
    
}
