package de.htwg.seapal.boat.database;

import java.util.List;

import de.htwg.seapal.boat.models.IBoat;

public interface IBoatDatabase {
	String newBoat();
	void saveBoat(IBoat boat);
	void deleteBoat(String id);
	IBoat getBoat(String id);
	List<IBoat> getBoats();
	String getNewId();
	boolean closeDB();
}
