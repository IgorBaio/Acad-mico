package modelo;

public class academico {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(2018.001567,"Igor Baio",true,"igorbaiosoares@gmail.com",3);
		Orientador o1 = new Orientador("Hilton",true,"hiltonmarins@gmail.com");
		System.out.println(a1);
		System.out.println();
		System.out.println(o1);
		
		
		
		System.out.println(a1.mediaNotas());
		
	}

}
