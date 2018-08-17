package applet;
import java.applet.*;

import java.awt.*;

public class oval extends Applet {

	public void paint(Graphics g){

	Color PURPLE =new Color(255,0,255);

	g.setColor(PURPLE);

	g.drawOval(20,20,60,60);

	g.fillOval(20, 20, 60, 60);



	}
}
