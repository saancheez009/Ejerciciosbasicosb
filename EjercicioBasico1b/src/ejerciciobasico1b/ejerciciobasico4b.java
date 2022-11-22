package ejerciciobasico1b;

import java.util.Scanner;

public class ejerciciobasico4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  boolean lluvia ,tarea ,biblioteca ;
		  boolean permiso;
	       
	       Scanner sc = new Scanner(System.in);
	       
			System.out.println("¿Está lloviendo? ");
			
			lluvia = sc.nextBoolean();
			
			System.out.println("¿Has hecho la tarea?");
			
			tarea = sc.nextBoolean();
			
		    System.out.println("¿Quieres ir a la biblioteca?");
			
		    biblioteca = sc.nextBoolean();
		    
		    permiso =(lluvia == false && tarea == true) || biblioteca ==true;
		    
		    System.out.println("¿Puedo salir? " + (permiso ? "si":"no"));
	}

}
