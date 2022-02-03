//import java.util.Scanner;

//Pedir al usuario 2 numeros por consola y preguntarle que operacion desea realizar
/*1) Suma 
 *2) Resta
 *3) Multiplicacion
 *4) Division
 *
 *e imprimir en consola el resultado de la operacion que solicito
 * */

/*public class Calculadora {
	public static void main( String [] args) {
		
		System.out.println("Porfavor selecciones una opcion de nuestras cuatro operaciones:"
				+ "\n 1)Suma " + "\n 2)Resta" + "\n 3)Multiplicacion" + "\n 4)Division");
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();
		System.out.println("Porfavor ingrese su primer valor");
		float numero1 = sc.nextInt();
		System.out.println("Porfavor ingrese su segundo valor");
		float numero2 = sc.nextInt();
		
		float suma = numero1 + numero2;
		float resta = numero1 - numero2;
		float multiplicacion = numero1 * numero2;
		float division = numero1 / numero2;
		
		switch(opcion) {
	    case "1":
	    	System.out.println("El resultado de su opercion es el siguiente: " + suma);
	    	break;
	    case "2":
	    	System.out.println("El resultado de su opercion es el siguiente: " + resta);
	    	break;
	    case "3":
	    	System.out.println("El resultado de su opercion es el siguiente: " + multiplicacion);
	    	break;
	    case "4":
	    	if (numero2 != 0) {
	    		System.out.println("El resultado de su opercion es el siguiente: " + division);
	    	} else if ( numero2 == 0) {
	    		System.out.println("Su operacion no se puede realizar ya que no se puede dividir entre 0");
	    	}
	    	
	    	break;
	    default:
	    	System.out.println("Que me tratates de decir :-)");
		}
		
		
	}

}*/
