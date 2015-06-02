package pila;

import java.util.ArrayList;

/**
 * Implementa las operaciones b�sicas de una estructura de datos pila (o stack).
 * Una pila es una estructura LIFO donde el �ltimo elemento en entrar es el
 * primero en salir.
 * 
 * @author mlmc
 * 
 * @param <T>
 */
public class Pila<T> {
	private ArrayList<T> pila = null;

	/**
	 * Constructor de la estructura pila
	 */
	Pila() {
		pila = new ArrayList<T>();
	}

	/**
	 * Apila un elemento a la pila
	 * 
	 * @param element
	 *            elemento a a�adir
	 */
	void push(T element) {
		pila.add(element);
	}

	/**
	 * Retira/elimina la cima de la pila
	 * 
	 * @return cima de la pila
	 */
	T pop() {
		if (pila.size() == 0)
			return null;
		return pila.remove(pila.size() - 1);
	}

	/**
	 * Devuelve la cima de la pila
	 * 
	 * @return cima de la pila
	 */
	T top() {
		if (pila.size() == 0)
			return null;
		return pila.get(pila.size() - 1);

	}

	/**
	 * Muestra la pila
	 */
	void show() {
		System.out.println(pila);
	}

	/**
	 * Devuelve si la pila est� vac�a
	 * 
	 * @return true si la pila est� vac�a
	 */
	boolean IsEmpty() {
		if (pila.size() == 0)
			return true;
		return false;
	}

	int size() {
		return pila.size();
	}

}
