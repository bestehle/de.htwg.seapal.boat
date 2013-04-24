package de.htwg.seapal.boat.database.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.boat.database.IBoatDatabase;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.models.impl.Boat;

public class BoatDb4oDatabase implements IBoatDatabase {

	private ObjectContainer db;

	public BoatDb4oDatabase() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "boat.db");
	}

	@Override
	public UUID newBoat() {
		IBoat boat = new Boat();
		saveBoat(boat);
		return boat.getId();
	}

	@Override
	public void saveBoat(IBoat boat) {
		db.store(boat);
	}

	@Override
	public void deleteBoat(UUID id) {
		db.delete(getBoat(id));
	}

	@Override
	public IBoat getBoat(final UUID id) {
		@SuppressWarnings("serial")
		List<IBoat> query = db.query(new Predicate<IBoat>() {
			@Override
			public boolean match(IBoat boat) {
				return boat.getId().equals(id);
			}
		});
		if (query.isEmpty())
			throw new NoSuchElementException("No Boat for id : " + id);
		IBoat boat = query.get(0);
		return boat;
	}

	@Override
	public List<IBoat> getBoats() {
		return db.query(IBoat.class);
	}

	@Override
	public boolean closeDB() {
		return db.close();
	}
	
	

}
