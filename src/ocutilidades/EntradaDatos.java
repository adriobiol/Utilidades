
package ocutilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {
    
  public static double pedirDouble(String mensaje){
	 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	 double respuesta=0;
	 boolean error;
	 do{
		 try{
			 System.out.println(mensaje);
			 respuesta=Double.parseDouble(br.readLine());
			 error=false;
		 }catch(IOException ex){
			 System.out.println("Error de entrada/salida");
			 error=true;
		 }catch(NumberFormatException ex){
			 System.out.println("No has introducido un numero decimal");
			 error=true;
		 }
	 }while(error);
	 return respuesta;
 }
 public static String pedirCadena(String mensaje){
	 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	 String respuesta="";
	 boolean error;
	 do{
		 try{
		 System.out.println(mensaje);
		 respuesta=br.readLine();
		 error=false;
		 }catch(IOException ex){
			 System.out.println("Error de entrada/salida");
			 error=true;
		 }
	 }while(error);
	 return respuesta;
 }
public static int pedirEntero(String mensaje){
	 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	 System.out.println(mensaje);
	 int numero=0;
	 boolean error=false;
	 do{
		try {
			numero = Integer.parseInt(br.readLine());
		} 
		catch (IOException ex) {
			System.out.println("Error de entrada y salida");
		} 
		catch (NumberFormatException ex){//si introducen un valor incorrecto(letras, double,...)
			System.out.println("No has introducido un nº entero.");
		}
	 }while(error);
	 return numero;
 }
public static boolean pedirBoolean(String mensaje){
	 BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	 System.out.println(mensaje);
	 boolean resp=false;
         String texto;
	 boolean error=false;
	 do{
		try {   
                        error=false;
			texto=br.readLine();
                        String text = texto.toLowerCase();
                        boolean result1 = text.contentEquals("y");
                        boolean result2 = text.contentEquals("n");
                        if(result1==true){
                            resp=true;
                        }
                        if(result2==true){
                            resp=false;
                        }
                        if (result1==false && result2==false){
                            error=true;
                            System.out.println("Error de entrada y salida");
                            System.out.println(mensaje);
                        }
		} 
		catch (IOException ex) {
			System.out.println("Error de entrada y salida");
                        error=true;
		} 
	 }while(error);
	 return resp;
 }  
}
