/*Desenvolva um sistema para uma televisão. A televisão possui uma marca, polegadas e
resolução. Sabe-se que a TV pode ligar, desligar, alterar o canal para cima, alterar o canal
para baixo, aumentar volume e abaixar volume do som. Ao invocar o método para alterar o
canal para cima, será acrescentado 1 ao canal atual, como por exemplo, se a TV está
sintonizada no canal 15, ao selecionar a funcionalidade alterar canal para cima, o canal
selecionado passará a ser o 16, se invocado novamente, passará a ser o 17, e assim por
diante. Essa regra vale para as outras funcionalidades como: alterar canal para baixo e
aumento e diminuição de volume do som. Além disso, deve ser possível exibir um relatório
contendo todos os dados da TV, como marca, polegadas, resolução, canal que está
sintonizada e volume atual do som. Para efetuar a instanciação da televisão, definição dos
valores de seus atributos e invocação de métodos, utilize uma classe de teste.*/

package listaexercicios02;

public class Televisao {
	String marca;
	double polegadas;
	String resolucao;
	static int canal=1;
	static int volume;
	
	// métodos
	 
	 
	 public void ligar() {
		 System.out.println("A Tv está ligando!");
	 }
	 
	 public void desligar () {
		 System.out.println("A Tv está desligando!");
	 }
	 
	 public void alterarCanalCima() {
		 canal += 1;
	 }
	 
	 public void alterarCanalBaixo() {
		 canal -= 1;
	 }
	 
	 public void aumentarVolume() {
		 volume += 1;
	 }
	 
	 public void abaixarVolume() {
		 volume -= 1;
	 }
	 
	 public void imprimirRelatorio() {
		 System.out.println("\nMarca: " + marca);
		 System.out.println("Polegadas: " + polegadas + "\"");
		 System.out.println("Resolução: " + resolucao);
		 System.out.println("Canal Atual: " + canal);
		 System.out.println("Volume Atual do Som: " + volume);
	 }
	 
	 
}
