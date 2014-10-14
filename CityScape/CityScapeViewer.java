import javax.swing.JFrame;

public class CityScapeViewer
{
    public static int xCar = 650;
    public static int xCar2 = 0;
    /**
    * main method for the program which creates and configures the frame for the program
    */
    public static void main(String[] args)
        {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(1000 /* x */, 800 /* y */);
        frame.setTitle("Cityscape");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityScapeComponent component = new CityScapeComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        // component.
        frame.setVisible(true);
        //for
        
        for (int i=0; i < 10; i++)
        {
            int count = 0;
            System.out.println("count: " + count++);
            
            try
            {
                Thread.sleep(800);
                xCar=xCar-100;
                xCar2=xCar2+100;
                component.repaint();
                Thread.sleep(800);
            } 
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        
        
        }

}