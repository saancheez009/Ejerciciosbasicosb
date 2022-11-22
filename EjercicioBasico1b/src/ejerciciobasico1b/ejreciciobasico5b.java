package ejerciciobasico1b;

import java.util.Scanner;

public class ejreciciobasico5b {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
       int notasPrimerT, notasSegundoT, notasTercerT;
       double notaMedia;
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Introduzca la nota del primer trimestre");
       
	   notasPrimerT = sc.nextInt();
	   
       System.out.println("Introduzca la nota del segundo trimestre");
       
       notasSegundoT = sc.nextInt();
       
       System.out.println("Introduzca la nota del tercer trimestre");
       
       notasTercerT = sc.nextInt();
       
       notaMedia = (double) (notasPrimerT+notasSegundoT+notasTercerT)/3;
       
       System.out.println("La nota del boletín es: " + (int)notaMedia);
       
       System.out.println("La nota del expediente es: " + notaMedia);
       
       sc.close();
       
	}

}
