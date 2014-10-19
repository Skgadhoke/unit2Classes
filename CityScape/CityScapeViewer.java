import javax.swing.JFrame;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
public class CityScapeViewer
{
	public static int xCar = 700;
	public static int xCar2 = -5;
	public static int birdX = -50;
	public static int birdY=50;
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
        //  component.
        frame.setVisible(true);
        //for
        int counter=0;
        
        	for (int i=0; i < 12; i++)
            {	
            	counter++;
            	
    	        try
    	        {    	        	
    				Thread.sleep(500);
    				xCar-=100;
    				xCar2+=100;
    				
    				if (counter<5)
    				{
    					birdX +=100;
    					birdY +=50;
    					
    				}
    				
    				else if(counter > 5 && counter < 9 )
    				{
    					birdX +=100;
    					birdY -=50;
    					
    				}
    				
    				else
    				{
    					birdX += 100;
    					
    				}
    				
    				component.repaint();
    				Thread.sleep(500);
    			} catch (Exception e) 
    		        {
    					e.printStackTrace();
    				}
            }
        }        

	        
    }




