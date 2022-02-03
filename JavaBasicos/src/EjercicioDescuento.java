// solicitar el total de una compra por consola.
// si la cuenta es de menos de 1000
// sila cuenta es de 1000 - 4999 10%
// si la cuenta es de 5000 a 9999 20%
// si la copra es de 10000 o más 30%
// imprimir el total con los descuentos incluidos

/*import java.util.Scanner;

public class EjercicioDescuento {
	public static void main( String [] args) {
		
	System.out.println("Introusca el valor o monto total de su compra: ");
	Scanner scanner = new Scanner(System.in);
	int compra= scanner.nextInt();
	double des10 = 0.10;
	double des20 = 0.20;
	double des30 = 0.30;
	int multiplicacion1 = (int) (compra * (des10));
	int multiplicacion2 = (int) (compra * (des20));
	int multiplicacion3 = (int) (compra * (des30));
	int resta1 = compra - multiplicacion1; 
	int resta2 = compra - multiplicacion2; 
	int resta3 = compra - multiplicacion3; 
	if (compra < 1000) {
		System.out.println("Lamentamos informales que no se pude aplicar ningun descuento");
	} else if (compra <= 4999) {
		System.out.println("Me es grato informal que su descuento es del 10%: $" + multiplicacion1 +"." + " El total a pagar es de: $" + resta1 + ".");
	}else if (compra <= 9999) {
		System.out.println("Me es grato informal que su descuento es del 20%: $" + multiplicacion2 +"." + " El total a pagar es de: $" + resta2 + ".");
	} else if (compra >= 10000) {
		System.out.println("Me es grato informal que su descuento es del 30%: $" + multiplicacion3 +"." + " El total a pagar es de: $" + resta3 + ".");
	}
	
	
	}

}*/