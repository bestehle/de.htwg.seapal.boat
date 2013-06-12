package de.htwg.seapal.boat.views.tui.states.boat;

import java.util.Map;
import java.util.UUID;

import de.htwg.seapal.boat.controllers.IBoatController;

public class StartState implements TuiState {

	private Map<String, String> boats;

	IBoatController controller;
	
	public StartState(IBoatController c) {
		this.controller = c;
	}

	@Override
	public String buildString(StateContext context) {
		boats = controller.getBoats();
		StringBuilder sb = new StringBuilder();
		sb.append("q \t- Quit\n");
		sb.append("n \t- New Boat\n");
		sb.append("<X> \t- Show Boat\n");
		sb.append("---------------------------------------\n");
		int i = 1;
		for (String uuid : boats.keySet()) {
			sb.append(i++).append(")\t").append(controller.getBoatName(UUID.fromString(uuid)))
					.append("\n");
		}
		return sb.toString();
	}

	@Override
	public boolean process(StateContext context, String input) {
		switch (input.charAt(0)) {
		case 'q':
			break;
		case 'n':
			context.setState(new NewState(controller));
			break;
		default:
			Integer number;
			try {
				number = Integer.valueOf(input) - 1;
			} catch (NumberFormatException e) {
				// unkown option
				return false;
			}
			if (number < boats.size() && number >= 0)
				context.setState(new ShowState(UUID.fromString((String)boats.keySet().toArray()[number]), controller));
			else;
				// unkown option
		}
		return false;
	}
}