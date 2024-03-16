package listaExercicios01;

public class CarroTeste {
	public static void main(String[] args) {
		// Instanciando 3 objetos carro
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();

		// atribuindo valores para carro1
		carro1.modelo = "Astra";
		carro1.marca = "Chevrolet";
		carro1.cor = "Preta";
		carro1.ano = 2017;
		carro1.renavam = "12345678901";
		carro1.chassi = " 1HGCM82633A123456";
		carro1.placa = "ABC-123";

		// carro2
		carro2.modelo = "Gol";
		carro2.marca = "Wolskwagen";
		carro2.cor = "Preta";
		carro2.ano = 2017;
		carro2.renavam = "12345678901";
		carro2.chassi = " 1HGCM82633A123456";
		carro2.placa = "DFG-456";

		// carro3
		carro3.modelo = "Fusca";
		carro3.marca = "Wolkswagen";
		carro3.cor = "Vermelho";
		carro3.ano = 1997;
		carro3.renavam = "11543228902";
		carro3.chassi = " 1HGCM82633A123456";
		carro3.placa = "HIJ-789";

		// exibindo dados do carro 1
		System.out.println("=====Carro 1=====");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Cor: " + carro1.cor);
		System.out.println("Ano: " + carro1.ano);
		System.out.println("Renavam: " + carro1.renavam);
		System.out.println("Chassi: " + carro1.chassi);
		System.out.println("Placa: " + carro1.placa);
			System.out.printf("\n");
			
		// exibindo dados do carro 2
		System.out.println("=====Carro 3=====");
		System.out.println("Modelo: " + carro2.modelo);
		System.out.println("Marca: " + carro2.marca);
		System.out.println("Cor: " + carro2.cor);
		System.out.println("Ano: " + carro2.ano);
		System.out.println("Renavam: " + carro2.renavam);
		System.out.println("Chassi: " + carro2.chassi);
		System.out.println("Placa: " + carro2.placa);
			System.out.printf("\n");
			
		// exibindo dados do carro 3
		System.out.println("=====Carro 3=====");
		System.out.println("Modelo: " + carro3.modelo);
		System.out.println("Marca: " + carro3.marca);
		System.out.println("Cor: " + carro3.cor);
		System.out.println("Ano: " + carro3.ano);
		System.out.println("Renavam: " + carro3.renavam);
		System.out.println("Chassi: " + carro3.chassi);
		System.out.println("Placa: " + carro3.placa);
			System.out.printf("\n");
	}
}
