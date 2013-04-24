package de.htwg.seapal.boat.database.impl;

import java.util.List;
import java.util.NoSuchElementException;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.boat.database.IBoatDatabase;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.models.impl.Boat;
import de.htwg.seapal.boat.models.impl.IdContainer;

public class BoatDb4oDatabase implements IBoatDatabase {

	private ObjectContainer db;

	public BoatDb4oDatabase() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "boat3.db");
	}

	@Override
	public String newBoat() {
		IBoat boat = new Boat();
		String id = getNewId();
		boat.setId(id);
		saveBoat(boat);
		return id;
	}

	@Override
	public void saveBoat(IBoat boat) {
		db.store(boat);
	}

	@Override
	public void deleteBoat(String id) {
		db.delete(getBoat(id));
	}

	@Override
	public IBoat getBoat(final String id) {
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
	public String getNewId() {
		IdContainer currentId;
		List<IdContainer> query = db.query(IdContainer.class);
		if (query.isEmpty()) {
			currentId = new IdContainer(0);
			db.store(currentId);
		} else {
			currentId = query.get(0);
			currentId.setId(currentId.getId() + 1);
			db.store(currentId);
		}
		return "BOAT-" + currentId.getId();
	}

	@Override
	public boolean closeDB() {
		return db.close();
	}
	
	

}
