package system;

import javax.swing.UIManager;

import gui.Menu;

public class ClasePrincipal {
	public static void main(String[] args) {
		try {
			RentACarSystem racs = new RentACarSystem();
			Menu menu = new Menu(racs);
			menu.setVisible(true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}