
public class main {
	
	public static void main(String[] args) {
		
		carro carro1 = new carro();
		
		System.out.println();
		
		carro1.ano = 2003;
		carro1.setMarca("Chevrolet");
		carro1.setModelo("Astra");
		carro1.setQuatroPortas(true);
		carro1.buzinar();
		carro1.imprimirDados();
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		
		moto moto1 = new moto();
		
		moto1.setAno(2010);
		moto1.setMarca("Honda");
		moto1.setModelo("Titan");
		moto1.empinar();
		moto1.buzinar();
		moto1.imprimirDados();
		
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println();
		
		caminhao caminhao1 = new caminhao();
		
		caminhao1.buzinar();
		caminhao1.setAno(2015);
		caminhao1.setMarca("Mercedes");
		caminhao1.setModelo("600");
		caminhao1.imprimirDados();
	}
	
}
