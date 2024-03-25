package listaexercicios02;


public class PessoaTeste{
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("101.102.013-99"); // passando o cpf
        Pessoa pessoa2 = new Pessoa("201.202.203-99"); // para o metodo construtor

        pessoa1.nome = "Maria";
        pessoa1.sexo = "M";
        pessoa1.idade = 19;
        pessoa1.altura = 1.79;
        pessoa1.peso = 70;
        
        pessoa2.nome = "Jose";
        pessoa2.sexo = "M";
        pessoa2.idade = 56;
        pessoa2.altura = 1.61;
        pessoa2.peso = 85;
        
        // Imprimindo string retornada peçp método toString 
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        
        // Métodos de pessoa 1 e pessoa 2
        pessoa1.andar();
        pessoa2.dormir();
        
    }
}