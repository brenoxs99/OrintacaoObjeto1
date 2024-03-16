package listaExercicios01;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();
		
		calculadora1.marca = "Casio";
		calculadora1.modelo = "FX-82MS";
		calculadora1.tipo = "Científica";
		calculadora1.memoriaIterna = 8;
		
		System.out.println("\n=====Calculadora 1=====");
		System.out.println("Marca: " + calculadora1.marca);
		System.out.println("Modelo: " + calculadora1.modelo);
		System.out.println("Tipo: " + calculadora1.tipo);
		System.out.println("Memória Interna: " + calculadora1.memoriaIterna + " KB");
	}
}
