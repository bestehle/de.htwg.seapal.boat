package de.htwg.seapal.boat.views.tui;

import java.util.Scanner;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.util.observer.Event;
import de.htwg.seapal.boat.util.observer.IObserver;

public class BoatTUI implements IObserver {

	private IBoatController controller;

	public BoatTUI(IBoatController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		boolean continu = true;
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		if (line.equalsIgnoreCase("n")) {
			Scanner scanner = new Scanner(System.in);
			controller.setBootsname(scanner.next());
		}
		return continu;
	}
	
	public void printTUI() {
		System.out.println("BoatDemo: n - new Name");
		System.out.println(controller.getString());
		
	}

}
