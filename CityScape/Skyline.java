import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Skyline Class
 *   
 * @author Simar
 *
 */
public class Skyline {
	// assigning car object variables
	int width = 110;
	int height = 400;
	int buildingDis = 50;
	int xCar = 700;
	int xCar2 = -5;
	
	// assigning building block object variables
	int x=5;
	int y=350;
	int w=100;
	int h=300;
	
	// assigning Car object variables
	int birdX=-50; 
    int birdY=50;
 	
	int w2 = w;
	int x2 = x;
	
	// create random object so the colors changed randomly
	Random randGenerator= new Random ();
	
	int r = randGenerator.nextInt(255);
	int g = randGenerator.nextInt(255);
	int b = randGenerator.nextInt(255);
	
	int count =0;
	
	Color bCol = new Color(r,g,b);
	Color Col = new Color(r,g,b);
	
	public Skyline() {
		
	}
	// draws building blocks, cars, birds
	public void draw(Graphics2D g2)
	{	
		Rectangle Bakground = new Rectangle(0,0,1000,1000);
		g2.setColor(bCol = new Color(50,0,100));
		g2.fill(Bakground);
		g2.draw(Bakground);
		
		Road street = new Road(0,650,1000,70);
		street.draw(g2);
		
		MultiLevel blocks = new MultiLevel();
		
		for (int i=0; i<3; i++)
		{	
			r = randGenerator.nextInt(255);
			g = randGenerator.nextInt(255);
			b = randGenerator.nextInt(255);
			
			blocks.addBlock(x, y, w, h, true, false, Col, true, Col);
			
			blocks.addBlock(x2+w2+60, y, w,h,true,false,Col,true,Col);
			
			blocks.draw(g2);
			
			x2 += 10;
			
			h = h/2;
			y -= h+2;
			w -= 10;
			
			width= randGenerator.nextInt(300)+100;
			
			height = width +20;
			
			r = randGenerator.nextInt(255);
			g = randGenerator.nextInt(255);
			b = randGenerator.nextInt(255);
			
			
		}
		
		int x=85;
		int y=400;
		int w=80;
		int h=250;
		
		x= x+w+w+120;
		
		blocks.addBlock(x, y, w+150, h, true, false, Col = new Color (r,100,b), true, Col = new Color(r,100,b));
		
		y = y-(h/2)-2;
		w= w + (w+150)/2;
		blocks.addBlock(x+10, y, w, h/2, true, false, Col = new Color(r,g,50), true, Col = new Color(r,g,50));
		
		y = y-(h/2)-2;
		w= w/2+w/4;
		blocks.addBlock(x+w/4, y, w, h/2, true, false,Col = new Color(r,g,200), true, Col = new Color(r,40,120));
		
		blocks.draw(g2);
		
		Color newCol = new Color(200,g,200);
		
		// new building
		blocks.addBlock(x+2*w, y+35, w+150, h+220, true, false, newCol, true, newCol);
		
		blocks.draw(g2);
		
		int r = randGenerator.nextInt(255);
		int g = randGenerator.nextInt(255);
		int b = randGenerator.nextInt(255);
		
		// creating cars
		Color carCol = new Color (r,g,b);
		
		Car car2 = new Car(CityScapeViewer.xCar2,560, 200,70);
		car2.setCarFill(true);
		car2.setCarColor(carCol);
		
		car2.draw(g2);
		
		Car car = new Car(CityScapeViewer.xCar,600, 200,70);
		car.setCarFill(true);
		car.setCarColor(carCol = new Color(50,g,100));
		
		car.draw(g2);
		
		// creating bird
	     Bird bird = new Bird(CityScapeViewer.birdX, CityScapeViewer.birdY);
	     bird.draw(g2);
	}
}
