package de.htwg.seapal.boat.views.tui;

import java.util.Scanner;

import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.util.observer.Event;
import de.htwg.seapal.boat.util.observer.IObserver;
import de.htwg.seapal.boat.views.tui.states.boat.StartState;
import de.htwg.seapal.boat.views.tui.states.boat.StateContext;
import de.htwg.seapal.boat.views.tui.states.boat.TuiState;
import de.htwg.seapal.common.plugin.Plugin;

public class BoatTUI implements IObserver, Plugin, StateContext {

	private IBoatController controller;
	private Scanner scanner = new Scanner(System.in);
	protected TuiState currenState;

	@Inject
	public BoatTUI(IBoatController controller) {
		this.controller = controller;
		controller.addObserver(this);
		currenState = new StartState(controller);
	}

	public boolean processInputLine(String arg0) {
		try {
			while (true) {
				String input = scanner.next();
				// in.setText("");
				currenState.process(this, input);
				printTUI();
			}
		} finally {
			controller.closeDB();
			scanner.close();
		}
	}

	@Override
	public void update(Event e) {
		printTUI();
	}

	public void printTUI() {
		System.out.println(currenState.buildString(this));
	}

	@Override
	public String getMenuEntry() {
		return "boat";
	}

	@Override
	public char getMenuKey() {
		return 'b';
	}

	@Override
	public void setState(TuiState newState) {
		currenState = newState;
	}
}
