package listaexercicios02;

public class LivroTeste {
	public static void main(String[] args) {
		//Java – Como Programar, Paul Deitel, Editora Pearson, 968 páginas, 2016,
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		
		livro1.titulo = "Java - Como Programar";
		livro1.autor = "Paul Deitel";
		livro1.editora = "Pearson";
		livro1.numeroPaginas = 968;
		livro1.anoPublicacao = 2016;
		
	
		livro2.titulo = "O Mistério da Mansão Assombrada";
		livro2.autor = "João Silva";
		livro2.editora = "Imaginação Ltda.";
		livro2.numeroPaginas = 280;
		livro2.anoPublicacao = 2023;
		
		
		livro1.imprimirRelatorio();
		livro2.imprimirRelatorio();
		
	}
}
