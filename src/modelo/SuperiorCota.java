package modelo;

public class SuperiorCota extends Cursos {
	
	
	SuperiorCota(String nomeCurso, String coordCurso) {
		super(nomeCurso, coordCurso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescricao() {
		
		return "Superior com ingresso por Cota";
	}
}
