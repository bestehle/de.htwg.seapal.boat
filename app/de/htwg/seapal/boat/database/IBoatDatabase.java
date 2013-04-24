package de.htwg.seapal.boat.database;

import java.util.List;
import java.util.UUID;

import de.htwg.seapal.boat.models.IBoat;

public interface IBoatDatabase {

	UUID newBoat();

	void saveBoat(IBoat boat);

	void deleteBoat(UUID id);

	IBoat getBoat(UUID id);

	List<IBoat> getBoats();

	boolean closeDB();
}
