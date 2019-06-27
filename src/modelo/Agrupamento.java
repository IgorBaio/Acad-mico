package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Agrupamento<E> {

	private List<E> lista = new ArrayList();

	public void adiciona(E elemento) {
		lista.add(elemento);
	}
	
	public E remove() {
		Random r = new Random(System.currentTimeMillis());
		return lista.remove(r.nextInt(lista.size()));
	}
	
	public void adicionaEmGrupo(List<? extends E> elementos){
		for (E e : elementos) {
		 this.adiciona(e);
		 }
	}
	
	public List<E> imprime() {
		return this.lista;
	}

}
