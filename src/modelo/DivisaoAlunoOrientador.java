package modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DivisaoAlunoOrientador {
	private Map<Aluno, Orientador> divisao = new HashMap();
	
	
	public boolean estaVazia() {
		return divisao.isEmpty();
	}
	
	public void distribuiAluno(Aluno a, Orientador o) {
		divisao.put(a, o);
	}
	public Orientador getOrientador(Aluno a) {
		return divisao.get(a);
	}
	
	public Set<Aluno> getLista(){
		Set<Aluno> lista = divisao.keySet();
		return lista;
	}
	
}
