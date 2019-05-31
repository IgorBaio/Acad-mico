package modelo;

public class TecnicoIntegrado extends Cursos {

	TecnicoIntegrado(String nomeCurso, String coordCurso) {
		super(nomeCurso, coordCurso);
		
	}

	@Override
	public String getDescricao() {
		return "Integrado: nesta modalidade o aluno cursa o ensino médio juntamente com o ensino";
	}
}
