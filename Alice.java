import processing.core.PApplet;
import static processing.core.PApplet.radians;
import static processing.core.PApplet.PI;


public class Alice{
    int colour;
    float x1;
    float y1;
    float x2;
    float y2;
    float x3;
    float y3;
    float centX;
    float centY;
    float speed;
    PApplet parent;

    public Alice(PApplet p, int colour, float centX, float centY, float speed){
        parent = p;
        this.colour = colour;
        this.x1 = centX+20; 
        this.y1 = centY;    
        this.x2 = centX-10; 
        this.y2 = centY-10; 
        this.x3 = centX-10; 
        this.y3 = centY+10; 
        this.speed = speed;
        this.centY = centY;
        this.centX = centX;
 
    }

    public void shape(){
        parent.fill(colour);
        parent.triangle(x1, y1, x2, y2, x3, y3);
        
    } 

    public void drive(){
        westEast();
        northSouth();
        eastWest();
        southNorth();

    }

    public void westEast(){
        if((x1+13)<= parent.width && y1 <=23 && y2-13<=0){
            centX = centX + speed;
            x1 = x1 + speed;
            x2 = x2 + speed;
            x3 = x3 + speed;
        }else if ((x1+11 ==parent.width)){
            speed = 0;
        }
        
     }
     public void northSouth(){
         if((x1+13)>= parent.width && (y3+13) <= parent.height){
            centY = centY + speed;
            y1 = y1 + speed;
            y2 = y2 + speed;
            y3 = y3 + speed;
         }
         if ((y3+11 ==parent.height)){
            speed = 0;
         }

      }
      public void eastWest(){
         if((y3+13)>= parent.height && (x3-13)>= 0){
             centX = centX - speed;
             x1 = x1 - speed;
             x2 = x2 - speed;
             x3 = x3 - speed;
         }
      }

      public void southNorth(){
          if((x2-13)<= 0 && (y2-13) >= 0){
              centY = centY - speed;
              y1 = y1 - speed;
              y2 = y2 - speed;
              y3 = y3 - speed;
          }

      }

}
