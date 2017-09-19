package ui;

import javax.swing.JOptionPane;

public class Menu {
	
	public void show() {
		String menu = createMenu();
		int keuze = -1;
		while (keuze != 0) {
			keuze = -1;
			String keuzeAlsString = JOptionPane.showInputDialog(menu);
			try {
				keuze = Integer.parseInt(keuzeAlsString);
				dispatch(keuze);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Gelieve een geldig cijfer in te geven");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getClass() + "\n" + e.getMessage());
			}
		}
	}
	
	private String createMenu() {
		return "1. Menu uit te werken\n" + 
				"\n0.  Stop\n\n"
				+ "Maak uw keuze: ";
	}

	private void dispatch(int keuze) throws IllegalArgumentException {

		switch (keuze) {
		case 0:
			System.exit(0);
			break;
		case 1:
			//TODO
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"Gelieve een geldig cijfer in te geven");
		}
	}


}
