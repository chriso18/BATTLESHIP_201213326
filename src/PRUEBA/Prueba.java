package PRUEBA;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;


public class Prueba {
	public static void main(String[] args)
	{
		Ventana v=new Ventana();
		v.setVisible(true);
	}
}
class Ventana extends JFrame{
	public Ventana()
	{
		this.setTitle("Tablero");
		this.setSize(500,500);
		Tablero tablero=new Tablero();
		add(tablero);
	}

}
class Tablero extends JPanel{
	private JLabel[][] tablero=new JLabel[10][10];
        private JButton btn1=new JButton("1");
	private JButton btn2=new JButton("2");
	private JButton btn3=new JButton("3");
	private JButton btn4=new JButton("4");		
	public Tablero()
	{
	for(int x=0;x<9;x++){
            for(int y=0;y<9;y++){
                tablero[x][y]=new JLabel("Hola");
                
                this.add(tablero[x][y]);
            }
        }
            
            this.setLayout(new GridLayout(8,8));
            
            String path="/proyectoprogra2/images/b2.png";
            URL url = this.getClass().getResource(path);
            //ImageIcon img=new ImageIcon(url);
            //ImageIcon imagen=new ImageIcon(img.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
            int x, y;
            x=(int)(Math.random()*8);
            y=(int)(Math.random()*8);
            System.out.println(x+" - "+y);
            //tablero[0][0].setIcon(imagen);
            
            
		//this.add(btn1);this.add(btn2);
		//this.add(btn3);this.add(btn4);
		OyenteBoton oBoton=new OyenteBoton();
		btn1.addActionListener(oBoton);
		btn2.addActionListener(oBoton);
		btn3.addActionListener(oBoton);
		btn4.addActionListener(oBoton);
	}
	class OyenteBoton implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("1"))
			{
				System.out.println("Usted presiono el Boton 1");
			}else if(e.getActionCommand().equals("2"))
			{
				System.out.println("Usted Presiono el Boton 2");
			}else if(e.getActionCommand().equals("3"))
			{
				System.out.println("Usted Presiono el Boton 3");
			}else if(e.getActionCommand().equals("4"))
			{
				System.out.println("Usted Presiono el Boton 4");	
			}
		}
	}	
}
