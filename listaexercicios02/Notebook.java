/* Desenvolva um sistema para manter registros de notebook. Sabe-se que cada notebook é
identificado por uma marca, modelo, polegadas da tela, modelo do processador, quantidade
de memória ram e capacidade de armazenamento. Como comportamento, cada notebook
pode ligar, desligar, processar informações e conectar à internet. Ao invocar os métodos de
um determinado notebook, o sistema deve exibir uma mensagem da ação realizada pelo
notebook, como por exemplo: ao invocar o método ligar a mensagem “<modelo do notebook>
está ligando.” deve ser mostrada, ao invocar o método processar informações a mensagem
“<modelo do notebook está processando informações” deve ser exibida, entre outras. Para
instanciar objetos, atribuir os valores para cada notebook e invocar os métodos de cada um,
declare uma classe de teste que conterá o método main. */


package listaexercicios02;

public class Notebook {
	String marca;
	String modelo;
	double polegadasTela;
	String modeloProcessador;
	int quantidadeRam;
	int armazenamento;
	static int numeroNotebook; // um atributo acessado por todos os
							   // objetos do projeto, todos tem acesso
				               // transformando ela de uma variável para cada obejto
	                           // para uma variável para todos os objetos
	
	// Métodos
	public void ligar() {
		System.out.println("Notebook " + modelo + " está ligando!");
	}
	
	public void desligar() {
		System.out.println("Notebook " + modelo + " está desligando!");
	}
	
	public void processarInformacoes() {
		System.out.println("Notebook " + modelo + " está prcessando informações!");
	}
	
	public void conectarInternet(){
		System.out.println("Notebook " + modelo + " está conectando a internet!");
	}
	
	public void cadastrarNotebook() {
		numeroNotebook += +1; // Somamos o valor antigo mais um 
		                      // Cada vez que chamarmos a função
		                      // Por isso foi definida como 'static'(Global)
	}
	
	public void imprimirDados() {
		
		System.out.println("\n=====Notebook " + numeroNotebook + "=====");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Polegadas da Tela: " + polegadasTela);
		System.out.println("Modelo do processador: " + modeloProcessador);
		System.out.println("Quantidade de Ram: " + quantidadeRam);
		System.out.println("Quantidade de Armazenamento: " + armazenamento + "\n");
	}
}
