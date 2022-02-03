package ListaDoble;

public class Ejecutable {
	public static void main(String[] args) {
		Lista_Doble<String> lista = new Lista_Doble();
		
		
		lista.push("Hola 1");
		lista.push("Hola 2");
		lista.push("Hola 3");
		lista.push("Hola 4");
		lista.push("Hola 5");
		System.out.println(lista.contains("Hola 3"));
		System.out.println(lista);
	}
	
}
