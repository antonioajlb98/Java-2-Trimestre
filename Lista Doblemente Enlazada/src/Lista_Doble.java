
public class Lista_Doble <T>{
	private Nodo<T> primero;
	private int size;
	
	
	public Lista_Doble(Nodo<T> primero, int size) {
		this.primero = primero;
		this.size = size;
	}


	@Override
	public String toString() {
		return "Los datos de la lista son: \n"+ this.primero.getDato()+"\n"+this.primero.siguiente;
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
				 nuevo=this.primero;
				 aux=this.primero.siguiente;
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
		 }else {
			 
		 }
		 return this.size;
		 
	 }
	
	
	
}
