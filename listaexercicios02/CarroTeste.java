package listaexercicios02;
public class CarroTeste{    
    public static void main(String[] args){
        // Instanciando Objetos
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // Atribuindo Valores carro 1
        carro1.modelo = "Gol";
        carro1.marca = "Wolskswagen";
        carro1.cor = "Preta";
        carro1.ano = 2015;
        carro1.renavam = "11100011100";
        carro1.chassi = "ABDG4YYDO844JDJDD73J";
        carro1.placa = "ABC-1234";

        // Atribuindo valores carro 2
        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.cor = "Prata";
        carro2.ano = 2018;
        carro2.renavam = "00011100011";
        carro2.chassi = "ABDG4YYDO844JDJDD73J";
        carro2.placa = "DEF-4567";

        // Imprimindo dados do Carro 1
        carro1.imprimirDados();

        // Imprimindo dados do carro 2
        carro2.imprimirDados();
        
        // Chamando métodos de Carro 1
        carro1.ligar();
        carro1.acelerar();
        carro1.frear();
        carro1.desligar();

        // Chamando métodos de Carro 2
        carro2.ligar();
        carro2.acelerar();
        carro2.frear();
        carro2.desligar();



    }
}