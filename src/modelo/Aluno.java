package modelo;

import java.util.ArrayList;

import java.time.LocalDate;

public class Aluno {

	private String matricula;
	private String nome;
	private boolean sexo;
	private String email;
	private ArrayList<NotasAlunos> notas;
	private String curso;
	static private int qntAluno;

	static private LocalDate localDate = LocalDate.now();
	static private int contMatricula = 1;
	private int ano = localDate.getYear();

	private double media;

	Aluno(String nome, boolean sexo, String email, String curso) {

		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.notas = new ArrayList<NotasAlunos>();
		this.curso = curso;
		Aluno.qntAluno += 1;

		if (this.ano == localDate.getYear()) {
			this.matricula = this.ano + "-" + Aluno.contMatricula;
			Aluno.contMatricula++;
		} else {
			Aluno.contMatricula = 1;
			this.ano = localDate.getYear();
			this.matricula = this.ano + "-" + Aluno.contMatricula;
			Aluno.contMatricula++;
		}

	}

	public static int quantidadeAlunos() {
		return Aluno.qntAluno;
	}

	public double mediaNotas() {
		this.media = 0;
		for (NotasAlunos n : notas) {
			media += n.getValorNota() * n.getPesoNota();
		}
		this.media = media / notas.size();
		return this.media;
	}

	public void insere(NotasAlunos nota) {
		notas.add(nota);
	}

	public int avaliacoes() {
		return notas.size();
	}

	public String situacaoAluno() {
		if (notas.size() == 0) {
			return "Aluno sem Avaliação";
		} else {
			if (this.media >= 6) {
				return "Aluno Aprovado";

			} else {
				return "Aluno Reprovado";
			}

		}
	}

	public String getMatricula() {
		return matricula;
	}

	

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public ArrayList<NotasAlunos> getNotas() {
		return notas;
	}

	public String getCurso() {
		return curso;
	}

	public static int getQntAluno() {
		return qntAluno;
	}

	public static LocalDate getLocalDate() {
		return localDate;
	}

	public static int getContMatricula() {
		return contMatricula;
	}

	public int getAno() {
		return ano;
	}

	public double getMedia() {
		return media;
	}

	public String toString() {
		return "Aluno:\n\tMat: " + this.matricula + "-" + this.nome + "\n" + "\t" + "(" + this.email + ")";
	}

}