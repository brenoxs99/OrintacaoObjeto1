/*Desenvolva um sistema para controlar um carro. Sabe-se que o carro é identificado pelo seu
modelo, marca, cor, ano, renavam, chassi e placa. Além disso, o carro pode ligar, desligar,
acelerar e frear. Ao invocar os métodos do carro, o mesmo deverá exibir o que está ocorrendo,
como por exemplo, ao invocar o método ligar, deve-se exibir uma mensagem: “<modelo do
carro> está ligando”. Ao ser invocado o método acelerar, deve exibir: “<modelo do carro> está
acelerando”, e assim por diante. Utilize uma classe de teste para instanciar vários carros,
atribuir seus respectivos valores e invocar os métodos de cada um.*/

package listaexercicios02;

public class Carro {
    // Funções
    String modelo;
    String marca;
    String cor;
    int ano;
    String renavam;
    String chassi;
    String placa;

    // Métodos
    public void ligar(){
        System.out.println("\n" + modelo + " Está ligando!");
    }

    public void acelerar(){
        System.out.println(modelo + " Está Acelerando!");
    }

    public void frear(){
        System.out.println(modelo + " Está Freando!");
    }

    public void desligar(){
        System.out.println(modelo + " Está Desligando!\n");
    }

    public void imprimirDados(){
        System.out.println("\nModelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Rennavam: " + renavam);
        System.out.println("Chassi: " + chassi);
        System.out.println("Placa: " + placa);
    }

}