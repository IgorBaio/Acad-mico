package modelo;

public class Orientador extends User{
	
	Orientador(String nome, boolean sexo, String email){
		super(nome,sexo,email);
		
	}
	
public String toString() {
		return "Orientador:\n\tSr(a) " +this.getNome()+"\n\t"+"("+this.getEmail()+")";
	}



	

}
