package de.htwg.seapal.boat.controllers.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.util.observer.Observable;
import de.htwg.seapal.person.controllers.IPersonController;

public class BoatController extends Observable implements IBoatController {

	protected IPersonController personContoller;
	private ObjectContainer db;
	private IBoat boat;

	@Inject
	public BoatController(IBoat boat, IPersonController personController) {
		this.personContoller = personController;
		db = Db4oEmbedded
				.openFile(Db4oEmbedded.newConfiguration(), "boat.db");
		this.boat = boat;
	}

	@Override
	public Map<String, String> getBoats() {
		List<IBoat> query = db.query(IBoat.class);
		Map<String, String> map = new HashMap<String, String>();
		for (IBoat boat : query) {
			map.put(boat.getId(), boat.getBootsname());
		}
		return map;
	}

	@Override
	public String getBootsnameById(String id) {
		return getBootsname(id);
	}

	@Override
	public String getBootsname(final String id) {
		return getBoat(id).getBootsname();
	}

	private IBoat getBoat(final String id) {
		@SuppressWarnings("serial")
		List<IBoat> query = db.query(new Predicate<IBoat>() {
			@Override
			public boolean match(IBoat boat) {
				return boat.getId() == id;
			}
		});
		IBoat boat = query.get(0);
		return boat;
	}

