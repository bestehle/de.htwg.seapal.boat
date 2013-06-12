package de.htwg.seapal.boat.views.tui.states.boat;

import java.util.UUID;

import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatController;

public class NewState implements TuiState {

	IBoatController controller;
	
	public NewState(IBoatController c) {
		this.controller = c;
	}
	
	@Override
	public String buildString(StateContext context) {
		return "q - quit \n\n Enter BoatName";
	}

	@Override
	public boolean process(StateContext context, String input) {
		if (input.equals("q")) {
			context.setState(new StartState(controller));
			return false;
		}
		UUID boat = controller.newBoat();
		controller.setBoatName(boat, input);
		context.setState(new ShowState(boat, controller));
		return true;
	}

}
