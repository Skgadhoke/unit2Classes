import java.awt.Color;
import java.awt.Graphics2D;
/**
 * MultiLeveld Class
 * @author Simar
 *
 */
public class MultiLevel {

	// declaraing variables
    private int numBlocks;
    
    private int x;
    private int y;
    
    private int w;
    private int h;
        
    // boolean variables
    boolean windowPresent=false;
    boolean doorPresent=false;
    
    BuildingBlock[] blockArray = new BuildingBlock[10];
    
    // empty constructor 
    public MultiLevel()
    {
            
    }
    /**
     * @param takes of type int x position
     * @param takes of type int y position
     * @param takes of type int width
     * @param takes of type height 
     * @param takes of type boolean window present or not
     * @param takes of type boolean door present or not
     * @param taked of type Color window color
     * @param takes of type boolean window filled or not
     * @param takes of type Color for block 
     */
    public void addBlock(int x, int y, int w, int h, boolean isWin, boolean hasDoor,
    Color winColor, boolean isWinFill, Color blockColor)
    {
        BuildingBlock block = new BuildingBlock(w,h, isWin, hasDoor);
        block.setLocation(x,y);
        block.setColor(blockColor);
        block.setColor(winColor);        
        // can't have more than 10 blocks stacked 
        if(numBlocks <= 9)
        {
            blockArray[numBlocks] = block;
            numBlocks++;
        }
        System.out.println("blocks --"+numBlocks);
    }
    
    // draws the blocks
    public void draw(Graphics2D g2)
    {
        BuildingBlock block ;
        System.out.println("blocks "+numBlocks);
        for (int i = 0; i < numBlocks; i++)
        {
            block = blockArray[i];
            block.drawBlocks(g2);
        }
    }

}
