package ar.com.templateit.principal;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		
		Animal perro = new Perro();   //se crea/instancia un objeto animal de tipo Perro.
		Animal gato = new Gato();     //se crea/instancia un objeto animal de tipo Gato.
		perro.hacerSonido();  // se llama al método de la clase hija (Perro), hace sonido de Perro.
		gato.hacerSonido();   // se llama al metodo de la clase hija (Gato), hace sonido de Gato.
				
		
		Perro perro1 = new Perro();   //se crea/instancia un objeto perro de tipo Perro.
		Gato gato1 = new Gato();      //se crea/instancia un objeto gato de tipo Gato.
		perro1.hacerSonido();  // se llama al método de la clase hija (Perro), hace sonido de Perro.
		gato1.hacerSonido();   // se llama al metodo de la clase hija (Gato), hace sonido de Gato.
				
		
		//List<Animal> animales = List.of(perro, gato);
		//hacerSonido(animales);
		
	}
		
	//recorremos una lista de objetos Animales
	//al llamar al metodo hacerSonido se comportara (polimorfismo)
	//dependiendo al tipo de objeto si es un perro o un gato
	static void hacerSonido(List<Animal> lista) {
		for (Animal animal : lista) {
			animal.hacerSonido();
		}
		
	}
}
