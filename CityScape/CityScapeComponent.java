import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CityScapeComponent extends JComponent
{
    public CityScapeComponent()
        {
        
        }
    
    public void buildingRect()
    {
    
    }
    
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //int xCar = 650;
        Skyline skyline = new Skyline();
        skyline.draw(g2);
        
        try {
        Thread.sleep(1000);
        //skyline.r
        } catch (Exception e) {
        e.printStackTrace();
        }
    
    }

}