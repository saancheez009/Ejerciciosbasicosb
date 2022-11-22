package ejerciciobasico1b;

import java.util.Scanner;

public class ejerciciobasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bs = new Scanner(System.in);
	       //importamos el scanner
		//introducimos las variables numero y par.YLA VARIABLE RESULTADO EN BOOLEANO
	       int numero;
	       int par;
	       boolean resultado;
	       //PEDIMOS AL USUARIO QUE INTRODUZCA UN NUMERO
	       System.out.println("Por favor introduzca un número: ");
	       
	       numero = bs.nextInt();
	       //DECLARAMOS QUE SI EL NUMERO AL DIVIDIRSE EN 2 DE RESTO QUEDA 0 es par y es true
	       par = numero % 2;
	      
	       resultado =  par ==0;
	        //le mostramos al usuario el resultado de su numero dependientemente de si es par o impar el resultado cambia a true o false
	       System.out.println(resultado);
	        

		
	}

}
