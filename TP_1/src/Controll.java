import java.math.BigInteger;
import java.util.*;
public class Controll {
	
	
// Operaciones 
	
	private static int generateRand(int minimo, int maximo) {
		Random random = new Random();
		int nro = minimo+random.nextInt(maximo-minimo+1); //Entre 4 y 23
		return nro;
	}
	
	
	/**
	 * Se generan los valores para las filas y columnas
	 */
	public static int[] conseguirValores(int longitud, int sumatoria, int minimos, int maximos){
		String cadena ="";
		int [] conj = new int[longitud];
		int suma =0;
		while( suma != sumatoria){
			suma = 0;
			for(int x=0; x<longitud; x++) {
				conj[x] = generateRand(minimos, maximos);
			}
			
			for(int i=0; i<longitud; i++) {
				suma+=conj[i];
				cadena+= " "+conj[i];
			}
			
		}
		
		return conj;
	}
	
	public static boolean sumatoriaCorrecta(int[] collection, int sumatoria) {
		int suma = 0;
		for(Integer I: collection) {
			suma += I;
		}
		
		return (suma == sumatoria);
	}
	


	public static boolean validarSoloEnteros(String message) {
		if(message.length() == 0) {
			return false;
		}
		int x = 0;
		while(x < message.length()) {
			if(message.charAt(x)!='0' && message.charAt(x)!='1' && message.charAt(x)!='2' && message.charAt(x)!='3' && message.charAt(x)!='4' &&
					message.charAt(x)!='5' && message.charAt(x)!='6' && message.charAt(x)!='7' && message.charAt(x)!='8' && message.charAt(x)!='9' && message.charAt(x)!='-') {
				return false;
			}
			
			x++;
		}
		
		return true;
	}
}
