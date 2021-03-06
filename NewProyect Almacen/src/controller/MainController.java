package controller;

import interfaces.IDrink;
import interfaces.IMainController;
import interfaces.IStore;
import interfaces.IView;

public class MainController implements IMainController {
	IView view;
	IStore store;
	@Override
	public void run() {
		int option=-1;
		do {
			showMainMenu();
			option=view.readMainMenuOption();
			switchMain(option);
		}while(option!=5);
		
		
	}
	/**
	 * Muestra el menu principal de acci?n.
	 */
	private void showMainMenu() {
		view.showMainMenu();
	}
	/**
	 * Ejecuta una de las opciones disponibles del 
	 * menu principal en fnci?n del valor de opcion
	 * @param option valor le?do por teclado despu?s
	 * del menu principal
	 */
	private void switchMain(int option) {
		switch(option) {
			case 1:
					addDrink();
					break;
			case 2:
					String name = "";
					searchDrink(name);
					break;
			case 3: 
					String name2 = "";
					getDrink(name2);
					break;
			case 4:
					//IDrink drink;
					//updateDrink(drink);
					break;
			case 5: 
					getHowMuch();
					break;
			case 6:
					break;
			default:
		}
	}
	/**
	 * Ejecuta la accion de a?adir una nueva bebida, para
	 * tomar los datos hace uso de secundary controller
	 * @param drink bebida nueva a insertar
	 * @return devuelve false si no pudo ser insertada por no 
	 * haber espacio o existir ya una bebida con el mismo nombre
	 */
	private boolean addDrink() {
		
		return store.addDrink(null);
	}
	/**
	 * Busca y devuelve la bebida dada por el nobre name 
	 * @param name nombre de la bebida a buscar
	 * @return devuelve la bebida o null en caso de no existir
	 */
	private IDrink searchDrink(String name) {
		return null;
		
	}
	/**
	 * Busca, devuelve y elimina la bebida del almacen dada por el nombre name
	 * @param name nombre de la bebida a extraer
	 * @return la bebida o null en caso de no existir
	 */
	private IDrink getDrink(String name) {
	return null;	
	}
	/**
	 * Actualiza la bebida con los nuevos datos insertados
	 * @param drink bebida a ser actualizada
	 * @return devuelve false en caso de no haber podido
	 * ser actualizada por no existir.
	 */
	private boolean upadateDrink(IDrink drink) {
		return false;
	}
	/**
	 * Devuelve la cantidad de dinero en bebidas 
	 * que existe en el almacen
	 * @return la cantidad de dinero en formato float.
	 */
	private float getHowMuch() {
		return 0;
	}

}
