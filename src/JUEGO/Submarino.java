package JUEGO;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


public class Submarino  extends Barco {
	 public Submarino(int x, int y){
	       super( x, y);
	       String path2="C:/Users/christian/Documents/Christian/PROGRAMACION/ProyectoProgra2_Battleship/src/proyectoprogra2/images/submarino.png";
	       URL url2 = this.getClass().getResource(path2);
	       ImageIcon img2=new ImageIcon(url2);
	       imagen=new ImageIcon(img2.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	   }

	    @Override
	    public boolean bombardear() {
	        throw new UnsupportedOperationException("Not supported yet.");
	    }
	        
}
