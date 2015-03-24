package Battle;

public class Prueba_de_Barcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BarcoNormal barco = new BarcoNormal();
		
		int [] posiciones = {2,3,4,5};
		
		barco.setposiciones(posiciones);
		
		String Usuario_invitado = "2";
		
		barco.Verifica_usuario(Usuario_invitado);
		
		
		
	}

}
