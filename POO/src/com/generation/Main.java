package com.generation;

public class Main {

	public static void main(String[] args) {
		Tacos taco1 = new Tacos("Masa Azul","Suadero", 2, "Mediana", 30);
		
		/*
		 * taco1.tipoDeTortilla = "Masa Azul"; 
		 * taco1.tipoDeGuisado = "Suadero";
		 * taco1.numeroDeTortilla = 2; 
		 * taco1.tamanioDeTortilla = "Mediana"; 
		 * taco1.precio = 30; 
		 * taco1.subirPrecio(5.5f);
		 */
		
		System.out.println(taco1.toString());

		Tacos taco2 = new Tacos(); 
		
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck"; 
		taco2.numeroDeTortilla = 2;
		taco2.tamanioDeTortilla = "Grande"; 
		taco2.precio = 42.6f;
		taco2.tipoDeTortilla = "Trigo"; 
		taco2.subirPrecio(5.5f);
		  
		System.out.println(taco2.toString());
		
		

	}

	
}
