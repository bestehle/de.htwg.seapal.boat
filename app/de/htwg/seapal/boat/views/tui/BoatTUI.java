package de.htwg.seapal.boat.views.tui;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.util.observer.Event;
import de.htwg.seapal.boat.util.observer.IObserver;
import de.htwg.seapal.common.plugin.Plugin;

public class BoatTUI implements IObserver, Plugin {

	private IBoatController controller;
	private Scanner scanner = new Scanner(System.in);

	@Inject
	public BoatTUI(IBoatController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		try {
			while (true) {
				switch (line.toLowerCase().charAt(0)) {
				case 'l':
					System.out.println(listBoats());
					break;
				case 's':
					System.out.print("\t ID: \t BOAT-");
					System.out.println(showBoat("BOAT-" + scanner.next()));
					break;
				case 'n':
					newBoat();
					break;
				case 'e':
					editBoat();
					break;
				case 'd':
					deleteBoat();
					break;
				case 'q':
					return false;
				default:
					break;
				}
				line = scanner.next();
			}
		} finally {
			controller.closeDB();
			scanner.close();
		}
	}

	private void editBoat() {
		System.out.print("\t ID: \t BOAT-");
		String id = "BOAT-" + scanner.next();
		String bootsname = "";
		try {
			bootsname = controller.getBootsname(id);
		} catch (NoSuchElementException e) {
			System.out.println("\t " + e.getMessage());
			return;
		}
		System.out.print("\t " + bootsname + ": set Bootsname to : ");
		bootsname = scanner.next();
		controller.setBootsname(id, bootsname);		
	}
	
	private void deleteBoat() {
		System.out.print("\t ID: \t BOAT-");
		String id = "BOAT-" + scanner.next();
		String bootsname = "";
		try {
			bootsname = controller.getBootsname(id);
		} catch (NoSuchElementException e) {
			System.out.println("\t " + e.getMessage());
			return;
		}
		controller.deleteBoat(id);
		System.out.println("\t Deleted Boat:" + bootsname);
	}

	private void newBoat() {
		System.out.print("\t Bootsname:\t");
		String bootsname = scanner.next();
		String id = controller.newBoat();
		controller.setBootsname(id, bootsname);
	}

	private String listBoats() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t ID \t\t Bootsname\n");
		sb.append("\t ----------- \t -----------\n");
		Map<String, String> boats = controller.getBoats();
		for (Entry<String, String> entry : boats.entrySet()) {
			sb.append("\t " + entry.getKey() + "\t " + entry.getValue() + "\n");
		}
		return sb.toString();
	}

	private String showBoat(String id) {
		try {
			return "\t " + controller.getString(id);
		} catch (NoSuchElementException e) {
			return e.getMessage();
		}

	}

	public void printTUI() {
		System.out.println("BoatDemo: ");
		System.out.println("\t l - List Boats");
		System.out.println("\t s - Show Boat");
		System.out.println("\t n - New Boat");
		System.out.println("\t e - Edit Boat");
		System.out.println("\t d - Delete Boat");
		System.out.println("\t q - Quit to MainMenu");
	}

	@Override
	public String getMenuEntry() {
		return "boat";
	}

	@Override
	public char getMenuKey() {
		return 'b';
	}

}
