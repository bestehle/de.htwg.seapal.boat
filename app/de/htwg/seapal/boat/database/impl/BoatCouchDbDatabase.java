package de.htwg.seapal.boat.database.impl;

import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.UpdateConflictException;
import org.ektorp.ViewQuery;
import org.ektorp.ViewResult;
import org.ektorp.ViewResult.Row;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

import de.htwg.seapal.boat.database.IBoatDatabase;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.models.impl.Boat;

public class BoatCouchDbDatabase implements IBoatDatabase {

	private CouchDbConnector db;

	public BoatCouchDbDatabase() {
		HttpClient client = null;
		try {
			client = new StdHttpClient.Builder().url(
					"http://lenny2.in.htwg-konstanz.de:5984").build();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		CouchDbInstance dbInstance = new StdCouchDbInstance(client);
		db = dbInstance.createConnector("boat_database", true);
	}

	@Override
	public UUID newBoat() {
		IBoat boat = new Boat();
		try {
			db.create(boat.getId(), boat);
		} catch (UpdateConflictException e) {
		}
		UUID idx = UUID.fromString(boat.getId());
//		dbHelper.pushToDatabase();
		return idx;
	}
	@Override
	public void saveBoat(IBoat boat) {
		try {
			db.update(boat);
//			dbHelper.pushToDatabase();
		} catch (DocumentNotFoundException e) {
			return;
		}
	}
	@Override
	public void deleteBoat(UUID id) {
		try {
			db.delete(getBoat(id));
//			dbHelper.pushToDatabase();
		} catch (Exception e) {
			return;
		}
	}
	@Override
	public IBoat getBoat(UUID id) {
		IBoat boat;
		try {
			boat = db.get(Boat.class, id.toString());
		} catch (DocumentNotFoundException e) {
			return null;
		}
		return boat;
	}
	@Override
	public List<IBoat> getBoats() {
		List<IBoat> lst = new LinkedList<IBoat>();
		List<String> log = new LinkedList<String>();
		ViewQuery query = new ViewQuery().allDocs();		
		ViewResult vr = db.queryView(query);
		
	
		for(Row r : vr.getRows()) {
			lst.add(getBoat(UUID.fromString(r.getId())));
			log.add(r.getId());
		}
		return lst;
	}
	@Override
	public boolean closeDB() {
		return false;
	}
	
	

}
