/* Desenvolva um sistema para controlar registros de pessoas. Cada pessoa é identificada pelo
seu nome, sexo, cpf, idade, altura e peso, e pode andar, correr, falar e dormir. Ao invocar os
métodos da pessoa, o sistema deve exibir uma mensagem da ação que está sendo feita pela
pessoa, como por exemplo: ao invocar o método correr a mensagem “<nome da pessoa> está
correndo” deve ser exibida, ao invocar o método dormir a mensagem “<nome da pessoa> está
dormindo” deve ser mostrada, entre outras. Utilize uma classe de teste para instanciar várias
pessoas, atribuir seus respectivos valores e invocar os métodos de cada uma*/

package listaexercicios02;

public class Pessoa{
    String nome;
    String sexo;
    final String CPF;
    int idade;
    double altura;
    double peso;

    public Pessoa(String cpf){
        this.CPF = cpf;
    }

    // Métodos
    public void andar() {
        System.out.println("\n" + nome + " Está andando!");
    }

    public void correr() {
        System.out.println(nome + " Está Correndo!");
    }

    public void falar() {
        System.out.println(nome + " Está Falando!");
    }

    public void dormir() {
        System.out.println(nome + " Está Dormindo!");
    }
    
    
    // Imprimido os dados usando o método toSrtring
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nSexo: " + sexo + "\nCPF: " + CPF + "\nIdade: " + idade + "\naltura: " + altura
				+ "\nPeso: " + peso;
	}
}