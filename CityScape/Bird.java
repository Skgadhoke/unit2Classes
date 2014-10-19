import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Bird
{
    
    private int x=0;
    private int y=0;
    private int w=0;
    private int h=0;
    
    Random randGenerator = new Random();
    
    int r = randGenerator.nextInt(255);
    int g = randGenerator.nextInt(255);
    int b = randGenerator.nextInt(255);
    
    boolean fillBird=true;
    Color birdColor = new Color(r,g,b);
    
    public Bird(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }   
        
    public void setBirdColor(Color col)
    {
        this.birdColor = col;
    }
    
    public void setBirdFill(boolean fill)
    {
        this.fillBird= fill;
    }
    
    public void draw(Graphics2D g2)
    {	
        try {
            
            System.out.println("===========111======"+new File(".").getAbsolutePath());
        	File file = new File((new File(".").getAbsolutePath()) +"/images/bird.png");

        	//File file = new File("/home/simarpreet/Desktop/Simar/javaprojects/CityScape/images/bigbird.png");
        	BufferedImage image = ImageIO.read(file);        	
        	BufferedImageOp op = null;        	
        	g2.drawImage(image, op, x, y);
        	
        	
        } catch (Exception e) {
        	e.printStackTrace();	
        }
        
        
    }
}

