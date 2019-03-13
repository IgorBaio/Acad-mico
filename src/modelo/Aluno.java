package modelo;

public class Aluno {
	double matricula;
	String nome;
	boolean sexo;
	String email;
	NotasAlunos[] notas;
	int posicaoNota = 0;
	String curso;

	Aluno(double matricula, String nome, boolean sexo, String email,int qtdNotas,String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.notas = new NotasAlunos[qtdNotas];
		this.curso = curso;
	}
	
	
	
	/*NotasAlunos[] preencheNota(NotasAlunos nota) {
		if(posicaoNota < notas.length) {
			this.notas[posicaoNota] = nota;
			posicaoNota++;
			return notas;
		}
		return notas;
		
	}*/
	
	double mediaNotas() {
		double media = 0;
		for(NotasAlunos n: notas) {
			media += n.valorNota * n.pesoNota ;
		}
		return media/notas.length;
	}
	


public String toString() {
	return "Aluno:\n\tMat: "+this.matricula+"-"+this.nome+"\n"+"\t"+"("+this.email+")";
}

}