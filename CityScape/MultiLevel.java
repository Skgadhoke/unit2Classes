import java.awt.Color;
import java.awt.Graphics2D;

public class MultiLevel {

    private int numBlocks=0;
    
    private int x;
    private int y;
    
    private int w;
    private int h;
    
    boolean windowPresent=false;
    boolean doorPresent=false;
    
    BuildingBlock[] blockArray = new BuildingBlock[10];
    
    public MultiLevel()
    {
            
    }
    
    public void addBlock(int x, int y, int w, int h, boolean isWin, boolean hasDoor,
    Color winColor, boolean isWinFill, Color blockColor)
    {
        BuildingBlock block = new BuildingBlock(w,h, isWin, hasDoor);
        block.setLocation(x,y);
        block.setColor(blockColor);
        block.setColor(winColor);
        //this.numBlocks = numBlocks + 1;
        
        if(numBlocks <= 9)
        {
            blockArray[numBlocks] = block;
            numBlocks++;
        }
        System.out.println("blocks --"+numBlocks);
    }
    
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
