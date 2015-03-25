package JUEGO;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


public class Acorazado extends Barco {
	 public Acorazado(int x, int y){
	        super(x,y);
	        this.bombas=4;
	        String path2="/proyectoprogra2/images/acorazado.png";
	        URL url2 = this.getClass().getResource(path2);
	        ImageIcon img2=new ImageIcon(url2);
	        imagen=new ImageIcon(img2.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	    }

	    @Override
	    public boolean bombardear() {
	        throw new UnsupportedOperationException("Not supported yet.");
	    }
}
