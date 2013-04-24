package de.htwg.seapal.boat.controllers.mock;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.util.observer.Observable;
import de.htwg.seapal.person.controllers.IPersonController;

public class BoatController extends Observable implements IBoatController {

	protected IBoat boat;
	protected IPersonController personContoller;

	@Inject
	public BoatController(IBoat boat, IPersonController personController) {
		this.personContoller = personController;
		this.boat = boat;
	}

	@Override
	public String getName(UUID id) {
		return boat.getName();
	}

	@Override
	public void setName(UUID id, String Name) {
		boat.setName(Name);
		notifyObservers();

	}

	@Override
	public String getRegisterNr(UUID id) {
		return boat.getRegisterNr();
	}

	@Override
	public void setRegisterNr(UUID id, String registerNr) {
		boat.setRegisterNr(registerNr);
		notifyObservers();

	}

	@Override
	public String getSegelzeichen(UUID id) {
		return boat.getSegelzeichen();
	}

	@Override
	public void setSegelzeichen(UUID id, String segelzeichen) {
		boat.setSegelzeichen(segelzeichen);
		notifyObservers();

	}

	@Override
	public String getHeimathafen(UUID id) {
		return boat.getHeimathafen();
	}

	@Override
	public void setHeimathafen(UUID id, String heimathafen) {
		boat.setHeimathafen(heimathafen);
		notifyObservers();

	}

	@Override
	public String getYachtclub(UUID id) {
		return boat.getYachtclub();
	}

	@Override
	public void setYachtclub(UUID id, String yachtclub) {
		boat.setYachtclub(yachtclub);
		notifyObservers();

	}

	@Override
	public String getEigner(UUID id) {
		return boat.getEigner();
	}

	@Override
	public void setEigner(UUID id, String eigner) {
		boat.setEigner(eigner);
		notifyObservers();

	}

	@Override
	public String getVersicherung(UUID id) {
		return boat.getVersicherung();
	}

	@Override
	public void setVersicherung(UUID id, String versicherung) {
		boat.setVersicherung(versicherung);
		notifyObservers();
	}

	@Override
	public String getRufzeichen(UUID id) {
		return boat.getRufzeichen();
	}

	@Override
	public void setRufzeichen(UUID id, String rufzeichen) {
		boat.setRufzeichen(rufzeichen);
		notifyObservers();
	}

	@Override
	public String getTyp(UUID id) {
		return boat.getTyp();
	}

	@Override
	public void setTyp(UUID id, String typ) {
		boat.setTyp(typ);
		notifyObservers();
	}

	@Override
	public String getKonstrukteur(UUID id) {
		return boat.getKonstrukteur();
	}

	@Override
	public void setKonstrukteur(UUID id, String konstrukteur) {
		boat.setKonstrukteur(konstrukteur);
		notifyObservers();
	}

	@Override
	public double getLaenge(UUID id) {
		return boat.getLaenge();
	}

	@Override
	public void setLaenge(UUID id, double laenge) {
		boat.setLaenge(laenge);
		notifyObservers();
	}

	@Override
	public double getBreite(UUID id) {
		return boat.getBreite();
	}

	@Override
	public void setBreite(UUID id, double breite) {
		boat.setBreite(breite);
		notifyObservers();
	}

	@Override
	public double getTiefgang(UUID id) {
		return boat.getTiefgang();
	}

	@Override
	public void setTiefgang(UUID id, double tiefgang) {
		boat.setTiefgang(tiefgang);
		notifyObservers();
	}

	@Override
	public double getMasthoehe(UUID id) {
		return boat.getMasthoehe();
	}

	@Override
	public void setMasthoehe(UUID id, double masthoehe) {
		boat.setMasthoehe(masthoehe);
		notifyObservers();
	}

	@Override
	public double getVerdraengung(UUID id) {
		return boat.getVerdraengung();
	}

	@Override
	public void setVerdraengung(UUID id, double verdraengung) {
		boat.setVerdraengung(verdraengung);
		notifyObservers();
	}

	@Override
	public String getRiggArt(UUID id) {
		return boat.getRiggArt();
	}

	@Override
	public void setRiggArt(UUID id, String riggArt) {
		boat.setRiggArt(riggArt);
		notifyObservers();
	}

	@Override
	public int getBaujahr(UUID id) {
		return boat.getBaujahr();
	}

	@Override
	public void setBaujahr(UUID id, int baujahr) {
		boat.setBaujahr(baujahr);
		notifyObservers();
	}

	@Override
	public String getMotor(UUID id) {
		return boat.getMotor();
	}

	@Override
	public void setMotor(UUID id, String motor) {
		boat.setMotor(motor);
		notifyObservers();
	}

	@Override
	public double getTankGroesse(UUID id) {
		return boat.getTankGroesse();
	}

	@Override
	public void setTankGroesse(UUID id, double tankGroesse) {
		boat.setTankGroesse(tankGroesse);
		notifyObservers();
	}

	@Override
	public double getWassertankGroesse(UUID id) {
		return boat.getWassertankGroesse();
	}

	@Override
	public void setWassertankGroesse(UUID id, double wassertankGroesse) {
		boat.setWassertankGroesse(wassertankGroesse);
		notifyObservers();
	}

	@Override
	public double getAbwassertankGroesse(UUID id) {
		return boat.getAbwassertankGroesse();
	}

	@Override
	public void setAbwassertankGroesse(UUID id, double abwassertankGroesse) {
		boat.setAbwassertankGroesse(abwassertankGroesse);
		notifyObservers();
	}

	@Override
	public double getGrosssegelGroesse(UUID id) {
		return boat.getGrosssegelGroesse();
	}

	@Override
	public void setGrosssegelGroesse(UUID id, double grosssegelGroesse) {
		boat.setGrosssegelGroesse(grosssegelGroesse);
		notifyObservers();
	}

	@Override
	public double getGenuaGroesse(UUID id) {
		return boat.getGenuaGroesse();
	}

	@Override
	public void setGenuaGroesse(UUID id, double genuaGroesse) {
		boat.setGenuaGroesse(genuaGroesse);
		notifyObservers();
	}

	@Override
	public double getSpiGroesse(UUID id) {
		return boat.getSpiGroesse();
	}

	@Override
	public void setSpiGroesse(UUID id, double spiGroesse) {
		boat.setSpiGroesse(spiGroesse);
		notifyObservers();
	}

	@Override
	public String getString(UUID id) {
		return "Name = " + getName(id) + ", ID = " + id + ", RegisterNr = "
				+ getRegisterNr(id) + ", Segelzeichen = " + getSegelzeichen(id)
				+ ", Heimathafen = " + getHeimathafen(id) + ", Yachtclub = "
				+ getYachtclub(id) + ", Eigner = " + getEigner(id)
				+ ", Versicherung = " + getVersicherung(id) + ", Rufzeichen = "
				+ getRufzeichen(id) + ", Typ = " + getTyp(id)
				+ ", Konstrukteur = " + getKonstrukteur(id) + ", Laenge = "
				+ getLaenge(id) + ", Breite = " + getBreite(id)
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
	public Map<String, String> getBoats() {
		Map<String, String> list = new HashMap<String, String>();
		list.put(boat.getId().toString(), boat.getName());
		return list;
	}

	@Override
	public String getNameById(UUID id) {
		return boat.getName();
	}

	@Override
	public UUID newBoat() {
		return null;
	}

	@Override
	public void closeDB() {
	}

	@Override
	public void deleteBoat(UUID id) {
	}

}
