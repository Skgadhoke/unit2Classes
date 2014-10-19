import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
 * 
 *Window Class
 * @author Simar
 *
 */
public class Window {
    
    //member variables of window
    private int xWin=0;
    private int yWin=0;
    private int wWin=0;
    private int hWin=0;
    
    //member variables for window line
    private int x1=0;
    private int y1=0;
    private int x2=0;
    private int y2=0;
    
    
    //boolean operators
    boolean windowFill = true;
    
    //color of the window
    Color colWin = new Color(20,20,20);
    
    //constructor class takes in 4 paramters of type int
    public Window(int xWin, int yWin, int wWin, int hWin)
    {
        this.xWin = xWin;
        this.yWin = yWin;
        this.wWin = wWin;
        this.hWin = hWin;
    }
    
    //methods for setting the positions and the dimensions of the window
    public void setWinX(int x)
    {
        this.xWin = x;
    }
    
    public void setWinY(int y)
    {
        this.yWin = y;
    }
    
    public void setWinH(int h)
    {
        this.hWin = h;
    }
    
    //methods for getting the positions and the dimensions of the window
    public int getWindowHeight()
    {
        return this.hWin;
    }
    
    public int getWindowWidth()
    {
        return this.wWin;
    }
    
    public void setWinW(int w)
    {
        this.xWin = w;
    }
        
    /**
     * @param type Color window color
     */
    public void setWinColor(Color colWin)
    {
        this.colWin = colWin;
    }
    /**
     * @param type boolean window filled or not
     */
    public void setWinFill(boolean windowFill)
    {
        this.windowFill = windowFill;
    }
    //draws the windows
    public void draw(Graphics2D g2)
        {
        BasicStroke s = new BasicStroke(2.0f);
        g2.setStroke(s);
        Rectangle window = new Rectangle(xWin,yWin,wWin,hWin);
        
        g2.setColor(colWin);
        g2.draw(window);
        if (windowFill)
            {
            g2.fillRect(xWin,yWin,wWin,hWin);
            
            //sets the value for the window line
            
            x1=xWin;
            y1=yWin + (hWin/2);
            x2=xWin+wWin;
            y2=y1;
            
            Color lineWin = new Color(0,0,255);
            
            g2.setColor(lineWin);
            
            g2.drawLine(x1,y1,x2,y2);
       }
    }
}