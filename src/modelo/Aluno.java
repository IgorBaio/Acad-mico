package modelo;

import java.util.ArrayList;

import java.time.LocalDate;

public class Aluno {
	private String matricula;
	public String nome;
	public boolean sexo;
	public String email;
	private ArrayList<NotasAlunos> notas;
	public String curso;
	static private int qntAluno;
	
	static public LocalDate localDate = LocalDate.now();
	static public int contAno = 1;
	int ano = localDate.getYear();
	
	private double media;
	
	
	Aluno( String nome, boolean sexo, String email,String curso) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.notas = new ArrayList();
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
	
	
	public static int quantidadeAlunos() {
		return Aluno.qntAluno;
	}
	
	
	public double mediaNotas() {
		this.media = 0;
		for(NotasAlunos n: notas) {
			media += n.valorNota * n.pesoNota ;
		}
		this.media =media/notas.size();
		return this.media;
	}
	
	public void insere(NotasAlunos nota) {
		notas.add(nota);
	}
	
	public int avaliacoes() {
		return notas.size();
	}
	
	public void situacaoAluno() {
		if(notas.size()==0) {
			System.out.println("Aluno sem Avaliação");
		}else {
			if(this.media >=6) {
				System.out.println("Aluno Aprovado");
			
			}else {
				System.out.println("Aluno Reprovado");
			}
			
			
		}
	}
	


public String toString() {
	return "Aluno:\n\tMat: "+this.matricula+"-"+this.nome+"\n"+"\t"+"("+this.email+")";
}

}