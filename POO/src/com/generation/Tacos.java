package com.generation;

public class Tacos {
	
	String tipoDeTortilla;
	String tipoDeGuisado;
	int numeroDeTortilla;
	String tamanioDeTortilla;
	float precio = 0.0f;
	
	//El constructor nos ayuda a inicializar objetos
	public Tacos() {
		
	}
	
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	
	public Tacos(String tipoDeTortilla, String tipoDeGuizado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuizado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregue salsa a su gusto");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}
	
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numerodeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	

}
