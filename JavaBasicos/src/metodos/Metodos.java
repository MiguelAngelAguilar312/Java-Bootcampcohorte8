package metodos;

public class Metodos {
	//Metodo es una funcion
	
	//Atributos de la clase
	int a, b;
	
	//Metodo void (Vacio)
	
	public void sumar () {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
	}
	
	//Metodo con retorno de valores
	
	public int sumaConRetorno() {
		//int resultado = a + b ;
		//return resultado;
		return a + b;
	}
	
	
	//argumentos
	//suma (argumentos)
	
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
	}
	
	
	//Metodo estatico
	//estatico de void (no regresa datos), usa argumentos
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es " + nombre);
	}

}
