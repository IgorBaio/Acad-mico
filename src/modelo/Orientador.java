package modelo;

public class Orientador extends User implements FormaDeTratamento{
	
	Orientador(String nome, boolean sexo, String email){
		super(nome,sexo,email);
		
	}
	
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
	
public String toString() {
		return "Orientador:\n\tSr(a) " +this.getNome()+"\n\t"+"("+this.getEmail()+")";
	}



	

}
