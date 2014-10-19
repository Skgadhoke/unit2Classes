import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.*;
import java.awt.BasicStroke;
/**
 *Road Class
 * @author Simar
 *
 */
public class Road 
{
    // declares variables
    private int x;
    private int y;
    private int w;
    private int h;
    
    Color roadCol = new Color(0,0,0);
    Color dividerLine = new Color(255,255,255);
    
    // constructor class takes in 4 parameters of type int
    public Road(int x, int y, int w, int h)
        {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        
        }
    
    // draws the street and the divider line
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle(x,y,w,h);
        
        g2.setColor(roadCol);
        g2.draw(road);
        g2.fillRect(x,y,w,h);
        
        g2.setColor(dividerLine);
        Stroke preStroke = g2.getStroke();
        BasicStroke stroke = new BasicStroke(3.0f);
        g2.setStroke(stroke);
        
        // draw line
        g2.drawLine(x, y+(h/2), x+w,y+(h/2));
        g2.setStroke(preStroke);
    }
}