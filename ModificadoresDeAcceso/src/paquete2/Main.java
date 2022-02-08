package paquete2;

//import paquete1.ClaseDafault;
import paquete1.*;

public class Main extends paquete1.ClaseProtected{

	public static void main(String[] args) {
		
		//ClaseDafault prueba = new ClaseDafault();
		
		//prueba.mostrar();
		
		//ClasePrivada privada = new ClasePrivada();
		
		//privada.edad = 30;
		//privada.nombre = "Miguel";
		//privada.setSaludar("Miguel");
		
		//System.out.println(privada.getSaludar());
		//System.out.println(privada.nombre);
		
		//Objeto de la clase Main
		Main protegido = new Main(); //obejeto creado
		
		protegido.setEdad(18);
		
		System.out.println(protegido.getEdad());
	}

}
