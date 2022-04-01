
public class main {
	
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		cachorro cachorro1 = new cachorro();
		
		cachorro1.falar();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		gato gato1 = new gato();
		
		gato1.falar();
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		animal animal = new cachorro(); //Instancia SUPER - Cabe informações ou do tipo cachorro ou animal
		
		//instanceof - == - Pergunta se animal tem como instancia cachorro
		
		
		
		if (animal instanceof cachorro) {
			

			System.out.println("Cachorro");
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println();
			
		}
		
		falar(animal);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		
		
	}
	
	public static void falar(animal a) {
		
		a.falar();
		
	}
	
}
