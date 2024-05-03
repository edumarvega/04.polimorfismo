package ar.com.templateit.principal;

//esta clase hija esta obligada a implementar/sobre escribir el metodo hacerSonido 
//de la clase padre Animal
public class Gato extends Animal{
	
	//la clase hija sobre escribe o re define el método hacerSonido de la clase padre (Animal)
	//la anotation @Override le indica prioridad de ejecucion de este metodo, en vez de ejecutar 
	//el metodo hacerSonido del padre ejecutara el este metodo sobre escrito en la clase hija
	@Override
	public void hacerSonido() {
		System.out.println("Soy un gato... miau...miau!!");
	}

}
