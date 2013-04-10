package de.htwg.seapal.boat.controllers.impl;


import java.util.Map;

import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.AbstractBoatController;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.person.controllers.IPersonController;

public class BoatController extends AbstractBoatController {

	@Inject
	public BoatController(IBoat boat, IPersonController personController) {
		this.personContoller = personController;
		this.boat = boat;
	}
	
	@Override
	public Map<String, String> getBoats() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBootsnameById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
