package cs520.hw4;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial") //a serial warning keeps coming up, good to use to continue with the program
public class Legos1 extends JFrame {

	public int startX, startY, legoWidth, legoHeight;
	int baseLength;
	
	public Legos1 (){
		
		super ("Ferri");
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;	
		

	}
	
	public void paint (Graphics g)
	{
		
		super.paint(g);
		int row=0;
		while (baseLength>0)
		{
			g.setColor(Color.red);
			
			for (int col = 0; col<baseLength; col++)
			{

			g.fillRoundRect(startX, startY, legoWidth, legoHeight, 2, 2);
			startX=startX+50;	//build blocks to the right
			if (col%2 == 0)
				g.setColor(Color.blue); //if baseLength is even
			else g.setColor(Color.red); //if baseLength is odd
			
				
			}

			startY = startY-20; //build blocks up
			row++; //adjust for the row
			startX= 20+((legoWidth/2)*row); //shift the row over a little
			
			baseLength--;
			
		}
		
	}
	
	public static void main(String arge[]){
		
		Legos1 app = new Legos1();
		app.setSize(550, 325);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
}
