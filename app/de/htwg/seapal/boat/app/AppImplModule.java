package de.htwg.seapal.boat.app;


import com.google.inject.AbstractModule;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.person.controllers.IPersonController;

public class AppImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBoat.class).to(de.htwg.seapal.boat.models.impl.Boat.class);
		bind(IBoatController.class).to(de.htwg.seapal.boat.controllers.impl.BoatController.class);	
		bind(IPersonController.class).to(de.htwg.seapal.person.controllers.impl.PersonController.class);
	}

}
