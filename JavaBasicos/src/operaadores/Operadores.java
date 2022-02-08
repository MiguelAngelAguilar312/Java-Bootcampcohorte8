package operaadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritméticos
		// +, -, *, /, % 
		int a = 10;
		int b = 20;
		double c = 10.0;
		
		int suma = a + b;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		//Resta
		System.out.println("El resultado de la resta es: " + (b - a));
		
		//División
		int division = a / b;
		System.out.println("El resultado de la division es: " + division);
		
		double division1 = a / b;
		System.out.println("El resultado de la division es: " + division1);
		
		double division2 = (double) a / b;
		//Por lo menos uno de los datos debes se doble
		// 10.0 / 20 = 0.5
		System.out.println("El resultado de la division es: " + division2);
		
		//double division2 = (double) a / b;
		double division3 = c / b;
		System.out.println("El resultado de la division es: " + division3);
		
		//Multiplicación 
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicación es: "+ multiplicacion);
		
		//Modulo
		double modulo = a % c;
		System.out.println("El modulo de la operacion es: "+ modulo);
		
		int modulo1 = a % b;
		System.out.println("El modulo de la operacion es: "+ modulo1);
		
		/*
		 * Operador de asignación
		 * 
		 */
		int d = 5, e; //inicializar las variables vacias
		e = 6;
		System.out.println(d + " - "+ e);
		
		//Operadores de declaracion compuesta
		// +=, -=, /=, %=
		//una operacion simplificada
		
		int f = 0, g = 5;
		f += 5;
		// f = f +5
		System.out.println(f);
		
		//Operadores Relacionales
		/*
		 * <, >, <=, >=
		 * == igualdad
		 * != diferencia
		 * Resultado de valor de tipo booleano/boolean (True, False)
		 *   
		 */
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i); //False
		System.out.println(h < i); //True
		System.out.println(h != i); //True
		System.out.println(h == i); //False
		// System.out.println(h !=  j); //Son valores distintos no se pueden comparar
		
		//Operador Unario
		/*
		 * ++, --
		 * Preasingacion -- ++k se le asigna un valor antes de usarse
		 * Postasignacio -- k++ primero lee el valor y despues de la suma 1
		 */
		
		int k = 0 , l = 0;
		System.out.println(++k);
		System.out.println(--l);
		System.out.println(k++);
		
		//Presedencia de operadores
		
		int operacion = 4 + 5 * 6 / 3; //
		// 5 * 6 = 30
		// 30 / 3 = 10
		// 4 + 10 =14 
		System.out.println(operacion);
		
		int operacion1 = (4 + 5) * 6 / 3; //
		// 4 + 5 = 9
		// 9 * 6 = 54
		// 54 / 3 =18 
		System.out.println(operacion1);
		
		int x = 0, y = 0;
		int operacion2 = ++x + y--;
		// x = 1 , y = 0;
		System.out.println(operacion2);
		
		int operacion3 = ++x + --y;
		// x = 1 , y = -1;
		System.out.println(operacion3);
		
		
		// Operador ternario
		//es un if ..else abreviado
		//solo nos permite tomar una decision
		
		//int edad = 18, valor1 = 0;
		
		//int resultado = (edad <= 18) ? (valor1 = 2) : (valor1 = 3);
		//String resulado =(edaad <= 18) ? "Uno" : "Dos";
		//Parentesis son opcionales
		//System.out.println(resultado);
		int edad = 18;
		
		int valor = (edad <= 18) ? 2 : 1;
		System.out.println(valor);
		
		// Operador Logicos
		// And -- &&
		// or -- ||
		// Not !
		
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(true && !false); //true
		
		/*Scanner sc =  new Sacanner (System.in);
		System.out.println("Escribe un numero: ");
		int num = sc.nextInt();
		System.out.println(num);*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un numero: ");
		int num = sc.nextInt();
		System.out.println(num);
	}

}
