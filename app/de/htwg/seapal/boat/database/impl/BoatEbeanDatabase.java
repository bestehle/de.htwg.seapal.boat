package de.htwg.seapal.boat.database.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.avaje.ebean.Ebean;

import de.htwg.seapal.boat.database.IBoatDatabase;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.models.impl.Boat;

public class BoatEbeanDatabase implements IBoatDatabase {

	@Override
	public UUID newBoat() {
		IBoat boat = new Boat();
		Ebean.save(boat);
		return boat.getId();
	}

	@Override
	public void saveBoat(IBoat boat) {
		Ebean.save(boat);
	}

	@Override
	public void deleteBoat(UUID id) {
		Ebean.delete(Boat.class, id);

	}

	@Override
	public IBoat getBoat(UUID id) {
		IBoat boat = Ebean.find(IBoat.class, id);
		if (boat == null)
			throw new NoSuchElementException("No Boat for id : " + id);
		return boat;
	}

	@Override
	public List<IBoat> getBoats() {
		return Ebean.find(IBoat.class).findList();
	}

	@Override
	public boolean closeDB() {
		return true;
	}

}
