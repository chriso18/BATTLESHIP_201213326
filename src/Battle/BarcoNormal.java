package Battle;

import java.util.ArrayList;

public class BarcoNormal {
	
	//private int posicion[];
	private ArrayList<String> posicion = new ArrayList<String>();
	//private int numero_de_golpes; 
	
	public void setposiciones(ArrayList<String> pos){
		
		posicion = pos;
	}
	
    public String Verifica_acierto(String Usuario_decision){
    	
    	String resultado= "miss";
    	
    	int indice = posicion.indexOf(Usuario_decision); 
    	
    	
    	
    	
    	
    	
    	
    	/*int usuario = Integer.parseInt(Usuario_decision);
    	
    	for(int pos : posicion){
    		
    		if(usuario==pos){
    			
    			numero_de_golpes++;
    			
    			resultado= numero_de_golpes==posicion.length ? "kill" : "hit";
    			break;
    		}
    	}*/
    	
    	System.out.println(resultado);
    	
    	return resultado;
    }
	
}
