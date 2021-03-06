package ej1Colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class coleccionCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Pepe","001",52000);
		Cliente c2 = new Cliente("Ana","002",2000);
		Cliente c3 = new Cliente("Maria","003",23000);
		Cliente c4 = new Cliente("Pepe","001",52000);

		Set <Cliente> misClientes = new HashSet<Cliente>();
	
		misClientes.add(c1);
		misClientes.add(c2);
		misClientes.add(c3);
		misClientes.add(c4);
		
		for(Cliente c:misClientes) {
			System.out.println(c);
		}
		
	
		Iterator <Cliente> it = misClientes.iterator();
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		/*while(it.hasNext()) {
			Cliente c= it.next();
			System.out.println(c.getnAccount());
			System.out.println(c.getName());
		}*/
		
		//Buscar un elemento y borrarlo usando for-each.
		/*for(Cliente c:misClientes) {
			if(c.getName().equals("Pepe")) {
				misClientes.remove(c);
			}
		}*/
		
		while(it.hasNext()) {
			Cliente c=it.next();
			if(c.getnAccount().equals("Ana")) {
				it.remove();
			}
		}
		System.out.println("------------------------------");
		for(Cliente c:misClientes) {
			System.out.println(c);
		}
	}

}
