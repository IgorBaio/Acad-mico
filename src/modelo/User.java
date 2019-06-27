package modelo;

public class User  {
	private String nome;
	private boolean sexo;
	private String email;
	
	User(String nome, boolean sexo, String email){
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public boolean isSexo() {
		return sexo;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}
