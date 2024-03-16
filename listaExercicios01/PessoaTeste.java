package listaExercicios01;

import java.util.Scanner;

public class PessoaTeste {
	public static void main(String[] args) {
		Scanner recebeDados = new Scanner(System.in);
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		// Pessoa1 Pedindo Dados
		System.out.println("Digite seu nome: ");
		pessoa1.nome = recebeDados.nextLine();
		
		System.out.println("Digite M-MASCULINO ou F-FEMENINO: ");
		pessoa1.sexo = recebeDados.nextLine();
		
		System.out.println("Digite seu cpf: ");
		pessoa1.cpf = recebeDados.nextLine();
		
		System.out.println("Digite sua idade: ");
		pessoa1.idade = recebeDados.nextInt();
		
		System.out.println("Digite seu altura: ");
		pessoa1.altura = recebeDados.nextDouble();
		
		System.out.println("Digite seu peso: ");
		pessoa1.peso = recebeDados.nextDouble();
		
		
		//Atribuindo dados pessoa2
		pessoa2.nome = "José";
		pessoa2.sexo = "M";
		pessoa2.cpf = "10210310411";
		pessoa2.idade = 20;
		pessoa2.altura = 1.75;
		pessoa2.peso = 69.0;
		
		pessoa3.nome = "Josefa";
		pessoa3.sexo = "F";
		pessoa3.cpf = "01202303422";
		pessoa3.idade = 45;
		pessoa3.altura = 1.62;
		pessoa3.peso = 65.7;
		
		// Exibindo Dados
		System.out.println("=====Pessoa 1=====");
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Sexo: " + pessoa1.sexo);
		System.out.println("CPF: " + pessoa1.cpf);
		System.out.println("Idade: " + pessoa1.idade);
		System.out.println("Altura: " + pessoa1.altura);
		System.out.println("Peso: " + pessoa1.peso);
		System.out.printf("\n");
		
		System.out.println("=====Pessoa 2=====");
		System.out.println("Nome: " + pessoa2.nome);
		System.out.println("Sexo: " + pessoa2.sexo);
		System.out.println("CPF: " + pessoa2.cpf);
		System.out.println("Idade: " + pessoa2.idade);
		System.out.println("Altura: " + pessoa2.altura);
		System.out.println("Peso: " + pessoa2.peso);
		System.out.printf("\n");
		
		System.out.println("=====Pessoa 3=====");
		System.out.println("Nome: " + pessoa3.nome);
		System.out.println("Sexo: " + pessoa3.sexo);
		System.out.println("CPF: " + pessoa3.cpf);
		System.out.println("Idade: " + pessoa3.idade);
		System.out.println("Altura: " + pessoa3.altura);
		System.out.println("Peso: " + pessoa3.peso);
		System.out.printf("\n");
		
		recebeDados.close();
		
	}
}
