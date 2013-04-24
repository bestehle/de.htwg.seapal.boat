package de.htwg.seapal.boat.controllers.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.avaje.ebean.Ebean;
import com.db4o.query.Predicate;
import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.models.impl.Boat;
import de.htwg.seapal.boat.util.observer.Observable;
import de.htwg.seapal.person.controllers.IPersonController;

public class BoatControllerEBean extends Observable implements IBoatController {

	protected IPersonController personContoller;
	private IBoat boat;

	@Inject
	public BoatControllerEBean(IBoat boat, IPersonController personController) {
		this.personContoller = personController;
		this.boat = boat;
	}
	
	@Override
	public String getBootsname(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBootsname(String id, String bootsname) {
		IBoat boat = getBoat(id);
		boat.setBootsname(bootsname);
		Ebean.save(boat);
	}

	@Override
	public String getRegisterNr(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegisterNr(String id, String registerNr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSegelzeichen(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSegelzeichen(String id, String segelzeichen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getHeimathafen(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setHeimathafen(String id, String heimathafen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getYachtclub(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setYachtclub(String id, String yachtclub) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEigner(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEigner(String id, String eigner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVersicherung(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVersicherung(String id, String versicherung) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRufzeichen(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRufzeichen(String id, String rufzeichen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTyp(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTyp(String id, String typ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getKonstrukteur(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setKonstrukteur(String id, String konstrukteur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getLaenge(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLaenge(String id, double laenge) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getBreite(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBreite(String id, double breite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTiefgang(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTiefgang(String id, double tiefgang) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getMasthoehe(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMasthoehe(String id, double masthoehe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getVerdraengung(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVerdraengung(String id, double verdraengung) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRiggArt(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRiggArt(String id, String riggArt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBaujahr(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBaujahr(String id, int baujahr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMotor(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMotor(String id, String motor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTankGroesse(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTankGroesse(String id, double tankGroesse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWassertankGroesse(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWassertankGroesse(String id, double wassertankGroesse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAbwassertankGroesse(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAbwassertankGroesse(String id, double abwassertankGroesse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getGrosssegelGroesse(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setGrosssegelGroesse(String id, double grosssegelGroesse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getGenuaGroesse(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setGenuaGroesse(String id, double genuaGroesse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSpiGroesse(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSpiGroesse(String id, double spiGroesse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getString(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String newBoat() {
		IBoat newBoat = new Boat();
		String id = getNewId();
		newBoat.setId(id);
		Ebean.save(newBoat);
		return id;
	}

	@Override
	public void deleteBoat(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeDB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, String> getBoats() {
		List<IBoat> boats = Ebean.find(IBoat.class).findList();
		Map<String, String> map = new HashMap<String, String>();
		for (IBoat boat : boats) {
			map.put(boat.getId(), boat.getBootsname());
		}
		return map;
	}

	@Override
	public String getBootsnameById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPersonnameById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String getNewId() {
		IdContainer currentId;
		List<IdContainer> query = Ebean.find(IdContainer.class).findList();
		if (query.isEmpty()) {
			currentId = new IdContainer(0);
			Ebean.save(currentId);
		} else {
			currentId = query.get(0);
			currentId.setId(currentId.getId() + 1);
			Ebean.save(currentId);
		}
		return "BOAT-" + currentId.getId();
	}
	
	private IBoat getBoat(final String id) {
		IBoat boat = Ebean.find(IBoat.class, id);
		if (boat == null)
			throw new NoSuchElementException("No Boat for id : " + id);
		return boat;
	}

	@Entity
	private static class IdContainer {
		@Id
		private int id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public IdContainer(int id) {
			this.id = id;
		}

	}	
}
