package modelo;

<<<<<<< Updated upstream
=======
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
>>>>>>> Stashed changes

public class academico {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Igor Baio",true,"igorbaiosoares@gmail.com", "BSI");
		Aluno a2 = new Aluno("Ingu Baiu",true,"igorbaiosoares@gmail.com", "BSI");
		Aluno a3 = new Aluno("Igu Baio",true,"igorbaiosoares@gmail.com", "BSI");
		Aluno a4 = new Aluno("Highlander",true,"igorbaiosoares@gmail.com", "BSI");
	
		
		

		NotasAlunos n1 = new NotasAlunos(1, 2);
		NotasAlunos n2 = new NotasAlunos(4, 2);
		NotasAlunos n3 = new NotasAlunos(2, 4);
<<<<<<< Updated upstream
		
		
		Orientador o1 = new Orientador("Hilton",true,"hiltonmarins@gmail.com");
=======
		try {
			NotasAlunos n4 = new NotasAlunos(-1, 4);
		} catch (Exception e) {
			System.out.println("Deu não");
		}
		System.out.println();
		try {
			NotasAlunos n5 = new NotasAlunos(11, 4);
		} catch (Exception e) {
			System.out.println("Deu nãooo");
		}
		System.out.println();
		System.out.println();

		Orientador o1 = new Orientador("Hilton", true, "hiltonmarins@gmail.com");
		Orientador o2 = new Orientador("Valéria", false, "valeria@gmail.com");
>>>>>>> Stashed changes
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
		System.out.println("MÃ©dia das notas do aluno "+a1.getNome()+": "+a1.mediaNotas());
		a1.situacaoAluno();
		System.out.println();
		
		System.out.println("Total de notas do aluno "+a2.getNome()+": "+a2.avaliacoes());
		System.out.println("MÃ©dia das notas do aluno "+a2.getNome()+": "+a2.mediaNotas());
		a2.situacaoAluno();
		System.out.println();
		
		System.out.println("Total de notas do aluno "+a3.getNome()+": "+a3.avaliacoes());
		System.out.println("MÃ©dia das notas do aluno "+a2.getNome()+": "+a3.mediaNotas());
		a3.situacaoAluno();
		System.out.println();
		
		
		a4.situacaoAluno();
		
		System.out.println();
		
		int totalDeAlunos = Aluno.quantidadeAlunos();
<<<<<<< Updated upstream
		System.out.println("Total de "+totalDeAlunos+" alunos.");
=======
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

		Agrupamento<Aluno> listaAlunos = new Agrupamento();
		listaAlunos.adicionaEmGrupo(lista);
		listaAlunos.imprime();
		System.out.println();
		System.out.println();
		listaAlunos.remove();
		listaAlunos.imprime();
		System.out.println();
		System.out.println();
		Aluno a5 = new Aluno("Matheus", false, "igorbaiosoares@gmail.com", c1);

		listaAlunos.adiciona(a4);
		System.out.println(listaAlunos.imprime());

		/*
		 * Collections.sort(lista); System.out.println();
		 * 
		 * System.out.println("Ordem crescente de notas:"); for (Aluno a : lista) {
		 * System.out.println(a); } System.out.println();
		 * 
		 * System.out.println("Ordem decrescente de notas: "); try { for (int i =
		 * lista.size() - 1; i >= 0; i--) { System.out.println(lista.get(i)); } } catch
		 * (Exception e) { System.out.println("deu ruim"); }
		 * 
		 * System.out.println(); System.out.println();
		 * 
		 * DivisaoAlunoOrientador d = new DivisaoAlunoOrientador();
		 * 
		 * if(d.estaVazia()) {
		 * System.out.println("Os alunos ainda não foram distruibuídos"); }
		 * 
		 * d.distribuiAluno(a1, o2); d.distribuiAluno(a2, o1); d.distribuiAluno(a3, o2);
		 * d.distribuiAluno(a4, o1); //d.distribuiAluno(a3, o1);
		 * 
		 * 
		 * Set<Aluno> listaSet = d.getLista();
		 * 
		 * for (Aluno a: listaSet) {
		 * System.out.println(a.tratamento()+", orientado por: "+d.getOrientador(a).
		 * tratamento()+"("+d.getOrientador(a).getEmail()+")"); }
		 * 
		 * System.out.println(d.getOrientador(a1));
		 * System.out.println(d.getOrientador(a2));
		 * 
		 * }
		 */

>>>>>>> Stashed changes
	}
}