	@Override
	public void setBootsname(String id, String bootsname) {
		IBoat boat = getBoat(id);
		boat.setBootsname(bootsname);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getRegisterNr(String id) {
		return getBoat(id).getRegisterNr();
	}

	@Override
	public void setRegisterNr(String id, String registerNr) {
		IBoat boat = getBoat(id);
		boat.setRegisterNr(registerNr);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getSegelzeichen(String id) {
		return getBoat(id).getSegelzeichen();
	}

	@Override
	public void setSegelzeichen(String id, String segelzeichen) {
		IBoat boat = getBoat(id);
		boat.setSegelzeichen(segelzeichen);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getHeimathafen(String id) {
		return getBoat(id).getHeimathafen();
	}

	@Override
	public void setHeimathafen(String id, String heimathafen) {
		IBoat boat = getBoat(id);
		boat.setHeimathafen(heimathafen);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getYachtclub(String id) {
		return getBoat(id).getYachtclub();
	}

	@Override
	public void setYachtclub(String id, String yachtclub) {
		IBoat boat = getBoat(id);
		boat.setYachtclub(yachtclub);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getEigner(String id) {
		return getBoat(id).getEigner();
	}

	@Override
	public void setEigner(String id, String eigner) {
		IBoat boat = getBoat(id);
		boat.setEigner(eigner);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getVersicherung(String id) {
		return getBoat(id).getVersicherung();
	}

	@Override
	public void setVersicherung(String id, String versicherung) {
		IBoat boat = getBoat(id);
		boat.setVersicherung(versicherung);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getRufzeichen(String id) {
		return getBoat(id).getRufzeichen();
	}

	@Override
	public void setRufzeichen(String id, String rufzeichen) {
		IBoat boat = getBoat(id);
		boat.setRufzeichen(rufzeichen);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getTyp(String id) {
		return getBoat(id).getTyp();
	}

	@Override
	public void setTyp(String id, String typ) {
		IBoat boat = getBoat(id);
		boat.setTyp(typ);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getKonstrukteur(String id) {
		return getBoat(id).getKonstrukteur();
	}

	@Override
	public void setKonstrukteur(String id, String konstrukteur) {
		IBoat boat = getBoat(id);
		boat.setKonstrukteur(konstrukteur);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getLaenge(String id) {
		return getBoat(id).getLaenge();
	}

	@Override
	public void setLaenge(String id, double laenge) {
		IBoat boat = getBoat(id);
		boat.setLaenge(laenge);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getBreite(String id) {
		return getBoat(id).getBreite();
	}

	@Override
	public void setBreite(String id, double breite) {
		IBoat boat = getBoat(id);
		boat.setBreite(breite);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getTiefgang(String id) {
		return getBoat(id).getTiefgang();
	}

	@Override
	public void setTiefgang(String id, double tiefgang) {
		IBoat boat = getBoat(id);
		boat.setTiefgang(tiefgang);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getMasthoehe(String id) {
		return getBoat(id).getMasthoehe();
	}

	@Override
	public void setMasthoehe(String id, double masthoehe) {
		IBoat boat = getBoat(id);
		boat.setMasthoehe(masthoehe);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getVerdraengung(String id) {
		return getBoat(id).getVerdraengung();
	}

	@Override
	public void setVerdraengung(String id, double verdraengung) {
		IBoat boat = getBoat(id);
		boat.setVerdraengung(verdraengung);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getRiggArt(String id) {
		return getBoat(id).getRiggArt();
	}

	@Override
	public void setRiggArt(String id, String riggArt) {
		IBoat boat = getBoat(id);
		boat.setRiggArt(riggArt);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public int getBaujahr(String id) {
		return getBoat(id).getBaujahr();
	}

	@Override
	public void setBaujahr(String id, int baujahr) {
		IBoat boat = getBoat(id);
		boat.setBaujahr(baujahr);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getMotor(String id) {
		return getBoat(id).getMotor();
	}

	@Override
	public void setMotor(String id, String motor) {
		IBoat boat = getBoat(id);
		boat.setMotor(motor);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getTankGroesse(String id) {
		return getBoat(id).getTankGroesse();
	}

	@Override
	public void setTankGroesse(String id, double tankGroesse) {
		IBoat boat = getBoat(id);
		boat.setTankGroesse(tankGroesse);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getWassertankGroesse(String id) {
		return getBoat(id).getWassertankGroesse();
	}

	@Override
	public void setWassertankGroesse(String id, double wassertankGroesse) {
		IBoat boat = getBoat(id);
		boat.setWassertankGroesse(wassertankGroesse);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getAbwassertankGroesse(String id) {
		return getBoat(id).getAbwassertankGroesse();
	}

	@Override
	public void setAbwassertankGroesse(String id, double abwassertankGroesse) {
		IBoat boat = getBoat(id);
		boat.setAbwassertankGroesse(abwassertankGroesse);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getGrosssegelGroesse(String id) {
		return getBoat(id).getGrosssegelGroesse();
	}

	@Override
	public void setGrosssegelGroesse(String id, double grosssegelGroesse) {
		IBoat boat = getBoat(id);
		boat.setGrosssegelGroesse(grosssegelGroesse);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getGenuaGroesse(String id) {
		return getBoat(id).getGenuaGroesse();
	}

	@Override
	public void setGenuaGroesse(String id, double genuaGroesse) {
		IBoat boat = getBoat(id);
		boat.setGenuaGroesse(genuaGroesse);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public double getSpiGroesse(String id) {
		return getBoat(id).getSpiGroesse();
	}

	@Override
	public void setSpiGroesse(String id, double spiGroesse) {
		IBoat boat = getBoat(id);
		boat.setSpiGroesse(spiGroesse);
		db.store(boat);
		notifyObservers();
	}

	@Override
	public String getString(String id) {
		return "Bootsname = " + getBootsname(id) + ", ID = " + id
				+ ", RegisterNr = " + getRegisterNr(id) + ", Segelzeichen = "
				+ getSegelzeichen(id) + ", Heimathafen = " + getHeimathafen(id)
				+ ", Yachtclub = " + getYachtclub(id) + ", Eigner = "
				+ getEigner(id) + ", Versicherung = " + getVersicherung(id)
				+ ", Rufzeichen = " + getRufzeichen(id) + ", Typ = "
				+ getTyp(id) + ", Konstrukteur = " + getKonstrukteur(id)
				+ ", Laenge = " + getLaenge(id) + ", Breite = " + getBreite(id)
				+ ", Tiefgang = " + getTiefgang(id) + ", Masthoehe = "
				+ getMasthoehe(id) + ", Verdraengung = " + getVerdraengung(id)
				+ ", RiggArt = " + getRiggArt(id) + ", Baujahr = "
				+ getBaujahr(id) + ", Motor = " + getMotor(id)
				+ ", TankGroesse = " + getTankGroesse(id)
				+ ", WassertankGroesse = " + getWassertankGroesse(id)
				+ ", AbwassertankGroesse = " + getAbwassertankGroesse(id)
				+ ", GrosssegelGroesse = " + getGrosssegelGroesse(id)
				+ ", GenuaGroesse = " + getGenuaGroesse(id) + ", SpiGroesse = "
				+ getSpiGroesse(id);
	}

	@Override
	public Map<String, String> getPersons() {
		return personContoller.getPersonList();
	}

	@Override
	public String getPersonnameById(String id) {
		return personContoller.getPersonLastname(id) + ", "
				+ personContoller.getPersonFirstname(id);
	}

	@Override
	public String newBoat() {
		IBoat newBoat = boat.getInstance();
		String id = getNewId();
		newBoat.setId(id);
		db.store(newBoat);
		return id;
	}

	public void closeDB() {
		db.close();
	}

	private String getNewId() {
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

	private static class IdContainer {
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
