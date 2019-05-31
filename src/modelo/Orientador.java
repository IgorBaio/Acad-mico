package modelo;

public class Orientador {
	private String nome;
	private boolean sexo;
	private String email;
	
	Orientador(String nome, boolean sexo, String email){
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		
	}
	
public String toString() {
		return "Orientador:\n\tSr(a) " +this.nome+"\n\t"+"("+this.email+")";
	}
}
