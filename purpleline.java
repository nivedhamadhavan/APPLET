package applet;
import java.applet.Applet;

import java.awt.Color;

import java.awt.Graphics;

 

 

/*

<applet code="SetGraphicsColorExample" width=200 height=100>

</applet>

*/

 

 

public class purpleline  extends Applet{

 

	public void paint(Graphics g) {

		Color PURPLE =new Color(255,0,255);

		/*

		 * Graphic objects like lines and rectangles uses current

		 * foreground color.

		 * 

		 * To change the current graphic color use

		 * void setColor(Color c) method of Graphics Class.

		 */

		

		//this will create light blue color

		Color customColor = new Color(10,10,255);

		

		g.setColor(PURPLE);

		g.drawLine(5,5,30,30);

		
	}
}

