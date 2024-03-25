/* Uma biblioteca deseja manter catalogados todos os seus livros. Você foi contratado para
desenvolver este sistema. Sabe-se que o livro é formado pelo seu título, autor, editora, número
de páginas, ano de publicação e situação. O atributo “situação” controla se o livro está
disponível ou não para empréstimo. Logo, esta biblioteca realiza empréstimos e devoluções
dos livros aos seus usuários. Para realizar o empréstimo de um livro, é necessário que o
mesmo esteja disponível, ou seja, que já não tenha sido emprestado anteriormente. Para
realizar a devolução de um livro, o mesmo deve estar como situação indisponível, ou seja,
estar emprestado. Outra funcionalidade que deve ser possível é a exibição em tela dos dados
do livro, como uma espécie de relatório, contendo o título, autor, editora, número de páginas,
ano de publicação e a situação do livro (se está ou não disponível).
Exemplo: “Java – Como Programar, Paul Deitel, Editora Pearson, 968 páginas, 2016, disponível para empréstimo”.
Para efetuar a instanciação dos livros, definição dos valores de seus atributos e invocar os
métodos de empréstimo, devolução ou relatórios, utilize uma classe de teste. */


package listaexercicios02;

public class Livro {
	String titulo;
	String autor;
	String editora;
	int numeroPaginas;
	int anoPublicacao;
	boolean situacao = true;
	
	// método emprestar livro
	public void emprestarLivro() {
		if(situacao == true) {
			System.out.println("\nLivro emprestado com sucesso!");
			situacao = false;
		}else{
			System.out.println("\nO livro não está disponível para empréstimo!");
		}
	}
	
	// método de devolver livro
	public void devolverLivro() {
		if(situacao == false) {
			System.out.println("Livro devolvido com sucesso!");
			situacao = true;
		}else {
			System.out.println("Não foi possível fazer a devolução! O livro já foi devolvido!");
		}
	}
	
	// Imprimido dados dos livros
	public void imprimirRelatorio() {
		System.out.println("\nTitulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Editora: " + editora);
		System.out.println("Numero de Paginas: " + numeroPaginas);
		System.out.println("Ano da Publicação: " + anoPublicacao);
		
		if(situacao == true) {
			System.out.println("Situação: " + "Disponível para empréstimo!");
		}else {
			System.out.println("Situação: " + "Indisponível para empréstimo!");
		}
	}
	
	
}
