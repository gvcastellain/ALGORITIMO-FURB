package pilhas;

import listaencadeada.*;

public class PilhaLista <T> implements Pilha <T> {
	
	private ListaEncadeada<T> lista = new ListaEncadeada<T>();
	

	@Override
	public void push(T valor) {
		lista.inserir(valor);
	}

	@Override
	public T pop() {
		T valor;
		valor = peek();
		lista.retirar(valor);
		return valor;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new PilhaVaziaException();
		}
		return lista.getPrimeiro().getInfo();
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {
		lista = new ListaEncadeada<>();
		
	}

	public String toString() {
		return lista.toString();
	}
}
