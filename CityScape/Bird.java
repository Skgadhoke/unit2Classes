import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;

import javax.imageio.ImageIO;
/**
 * Bird Class
 * @author Simar
 *
 */
public class Bird
{  
	// declaring variables
    private int x;
    private int y;
    private int w;
    private int h;
    
    //constructor class takes in 2 parameters
    public Bird(int x, int y)
    {
        this.x = x;
        this.y = y;
    }   
    
    // read and draw the image file
    public void draw(Graphics2D g2)
    {	
        try {            
            File file = new File((new File(".").getAbsolutePath()) +"/images/bird.png");
        	BufferedImage image = ImageIO.read(file);        	
        	BufferedImageOp op = null;        	
        	g2.drawImage(image, op, x, y);
        } catch (Exception e) {
        	e.printStackTrace();	
        }        
    }
}

