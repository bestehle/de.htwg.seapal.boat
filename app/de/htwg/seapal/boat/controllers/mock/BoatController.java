package de.htwg.seapal.boat.controllers.mock;


import java.util.HashMap;
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
		Map<String, String> list = new HashMap<String, String>();
		list.put(boat.getId(), boat.getBootsname());
		return list;
	}

	@Override
	public String getBootsnameById(String id) {
		return boat.getBootsname();
	}

	
}
