package modelo;

import java.time.LocalDate;

public class Aluno {
	String matricula;
	String nome;
	boolean sexo;
	String email;
	NotasAlunos[] notas;
	int posicaoNota = 0;
	String curso;
	static int qntAluno;
	
	static public LocalDate localDate = LocalDate.now();
	static public int contAno = 1;
	int ano = localDate.getYear();

	
	
	Aluno( String nome, boolean sexo, String email,int qtdNotas,String curso) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.notas = new NotasAlunos[qtdNotas];
		this.curso = curso;
		Aluno.qntAluno += 1;
		
		if(this.ano == localDate.getYear()) {
			this.matricula = Integer.toString(this.ano)+"-"+Integer.toString(this.contAno);
			this.contAno++;
		}else {
			this.contAno = 1;
			this.ano = localDate.getYear();
			this.matricula = Integer.toString(this.ano)+"-"+Integer.toString(this.contAno);
			this.contAno++;
		}
		
	}
	
	
	
	/*NotasAlunos[] preencheNota(NotasAlunos nota) {
		if(posicaoNota < notas.length) {
			this.notas[posicaoNota] = nota;
			posicaoNota++;
			return notas;
		}
		return notas;
		
	}*/
	
	/*int qntAluno(Aluno aluno) {
		int qnt = 0;
		for(Aluno a: aluno) {
			qnt++;
			return qnt;
		}
		
	}*/
	public static int quantidadeAlunos() {
		return Aluno.qntAluno;
	}
	
	
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