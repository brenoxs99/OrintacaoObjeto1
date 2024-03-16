package listaExercicios01;

public class AlunoTeste {
	 public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.ra = 12334500;
		aluno1.curso = "Análise e Desenvolvimento de Sistemas";
		aluno1.turno = "Noite";
		aluno1.periodo = 3;
		aluno1.coeficiente = 1.0;
		aluno1.situacao = "Regular";
		
		
		//Exibindo Dados Aluno1
		System.out.println("\n=====Aluno 1=====");
		System.out.println("RA: " + aluno1.ra);
		System.out.println("Curso: " + aluno1.curso);
		System.out.println("Turno: " + aluno1.turno);
		System.out.println("Período: " + aluno1.periodo);
		System.out.println("Coeficiente: " + aluno1.coeficiente);
		System.out.println("Situação: " + aluno1.situacao);
		
	}
}
