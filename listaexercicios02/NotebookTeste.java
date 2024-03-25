package listaexercicios02;

public class NotebookTeste {
	public static void main(String[] args) {
		Notebook notebook1 = new Notebook();
		Notebook notebook2 = new Notebook();
		
		// Atribuindo conteúdo dos atributos do objeto
		
		notebook1.modelo = "MacBook Air";
		notebook1.marca = "Apple";
		notebook1.polegadasTela = 13;
		notebook1.modeloProcessador = "M1 da Apple, CPU 8 Core";
		notebook1.quantidadeRam = 8;
		notebook1.armazenamento = 256;
		notebook1.cadastrarNotebook();
		
		notebook1.imprimirDados();
		
		notebook2.cadastrarNotebook();
		notebook2.modelo = "Apire 5 A515-56G-551P";
		notebook2.marca = "Acer";
		notebook2.polegadasTela = 15.6;
		notebook2.modeloProcessador = "Intel core I5-11° Geração";
		notebook2.quantidadeRam = 8;
		notebook2.armazenamento = 512;
		notebook2.imprimirDados();
		
		notebook1.ligar();
		notebook2.ligar();
		notebook2.desligar();
	}
}
