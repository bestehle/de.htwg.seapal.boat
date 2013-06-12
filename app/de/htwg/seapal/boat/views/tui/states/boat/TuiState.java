package de.htwg.seapal.boat.views.tui.states.boat;

public interface TuiState {

	public String buildString(StateContext context);

	public boolean process(StateContext context, String input);

}