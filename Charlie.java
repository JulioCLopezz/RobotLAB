import processing.core.PApplet;
//import static processing.core.PApplet.radians;
//import static processing.core.PApplet.PI;


public class Charlie{
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


    public Charlie(PApplet p, int colour, float centX, float centY, float speed){
        parent = p;
        this.colour = colour;
        this.centX = centX;
        this.centY = centY;
        this.speed = speed;
        this.x1 = centX+20;
        this.y1 = centY;
        this.x2 = centX-10;
        this.y2 = centY-10;
        this.x3 = centX-10;
        this.y3 = centY+10;
        this.speed = speed;
        this.centY=centY;
        this.centX=centX;
    }

    public void shape(){
        parent.fill(colour);
        parent.triangle(x1,y1,x2,y2,x3,y3);
    } 

    public void keyPressed(){
        if (parent.key == '7' && x2>=0 && y2>=0){
            x1 -= speed;
            y1 -= speed;
            x2 -= speed;
            y2 -= speed;
            x3 -= speed;
            y3 -= speed;
        
        }else if (parent.key == '8' && y2 >= 0){ 
            y1 -= speed;
            y2 -= speed;
            y3 -= speed;
          
        }else if (parent.key == '9' && x1<=parent.width && y2>=0){ 
            x1 += speed;
            y1 -= speed;
            x2 += speed;
            y2 -= speed;
            x3 += speed;
            y3 -= speed;
          

        }else if (parent.key == '6' && x1 <= parent.width){ 
            x1 += speed;
            x2 += speed;
            x3 += speed;
          
        }else if (parent.key == '5'){ 
    
            x1 = x1;
            y1 = y1;
            x2 = x2;
            y2 = y2;
            x3 = x3;
            y3 = y3;
            System.out.println("The current Charlie's position is: ");
            System.out.println("(x1,y1): (" + x1 + "," + y1 + ")");
            System.out.println("(x2,y2): (" + x2 + "," + y2 + ")");
            System.out.println("(x1,y1): (" + x3 + "," + y3 + ")");
          
        }else if (parent.key == '4' && x2 >= 0){ 
            x1 -= speed;
            x2 -= speed;
            x3 -= speed;
          
        }else if (parent.key == '3' && x1 <= parent.width && y3 <= parent.height){ 
            x1 += speed;
            y1 += speed;
            x2 += speed;
            y2 += speed;
            x3 += speed;
            y3 += speed;

        }else if (parent.key == '2' && y3 <= parent.height){ 
            y1 += speed;
            y2 += speed;
            y3 += speed;
          
        }else if (parent.key == '1' && x3 >= 0 && y3 <= parent.height){ 

            y1 += speed;
            x1 -= speed;
            y2 += speed;
            x2 -= speed;
            y3 += speed;
            x3 -= speed;
        }  

     }
     /*public void area(){

     }
     public void sides(){
     
     }*/
}
