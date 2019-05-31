package modelo;

public class TecnicoConcomitante extends Cursos{
	
	
	
	TecnicoConcomitante(String nomeCurso, String coordCurso) {
		super(nomeCurso, coordCurso);
	}

	@Override
	public String getDescricao() {
		return "Concomitância Externa: o aluno faz o ensino médio e o técnico paralelamente, ou seja, cursa o médio em um período"
				+ " e o técnico em outro.";
	}
}
