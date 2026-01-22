package unidad01;

import java.util.Scanner;

/**
 * //Compara el array para saber que número es más mayor y el número de veces que aparece en el array
		
 */

public class Ejer9 {

	/**
	 * @author 1DAW
	 * @param d array almacena los números
	 * @param e contador sale el número de veces que hay de un número
	 * @param f auxiliar ayuda a comparar los números
	 */
	
	public static void main(String[] args) {
			
			//Array de almacenamiento los números que se quieren comparar
			int[] d = {4, 7, 2, 9, 2, 5};  
			
			//Contador que dice cuantas veces sale cada número
	        int e = 0; 
	        
	      //Variable auxiliar que ayuda a comparar que número es más grande que otro
	        int f = d[0]; 
	  
	        //Compara que número es más grande
	        for (int i = 1; i < d.length; i++) { 

	            if (d[i] > f) { 

	                f = d[i]; 

	            } 

	        } 

	  
	        //Dice cuantas veces sale cada número del array
	        for (int i = 0; i < d.length; i++) { 

	            if (d[i] == f) { 

	                e++; 

	            } 

	        } 

	  
	        //Muestra el mayor número y las veces que sale el número
	        System.out.println(f + ":" + e); 
	
		
		

	}

}
