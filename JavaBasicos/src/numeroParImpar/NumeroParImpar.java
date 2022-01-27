package numeroParImpar;
import java.util.Scanner;

public class NumeroParImpar {
	public static void main (String [] args) {
		System.out.println("Ingresa el numero");
		Scanner input = new Scanner (System.in);
		 int numero = input.nextInt();
		
		 /*if (numero % 2 == 0) {
			 System.out.println("Es un número par");
		 }
		 else {
			 System.out.println("Es un número inpaar");
		 }*/
		 
		 String resultado = (numero%2 == 0) ? "El numero es par" : "El numero es inpar";
			 System.out.println(resultado);
			 
		
	}

}
