package modelo;

public class Aluno {
	double matricula;
	String nome;
	boolean sexo;
	String email;
	NotasAlunos[] notas;
	int posicaoNota = 0;

	Aluno(double matricula, String nome, boolean sexo, String email,int qtdNotas) {
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.notas = new NotasAlunos[qtdNotas];
	}
	


public String toString() {
	return "Aluno:\n\tMat: "+this.matricula+"-"+this.nome+"\n"+"\t"+"("+this.email+")";
}

}