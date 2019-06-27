package modelo;


public class academico {

	public static void main(String[] args) {
		Cursos c1 = new SuperiorAmplaConcorrencia("Bsi", "Emerson");
		Cursos c2 = new SuperiorCota("Bsi", "Memerson");
		Cursos c3 = new TecnicoConcomitante("TTI", "Luana");
		Cursos c4 = new TecnicoIntegrado("Elt", "Rafael");
		Cursos c5 = new TecnicoSubsequente("Design de moveis", "Joana");
		
		Aluno a1 = new Aluno("Igor Baio",true,"igorbaiosoares@gmail.com", c1);
		Aluno a2 = new Aluno("Ingu Baiu",true,"igorbaiosoares@gmail.com", c1);
		Aluno a3 = new Aluno("Igu Baio",true,"igorbaiosoares@gmail.com", c1);
		Aluno a4 = new Aluno("Highlander",true,"igorbaiosoares@gmail.com", c1);
	
		
		

		NotasAlunos n1 = new NotasAlunos(1, 2);
		NotasAlunos n2 = new NotasAlunos(4, 2);
		NotasAlunos n3 = new NotasAlunos(2, 4);
		
		
		Orientador o1 = new Orientador("Hilton",true,"hiltonmarins@gmail.com");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println();

		System.out.println(o1);
		
		a1.insere(n1);
		a1.insere(n1);
		a1.insere(n2);
		a1.insere(n3);
	
		
		a2.insere(n1);
		a2.insere(n2);
		a2.insere(n3);
		
		a3.insere(n1);
		a3.insere(n2);
		a3.insere(n3);
		a3.insere(n2);
		a3.insere(n2);
		
		System.out.println();
		System.out.println("Total de notas do aluno "+a1.getNome()+": "+a1.avaliacoes());
		System.out.println("Média das notas do aluno "+a1.getNome()+": "+a1.mediaNotas());
		a1.situacaoAluno();
		System.out.println();
		
		System.out.println("Total de notas do aluno "+a2.getNome()+": "+a2.avaliacoes());
		System.out.println("Média das notas do aluno "+a2.getNome()+": "+a2.mediaNotas());
		a2.situacaoAluno();
		System.out.println();
		
		System.out.println("Total de notas do aluno "+a3.getNome()+": "+a3.avaliacoes());
		System.out.println("Média das notas do aluno "+a2.getNome()+": "+a3.mediaNotas());
		a3.situacaoAluno();
		System.out.println();
		
		
		a4.situacaoAluno();
		
		System.out.println();
		
		int totalDeAlunos = Aluno.quantidadeAlunos();
		System.out.println("Total de "+totalDeAlunos+" alunos.");
		
		System.out.println();
		
		IdentificadorDeCurso.indentificar(c1);
		System.out.println();
		
		IdentificadorDeCurso.indentificar(c2);
		System.out.println();
		
		IdentificadorDeCurso.indentificar(c3);
		System.out.println();
		
		IdentificadorDeCurso.indentificar(c4);
		System.out.println();
		
		IdentificadorDeCurso.indentificar(c5);
		System.out.println();
		
	}

}
