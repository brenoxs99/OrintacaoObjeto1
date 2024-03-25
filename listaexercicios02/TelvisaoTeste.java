package listaexercicios02;

public class TelvisaoTeste {
	public static void main(String[] args) {
		Televisao televisao1 = new Televisao();
		int i;
		
		televisao1.marca = "Samsung";
		televisao1.polegadas = 55.5;
		televisao1.resolucao = "4K";
		
		televisao1.imprimirRelatorio();
		
		// Chamando o método Canal Cima
		for(i=0; i < 14; i++) {
			televisao1.alterarCanalCima();
		}
		
		// Chamando método aummentar volume
		for(i=0; i < 77; i++) {
			televisao1.aumentarVolume();
		}
		
		televisao1.imprimirRelatorio();
		
		// Chamando o método Canal Cima
		for(i=0; i < 5; i++) {
			televisao1.alterarCanalBaixo();
		}
		
		// Chamando método aummentar volume
		for(i=0; i < 45; i++) {
			televisao1.abaixarVolume();
		}
		
		televisao1.imprimirRelatorio();
		
	}
}
