package applet;
import java.applet.*; 

import java.awt.*;



public class imageapplet extends Applet { 

   Image img;

   MediaTracker tr;

   public void paint(Graphics g) {

      tr = new MediaTracker(this);

      img = getImage(getCodeBase(), "baby.jpg");

      tr.addImage(img,0);

      g.drawImage(img, 0, 0, this);

   } 

}
