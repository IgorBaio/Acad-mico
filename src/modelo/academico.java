package modelo;



public class academico {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(2018.001567,"Igor Baio",true,"igorbaiosoares@gmail.com",3, "BSI");
		
		Orientador o1 = new Orientador("Hilton",true,"hiltonmarins@gmail.com");
		System.out.println(a1);
		System.out.println();
		System.out.println(o1);
		
		a1.notas[0] = new NotasAlunos(10, 2);
		a1.notas[1] = new NotasAlunos(20, 1);
		a1.notas[2] = new NotasAlunos(40, 0.5);

		System.out.println();
		System.out.println("Média das notas: "+a1.mediaNotas());
		
	}

}
