import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Polygon;

public class Car 
{
    // declarations for the main body of the car
    private int x;
    private int y;
    private int w;
    private int h;
    
    //declarations for the width of the top boyd of the car
    private int wTop;
    
    //tire declarations
    private int hTire;
    private int wTire;
    
    // color declarations
    private int r=0;
    private int g=0;
    private int b=0;
    
    Color carColor = new Color(r,g,b);
    boolean fillCar = true;
    
    
    public Car(int x, int y, int w, int h)
    {        
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;        
    }
    
    public void setCarColor(Color col)
    {
        this.carColor = col;
    }
    
    public void setCarFill(boolean fill)
    {
        this.fillCar = fill;
    }
    
    public void draw(Graphics2D g2)
        {
        Rectangle body = new Rectangle(x,y,w,h);
        wTop=w/3;
        Rectangle topBody= new Rectangle(x + wTop, y- (h/2) - 10, wTop,h/2 +10);
        
        int xFrontPoints [] = {x+wTop/2, x+wTop, x+wTop};
        int xBackPoints [] = {x+2*wTop, x+2*wTop+wTop/2, x+2*wTop};
        int yPoints [] = {y, y, y-(h/2)-10};
        
        Polygon triangleFront = new Polygon(xFrontPoints, yPoints, 3);
        Polygon triangleBack = new Polygon(xBackPoints, yPoints, 3);
        
        wTire = w/4;
        hTire = wTire;
        
        
        Ellipse2D.Double frontTires = new Ellipse2D.Double(x+wTop - (wTop/3),y+h-5,wTire,hTire);
        Ellipse2D.Double backTires = new Ellipse2D.Double(x+2*wTop,y+h-5,wTire,hTire+5);
        
        g2.draw(body);
        g2.fillRect(x, y, w, h);
        
        g2.draw(topBody);
        g2.fillRect(x + wTop, y- (h/2) - 10, wTop,h/2 +10);
        
        g2.draw(triangleFront);
        g2.fillPolygon(xFrontPoints, yPoints, 3);
        
        g2.draw(triangleBack);
        g2.fillPolygon(xBackPoints, yPoints, 3);
        
        g2.setColor(carColor);
        g2.draw(frontTires);
        g2.fillOval(x+wTop - (wTop/3),y+h-5,wTire,hTire+5);
        
        g2.setColor(carColor);
        g2.draw(backTires);
        g2.fillOval(x+2*wTop,y+h-5,wTire,hTire+5);
        
        }

}