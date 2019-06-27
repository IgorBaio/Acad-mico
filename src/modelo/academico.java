package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class academico {

	public static void main(String[] args) throws ExceptionNotas {
		Cursos c1 = new SuperiorAmplaConcorrencia("Bsi", "Emerson");
		Cursos c2 = new SuperiorCota("Bsi", "Memerson");
		Cursos c3 = new TecnicoConcomitante("TTI", "Luana");
		Cursos c4 = new TecnicoIntegrado("Elt", "Rafael");
		Cursos c5 = new TecnicoSubsequente("Design de moveis", "Joana");

		Aluno a1 = new Aluno("Igor Baio", true, "igorbaiosoares@gmail.com", c1);
		Aluno a2 = new Aluno("Ingu Baiu", true, "igorbaiosoares@gmail.com", c1);
		Aluno a3 = new Aluno("Igu Baio", true, "igorbaiosoares@gmail.com", c1);
		Aluno a4 = new Aluno("Highlander", false, "igorbaiosoares@gmail.com", c1);

		NotasAlunos n1 = new NotasAlunos(1, 2);
		NotasAlunos n2 = new NotasAlunos(4, 2);
		NotasAlunos n3 = new NotasAlunos(2, 4);

		Orientador o1 = new Orientador("Hilton", true, "hiltonmarins@gmail.com");
		Orientador o2 = new Orientador("Val�ria", false, "valeria@gmail.com");
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
		System.out.println("Total de notas do aluno " + a1.getNome() + ": " + a1.avaliacoes());
		System.out.println("Média das notas do aluno " + a1.getNome() + ": " + a1.mediaNotas());
		a1.situacaoAluno();
		System.out.println();

		System.out.println("Total de notas do aluno " + a2.getNome() + ": " + a2.avaliacoes());
		System.out.println("Média das notas do aluno " + a2.getNome() + ": " + a2.mediaNotas());
		a2.situacaoAluno();
		System.out.println();

		System.out.println("Total de notas do aluno " + a3.getNome() + ": " + a3.avaliacoes());
		System.out.println("Média das notas do aluno " + a2.getNome() + ": " + a3.mediaNotas());
		a3.situacaoAluno();
		System.out.println();

		a4.situacaoAluno();

		System.out.println();

		int totalDeAlunos = Aluno.quantidadeAlunos();
		System.out.println("Total de " + totalDeAlunos + " alunos.");

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

		System.out.println(a1.tratamento());
		System.out.println();

		System.out.println(a2.tratamento());
		System.out.println();

		System.out.println(a3.tratamento());
		System.out.println();

		System.out.println(a4.tratamento());
		System.out.println();

		System.out.println(o2.tratamento());
		System.out.println();

		System.out.println(o1.tratamento());
		System.out.println();

		// NotasAlunos n4 = new NotasAlunos(11, 4);

		List<Aluno> lista = new ArrayList();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		Collections.sort(lista);
		System.out.println();

		System.out.println("Ordem crescente de notas:");
		for (Aluno a : lista) {
			System.out.println(a);
		}
		System.out.println();
		System.out.println(lista.get(1));
		System.out.println("Ordem decrescente de notas: ");
		try {
			for (int i = lista.size() - 1; i >= 0; i--) {
				System.out.println(lista.get(i));
			}
		} catch (Exception e) {
			System.out.println("deu ruim");
		}

	}

}
