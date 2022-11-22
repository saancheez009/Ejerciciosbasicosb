package ejerciciobasico1b;

import java.util.Scanner;

public class ejerciciobasico2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importamos el scanner
		//introducimos las variables edad y mayorEdad en booleano
    int edad;
    boolean mayorEdad;

    Scanner bs = new Scanner(System.in);
    //le pedimos al usuario que introduzca su edad

    System.out.println("Introduzca su edad: ");

    edad = bs.nextInt();
//declaramos que verdadero es la mayoria de edad +18
    mayorEdad = edad>=18;
//le mostramos al usuario si es mayor de edad o no
    System.out.println("Usted es mayor de edad: " + (edad>=18)); 
    
    
    
	}

}


/*Scanner bs = new Scanner(System.in);

int edad;
boolean mayoria;

System.out.println("Por favor, escriba su edad: ");

edad = bs.nextInt();

mayoria = edad>=18 ? true : false;
 
System.out.println(mayoria);*/
 
