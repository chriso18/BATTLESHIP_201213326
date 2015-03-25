package Battle;

public class BarcoNormal {
	
	private int posicion[];
	private int numero_de_golpes; 
	
	public void setposiciones(int pos[]){
		
		posicion = pos;
	}
	
    public String Verifica_acierto(String Usuario_decision){
    	
    	String resultado= "miss";
    	
    	int usuario = Integer.parseInt(Usuario_decision);
    	
    	for(int pos : posicion){
    		
    		if(usuario==pos){
    			
    			numero_de_golpes++;
    			
    			resultado= numero_de_golpes==posicion.length ? "kill" : "hit";
    			break;
    		}
    	}
    	
    	System.out.println(resultado);
    	
    	return resultado;
    }
	
}
