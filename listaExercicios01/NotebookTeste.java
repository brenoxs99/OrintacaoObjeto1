package listaExercicios01;

public class NotebookTeste {
	public static void main(String[] args) {
		Notebook notebook1 = new Notebook();
		Notebook notebook2 = new Notebook();
		Notebook notebook3 = new Notebook();
		
		notebook1.marca = "Apple";
		notebook1.modelo = "MacBook Air";
		notebook1.polegada = 13;
		notebook1.modeloProcessador = "M1 da Apple, CPU 8-Core";
		notebook1.quantidadeRam = 8;
		notebook1.capacidadeArmazenamento = 256;
		
		notebook2.marca = "Acer";
		notebook2.modelo = "Aspire 5 A515-56G-551P";
		notebook2.polegada =15.6;
		notebook2.modeloProcessador = "Intel core I5-11° Geração";
		notebook2.quantidadeRam = 8;
		notebook2.capacidadeArmazenamento = 512;
		
		notebook3.marca = "Dell";
		notebook3.modelo = "Inspiron I15-I120K-A20P";
		notebook3.polegada = 15.6;
		notebook3.modeloProcessador = "12ª geração Intel Core i5-1235U";
		notebook3.quantidadeRam = 8;
		notebook3.capacidadeArmazenamento = 256;
		
		// Exibindo Dados
		System.out.printf("\n");
		System.out.println("=====Notebook 1=====");
		System.out.println("Marca: " + notebook1.marca);
		System.out.println("Modelo: " + notebook1.modelo);
		System.out.println("Polegada: " + notebook1.polegada + " \"");
		System.out.println("Modelo do Processador: " + notebook1.modeloProcessador);
		System.out.println("Quatidade de RAM: " + notebook1.quantidadeRam + " GB");
		System.out.println("Capacidade de Armazenamento: " + notebook1.capacidadeArmazenamento + " GB");
		System.out.printf("\n");
		
		System.out.println("=====Notebook 2=====");
		System.out.println("Marca: " + notebook2.marca);
		System.out.println("Modelo: " + notebook2.modelo);
		System.out.println("Polegada: " + notebook2.polegada + " \"");
		System.out.println("Modelo do Processador: " + notebook2.modeloProcessador);
		System.out.println("Quatidade de RAM: " + notebook2.quantidadeRam + " GB");
		System.out.println("Capacidade de Armazenamento: " + notebook2.capacidadeArmazenamento + " GB");
		System.out.printf("\n");
		
		System.out.println("=====Notebook 3=====");
		System.out.println("Marca: " + notebook3.marca);
		System.out.println("Modelo: " + notebook3.modelo);
		System.out.println("Polegada: " + notebook3.polegada + " \"");
		System.out.println("Modelo do Processador: " + notebook3.modeloProcessador);
		System.out.println("Quatidade de RAM: " + notebook3.quantidadeRam + " GB");
		System.out.println("Capacidade de Armazenamento: " + notebook3.capacidadeArmazenamento + " GB");
		System.out.printf("\n");
		
	}
}
