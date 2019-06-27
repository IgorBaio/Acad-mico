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
	
<<<<<<< Updated upstream
=======
	public String getId() {
		if(isSexo() == true) {
			return "Professor ";
		}else {
			return "Professora ";
		}
	}
	
	public String tratamento() {
		//if(u.isSexo() == true) {
			return getId()+this.getNome()  ;
		//}else {
			//return "Aluna"+this.getNome();
		//}
	}
	
	
	
	
>>>>>>> Stashed changes
public String toString() {
		return "Orientador:\n\tSr(a) " +this.nome+"\n\t"+"("+this.email+")";
	}
}
