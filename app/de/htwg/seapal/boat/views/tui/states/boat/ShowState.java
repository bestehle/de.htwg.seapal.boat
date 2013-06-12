package de.htwg.seapal.boat.views.tui.states.boat;

import java.util.UUID;

import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatController;

public class ShowState implements TuiState {

	private UUID boat;
	
	IBoatController controller;
	

	public ShowState(UUID boat, IBoatController c) {
		this.controller = c;
		this.boat = boat;
	}

	@Override
	public String buildString(StateContext context) {
		StringBuilder sb = new StringBuilder();
		sb.append("q - quit\n");
		sb.append("d - delete boat\n");
		sb.append("e - edit\n");
//		sb.append("t - show trips\n");
		sb.append("--------------------------------------------------\n");
		sb.append(controller.getString(boat));
		return sb.toString();
	}

	@Override
	public boolean process(StateContext context, String input) {
		switch (input.charAt(0)) {
		case 'q':
			context.setState(new StartState(controller));
			break;
		case 'd':
			context.setState(new StartState(controller));
			controller.deleteBoat(boat);
			break;
		case 'e':
			context.setState(new EditSelectState(boat, controller));
			break;
//		case 't':
//			Intent intent = new Intent(activity, TripActivity.class);
//			intent.putExtra("boat", boat.toString());
//			activity.startActivity(intent);
//			break;
		default:
//			Toast.makeText(activity, "Unkown Option", Toast.LENGTH_SHORT)
//					.show();
			return false;
		}

		return true;
	}

}
