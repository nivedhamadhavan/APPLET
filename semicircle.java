package applet;
import java.applet.Applet;  
import java.awt.*;  
  
public class arc extends Applet{  
  
public void paint(Graphics g){  
g.setColor(Color.blue);  
g.fillArc(360,300,90,90,0,180);  
g.setColor(Color.yellow);  
g.fillArc(20, 20, 100, 100, 180, 180);
  }  
}  
