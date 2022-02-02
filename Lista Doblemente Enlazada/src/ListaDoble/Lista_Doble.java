package ListaDoble;

public class Lista_Doble <T>{
	private Nodo<T> primero;
	private int size;
	
	
	public Lista_Doble() {
		this.primero = null;
	}

	@Override
	public String toString() {
		return "Los datos de la lista son: \n"+ this.primero.getDato();
	}
	/**
	 * Insertar un nodo al final de la lista
	 * @param v el valor del nodo a insertar
	 * @return el nuevo tamaño de la lista
	 */
	 public int push(T v) {
		 Nodo<T> nuevo = new Nodo<> (v);
		 if(this.primero==null) {
			 this.primero=nuevo;
			 this.size++;
		 }else {
			 Nodo<T> aux = this.primero;
			 while(this.primero.siguiente!=null) {
				 this.primero.siguiente=nuevo;
				 this.primero.anterior=aux;
				 this.size++;
			 }
		 }
		 return this.size;
	 }
	 /**
	  * Insertar un nodo al principio de la lista
	  * @param v el valor del nodo a insertar 
	  * @return el nuevo tamaño de la lista
	  */
	 public int unshift(T v) {
		 Nodo <T> nuevo = new Nodo <T>(v);
		 if(this.primero==null) {
			 this.primero=nuevo;
			 this.size++;
		 }else {
			 Nodo<T> aux=this.primero;
			 this.primero=nuevo;
			 this.primero.siguiente=aux;
			 this.size++;
		 }
		 return this.size;
	 }
	 public T pop() {
		 if(this.primero==null) {
			 return null;
		 }else {
			 Nodo<T> aux;
			 while(this.primero.siguiente!=null) {
				 aux = this.primero.siguiente;
				 this.primero.siguiente=this.primero.anterior;
				 return aux.getDato(); 
			 }
			 return null;
		 }
	 }
	 public T shift() {
		 if(this.primero==null) {
			 return null;
		 }else {
			 return this.primero.getDato();
		 }
	 }
	 public int contains(T v) {
		 int cont=1;
		 if (this.primero==null) {
			 return -1;
		 }else if(this.primero.getDato().equals(v)){
			 return cont++; 
		 }else{
			 while(this.primero.siguiente.getDato()!=v) {
				 cont++; 
			 }
			 return cont;
		 }
	 }
	 public T get(int pos) {
		 if(this.primero==null) {
			 return null;
		 }else if{
			 
		 }
	 }
	 public int put(T value, int pos) {
		 
	 }
	 public int remove(int pos) {
		 
	 }
	 public int removeElement(T v) {
		 
	 }
	
	
	
}
