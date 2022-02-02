
public class Lista_Enlazada<T> {
	private Nodo<T> primero;

	public Lista_Enlazada(Nodo<T> primero) {
		this.primero = primero;
	}

	public boolean isEmpty() {
		if (this.primero == null) {
			return true;
		} else {
			return false;
		}
	}

	public Nodo<T> getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}

	public void addFirst(T dato) {
		Nodo<T> nuevo = new Nodo<T>(dato);
		nuevo.setSiguiente(this.primero);
		this.setPrimero(nuevo);
	}

	public void addLast(T dato) {
		if (this.isEmpty()) {
			addFirst(dato);
		} else {
			Nodo<T> nuevo = new Nodo<T>(dato);
			Nodo<T> aux = this.getPrimero();
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);

		}
	}

	public T getFirst() {
		if (!this.isEmpty()) {
			return this.getPrimero().getDato();
		} else {
			return null;
		}
	}

	public int lenghtList() {
		int cont = 0;
		if (this.isEmpty()) {
			return 0;
		} else {
			Nodo<T> aux = this.getPrimero();
			while (aux != null) {
				aux = aux.getSiguiente();
				cont += 1;

			}
		}
		return cont;
	}

	public T getDato(int pos) {
		int cont = 0;
		Nodo<T> aux = this.getPrimero();
		if (this.isEmpty()) {
			return null;
		} else if (pos > this.lenghtList()) {
			return null;
		} else {
			while (cont < pos) {
				aux = aux.getSiguiente();
				cont++;
			}
		}
		return aux.getDato();
	}

	public Nodo<T> getNodo(int pos) {
		int cont = 0;
		Nodo<T> aux = this.getPrimero();
		if (this.isEmpty()) {
			return null;
		} else if (pos > this.lenghtList()) {
			return null;
		} else {
			while (cont < pos) {
				aux = aux.getSiguiente();
				cont++;
			}
		}
		return aux;
	}

}
