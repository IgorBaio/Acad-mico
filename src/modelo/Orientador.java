package modelo;

public class Orientador {
	String nome;
	boolean sexo;
	String email;
	
	Orientador(String nome, boolean sexo, String email){
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		
	}
	
public String toString() {
		return "Orientador:\n\tSr(a) " +this.nome+"\n\t"+"("+this.email+")";
	}
}
