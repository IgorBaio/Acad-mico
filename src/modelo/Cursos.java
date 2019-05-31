package modelo;



public abstract class Cursos extends IdentificadorDeCurso{
	private String nomeCurso;
	private String coordCurso;
	
		
	Cursos(String nomeCurso, String coordCurso){
		this.nomeCurso = nomeCurso;
		this.coordCurso = coordCurso;
		}

	public String getNomeCurso() {
		return this.nomeCurso;
	}

	public String getCoordCurso() {
		return this.coordCurso;
	}
	
	public abstract String getDescricao();
	
	public String toString() {
		return getNomeCurso()+","+getCoordCurso()+","+getDescricao();
	}
	
	
}
