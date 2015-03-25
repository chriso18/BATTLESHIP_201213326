package JUEGO;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class Portaviones extends Barco {
	 public Portaviones(int x, int y){
	        super(x,y);
	        bombas=5;
	        String path2="C:/Users/christian/Documents/Christian/PROGRAMACION/ProyectoProgra2_Battleship/src/proyectoprogra2/images/portaviones.png";
	        URL url2 = this.getClass().getResource(path2);
	        ImageIcon img2=new ImageIcon(url2);
	        imagen=new ImageIcon(img2.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
	    }

	    
	    @Override
	    public boolean bombardear() {
	        if(hundido==false && bombas>0){
	            
	        }
	        
	        return false;
	            
	    }
}
