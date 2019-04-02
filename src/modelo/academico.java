package modelo;

import java.time.LocalDate;

import java.util.Scanner;

public class academico {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Igor Baio",true,"igorbaiosoares@gmail.com",3, "BSI");
		Aluno a2 = new Aluno("Ingu Baiu",true,"igorbaiosoares@gmail.com",3, "BSI");
		Aluno a3 = new Aluno("Igu Baio",true,"igorbaiosoares@gmail.com",3, "BSI");

		
		
		Orientador o1 = new Orientador("Hilton",true,"hiltonmarins@gmail.com");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println();

		System.out.println(o1);
		
		a1.notas[0] = new NotasAlunos(10, 2);
		a1.notas[1] = new NotasAlunos(20, 1);
		a1.notas[2] = new NotasAlunos(40, 0.5);
		
		a2.notas[1] = new NotasAlunos(10, 2);
		a2.notas[2] = new NotasAlunos(20, 1);
		a2.notas[0] = new NotasAlunos(40, 0.5);
		
		a3.notas[2] = new NotasAlunos(10, 2);
		a3.notas[1] = new NotasAlunos(20, 1);
		a3.notas[0] = new NotasAlunos(40, 0.5);

		System.out.println();
		System.out.println("Média das notas: "+a1.mediaNotas());
		
		int totalDeAlunos = Aluno.quantidadeAlunos();
		System.out.println("Total de "+totalDeAlunos+" alunos.");
	}

}
