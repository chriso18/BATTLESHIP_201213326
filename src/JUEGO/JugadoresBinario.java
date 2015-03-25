package JUEGO;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

	 /*String Username
	 *String Password
	 *Long Fecha de Nacimiento.
	 *char Genero
	 *Int puntos
	 * 
	 * @author DennisMG
	 */
	public class JugadoresBinario{
	    RandomAccessFile jugadores;
	    long pos=0;
	    
	    public JugadoresBinario(){
	        try{
	            jugadores=new RandomAccessFile("players.bsh","rw");
	        }catch(IOException e){
	            System.out.println("Error: "+e.getMessage());
	        }
	    }

	    public void salvarNombreViejo(String n) {
	        try{
	        RandomAccessFile nombreViejo=new RandomAccessFile("nViejo.bsh", "rw");
	        nombreViejo.seek(0);
	        nombreViejo.writeUTF(n);
	        nombreViejo.close();
	    
	        }catch(IOException e){
	            System.out.println("Error:"+e.getMessage());
	        }
	    }
	    
	    public String returnNombreViejo(){
	       String nombre="";
	        try{
	        RandomAccessFile nombreViejo=new RandomAccessFile("nViejo.bsh", "rw");
	        nombreViejo.seek(0);
	        nombre=nombreViejo.readUTF();
	        nombreViejo.seek(0);
	        nombreViejo.close();
	        
	    
	        }catch(IOException e){
	            System.out.println("Error:"+e.getMessage());
	        }
	       return nombre;
	    }


	    
	    
	    
	    public boolean agregar(String pass, String n, Date fecha, char gen)throws IOException{
	        if(!buscar(n)){
	        jugadores.seek(jugadores.length());
	        jugadores.writeUTF(n);
	        jugadores.writeUTF(pass);
	        jugadores.writeLong(fecha.getTime());
	        jugadores.writeChar(gen);
	        jugadores.writeInt(0);
	        System.out.println("creacion exitosa");
	        return true;
	        }else{
	            System.out.println("Este usuario ya existe!!");
	            return false;
	        }
	        
	    }
	    
	    public boolean buscar(String name){
	        try{
	        jugadores.seek(0);
	        while(jugadores.getFilePointer()<jugadores.length()){
	            pos=jugadores.getFilePointer();
	            if(name.equals(jugadores.readUTF())){
	                System.out.println("encontrado busqueda exitosa!!");
	                return true;   
	            }
	            jugadores.readUTF();
	            jugadores.readLong();
	            jugadores.readChar();
	            jugadores.readInt();
	        }
	            
	        }catch(IOException e){
	                System.out.println("error en la busqueda"+e.getMessage());
	        }

	        System.out.println("no encontrado Busqueda fallida");
	        return false;
	        
	    }
	    
	    public boolean validar(String pass,String n)throws IOException{
	        if(buscar(n)){
	            if(pass.equals(jugadores.readUTF())){
	                return true;
	            }else{
	                System.out.println("mal password");
	            }
	        }
	        
	        return false;
	    }
	    
	    public String getNombre(String user)throws IOException{
	        String nombre="";
	        if(buscar(user)){
	            jugadores.seek(pos);
	            nombre=jugadores.readUTF();
	        }
	        return nombre;
	    }
	    
	    public void agregarPuntos(String n, int p)throws IOException{
	        if(buscar(n)){
	            jugadores.readUTF();
	            jugadores.readLong();
	            jugadores.readChar();
	            long pos1=jugadores.getFilePointer();
	            int puntos = jugadores.readInt();
	            jugadores.seek(pos1);
	            jugadores.writeInt(puntos+p);
	            
	        }
	                
	    }
	    
	    public void actualizarDatos(String n,String New, Date f, char s)throws IOException{
	        if(buscar(n)){
	            jugadores.seek(pos);
	            jugadores.writeUTF(New);
	            System.out.println("se escribio el nuevo nombre");
	            jugadores.readUTF();
	            System.out.println("se leyo el password");
	            jugadores.writeLong(f.getTime());
	            jugadores.writeChar(s);
	            jugadores.readInt();
	            System.out.println("Actualizacion exitosa");
	        }
	        
	        /*if(buscar(n)){
	            jugadores.seek(pos);
	            while(jugadores.getFilePointer()<jugadores.length()){
	                String nombre=jugadores.readUTF();
	                    if(n.equals(nombre)){
	                        String pass=jugadores.readUTF();
	                        long fecha=jugadores.readLong();
	                        char sexo=jugadores.readChar();
	                        int puntos= jugadores.readInt();
	                        long posfinal=jugadores.getFilePointer();
	                    }
	                
	                
	            }
	        }*/
	       
	    }
	    
	    
	          
}
