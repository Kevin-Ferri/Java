package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;



@SuppressWarnings("serial") 
public class Legos2 extends JFrame {
	public int startX, startY, legoWidth, legoHeight;
	int baseLength;
	int arrayLength;
	public Legos2 (){
		
		super("Ferri");
		startX = 20;
		startY = 300;
		legoWidth = 50;
		legoHeight = 20;
		baseLength = 10;

	}

	public void paint (Graphics g)
	{
		
		super.paint(g);
	
		Color[] color;
		color = new Color[9];
		
		color[0]=Color.red;
		color[1]= Color.blue;
		color[2]= Color.yellow;
		color[3]= Color.green;
		color[4]= Color.pink;
		color[5]= Color.black;
		color[6]= Color.magenta;
		color[7]= Color.orange;
		color[8]= Color.cyan;
		
		arrayLength=color.length; //used to go through colors 0-8

		int row=0;		
		
		while (baseLength>0)
		{
			for (int col = 0; col<baseLength; col++)
			{
				Random i = new Random();
				int x = i.nextInt(arrayLength);
			g.setColor(color[x]);
			g.fillRoundRect(startX, startY, legoWidth, legoHeight, 2, 2);
			startX=startX+50;	//build blocks to the right
				
			}

			startY = startY-20; //build blocks up
			row++; //adjust for the row
			startX= 20+((legoWidth/2)*row); //shift the row over a little
			
			baseLength--;
			
		}
		
	}

	public static void main(String arge[]){
		
		Legos2 app = new Legos2();
		app.setSize(550, 325);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
}
