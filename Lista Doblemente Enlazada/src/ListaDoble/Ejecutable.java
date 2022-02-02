package ListaDoble;

public class Ejecutable {
	public static void main(String[] args) {
		Lista_Doble<String> lista = new Lista_Doble();
		
		
		
		lista.push("Hola");
		lista.push("Adios");
		lista.push("Buenas tardes");
		int x=lista.push("Hola");
		
		System.out.println(x);
		System.out.println(lista);
	}
}
