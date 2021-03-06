import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

/**
 * BuildingBlocks which will create my rectangle blocks
 * @author Simar
 *
 */
public class BuildingBlock
{
    
    //member variables of the blocks
    private int blockX=0;
    private int blockY=0;
    private int blockH=0;
    private int blockW=0;
    private int dis = 10;
    
    //member variables of the door
    private int doorH =0;
    
    //boolean operators
    boolean winPresent = true;
    boolean doorPresent = true;
    boolean fillBlock = true;
    
    // creaate random and color
    Random randColor = new Random();
    int r = randColor.nextInt(255);
    int g = randColor.nextInt(255);
    int b = randColor.nextInt(255);
    
    //creating objects
    Color color = new Color(r,g,b);
    Window winBlock = null;
    
    /**
     * initalizes member variables and it checks whether windows and door are present
     * @param takes an int width
     * @param takes an int height
     * @param takes a boolean isWin
     * @param takes a boolean hasDoor
     * 
     */
    public BuildingBlock(int w, int h, boolean isWin, boolean hasDoor )
    {
        this.blockW = w;
        this.blockH = h;
        this.winPresent = isWin;
        this.doorPresent = hasDoor;
        
        if (hasDoor)
        {
            this.doorH = this.blockH/10;
        }
        
        if (winPresent)
        {
            createWindow();
        }
        
    }
    
    /**
     * Creates my windows and door 
     */
    private void createWindow()
    {
        int dis = 10;        
        int xWin = this.blockX + dis;
        int yWin = this.blockY + this.blockH-dis;
        
        if (doorPresent)
        {
            yWin = yWin-(doorH);
        }
        
        winBlock = new Window(xWin, yWin, 10,10);
    }    
    /**
     * @param takes an int width
     * @param takes an int height
     * overloaded constructor that allows to take 2 parameters instead of 4
     */
    public BuildingBlock(int w, int h)
    {
        this.blockW = w;
        this.blockH = h;
        this.winPresent= false;
        this.doorPresent = false;
    }    
    /**
     * methods for setting the positions
     * @param xPos
     * @param yPos
     */
    public void setLocation(int xPos, int yPos)
    {
        this.blockX = xPos;
        this.blockY = yPos;
    }    
    /**
     * set block
     * @param wPos
     */
    public void setBlockW(int wPos)
    {
        this.blockW = wPos;
    }
    /**
     * 
     * @param hPos
     */
    public void setBlockH(int hPos)
    {
        this.blockH = hPos;
    }
    //methods for setting attributes of the building blocks
    public void setColor(Color col)
    {
        this.color = col;
    }
    
    public void setBlockFill(boolean fill)
    {
        this.fillBlock = fill;
    }    
    //draws building blocks
    public void drawBlocks(Graphics2D g2)
    {
        BasicStroke s = new BasicStroke(2.0f);
        g2.setStroke(s);
        
        Rectangle Block = new Rectangle(blockX,blockY,blockW,blockH );
        g2.draw(Block);
        
        if (fillBlock)
        {
            g2.setColor(color);
            g2.fillRect(blockX,blockY,blockW,blockH);
            
        }
        if (winPresent)
            {
            
            int maxRows = ((this.blockH-doorH)/(winBlock.getWindowHeight()+dis));
            int maxCol = (this.blockW/(winBlock.getWindowWidth()+dis));
            
            int xPoint = this.blockX + dis;
            int yPoint = this.blockY + this.blockH - winBlock.getWindowHeight() - dis;
            
            winBlock.setWinX(xPoint);
            winBlock.setWinY(yPoint);
            int prevX = xPoint;
            
            for (int y=0; y<maxRows; y++)
                {
                
                if(y ==18)
                {
                    winBlock.setWinFill(false);
                }
                
                for (int x=0; x<maxCol; x++)
                {
                    winBlock.setWinX(xPoint);
                    winBlock.draw(g2);
                
                    xPoint += 20;
                
                }
                    yPoint -= 20;
                    xPoint = prevX;
                    winBlock.setWinY(yPoint);
                    winBlock.setWinX(xPoint);
                
            }
        }
    }
}
