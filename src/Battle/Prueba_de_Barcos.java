package Battle;

import java.util.Random;
import java.util.Scanner;

public class Prueba_de_Barcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Random rand = new Random();

		BarcoNormal barco = new BarcoNormal();
		
		//String Usuario_invitado = "1";(1)
		String Usuario_decision;
		
		int numero_aciertos=0;
		
		boolean barco_esta_vivo=true;
		
		int temp = rand.nextInt(5)+1;
		
		int [] posiciones = {temp,++temp,++temp};
		//int [] posiciones = {2,3,4};
		
		barco.setposiciones(posiciones);

		//barco.Verifica_usuario(Usuario_invitado);(1)
		
		while(barco_esta_vivo){
			String resultado;
			System.out.println("ingresa donde creas que esta el barco");
			Usuario_decision = entrada.nextLine();
			resultado = barco.Verifica_acierto(Usuario_decision);
			numero_aciertos++;
			
			if(resultado.equals("kill")){
				barco_esta_vivo=false;
			}
		}
		
		System.out.println("has hecho " + numero_aciertos + " intentos para hundir la nave" );
		
	}

}
