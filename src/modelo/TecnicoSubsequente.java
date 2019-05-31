package modelo;

public class TecnicoSubsequente extends Cursos {

	TecnicoSubsequente(String nomeCurso, String coordCurso) {
		super(nomeCurso, coordCurso);
	}

	@Override
	public String getDescricao() {
		return "Subsequente: o aluno cursa o ensino técnico após a conclusão do ensino médio.";
	}
}
