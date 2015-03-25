package JUEGO;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


public class Destructor  extends Barco {
	  public Destructor( int x, int y){
	        super(x,y);
	        /*String path2="/proyectoprogra2/images/destructor.png";
	        URL url2 = this.getClass().getResource(path2);
	        ImageIcon img2=new ImageIcon(url2);
	        imagen=new ImageIcon(img2.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));*/
	    }

	    @Override
	    public boolean bombardear() {
	        throw new UnsupportedOperationException("Not supported yet.");
	    }
}
