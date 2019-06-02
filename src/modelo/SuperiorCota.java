package modelo;

public class SuperiorCota extends Cursos {
	
	
	SuperiorCota(String nomeCurso, String coordCurso) {
		super(nomeCurso, coordCurso);
		
	}

	
	
	@Override
	public String getDescricao() {
		
		return "Superior com ingresso por Cota";
	}
}
