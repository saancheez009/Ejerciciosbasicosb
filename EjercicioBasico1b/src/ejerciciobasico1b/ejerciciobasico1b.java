package ejerciciobasico1b;

import java.util.Scanner;

public class ejerciciobasico1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// PRIMERO IMPORTAMOS EL SCANNER 
		Scanner sc = new Scanner(System.in);
	
		//DECLARAMOS LAS VARIABLES, MANZANAS Y PERAS
		
		double manzanas;
		
		double peras;
		
		//PEDIMOS AL USUARIO QUE INTRODUZCA EL NÚMERO DE KILOS DE PERAS Y MANZANAS VENDIDOS EN UN AÑO
		
		System.out.println("Introduzca el número de kilos vendidos en un año de manzanas: " );
		
	    manzanas = sc.nextDouble();
		
		System.out.println("Introduzca el número de kilos vendidos en un año de peras: " );
		
		peras = sc.nextDouble();
		
		//DECLARAMOS LAS CONSTANTES DEL PRECIO DE MANZANAS  Y PERAS YA QUE NO CAMBIAN LOS PRECIOS
		
		final double PRECIO_MANZANAS = (double) 2.35;
			
		final double PRECIO_PERAS = (double) 1.95;
		
		// MULTIPLICAMOS AL PRECIO DE PERAS Y MANZANAS EL NUMERO DE KILOS VENDIDOS UTILIZANDO EL OPERA Y ASIGNA
		
		manzanas *= PRECIO_MANZANAS;
		
		peras *= PRECIO_PERAS;
		
		//FINALMENTE DECLARAMOS LA VARIABLE PRECIO CON EL RESULTADO FINAL Y MOSTRAMOS AL USUARIO EL IMPORTE TOTAL
		
	    double precio = (double) (manzanas+peras);
		
		System.out.println("El importe total es: "  + precio+ " euros");

	}

}
