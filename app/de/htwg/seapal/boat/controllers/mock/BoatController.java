package de.htwg.seapal.boat.controllers.mock;


import java.util.HashMap;
import java.util.Map;

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
	public String getBootsname(String id) {
		return boat.getBootsname();
	}

	@Override
	public void setBootsname(String id, String  bootsname) {
		boat.setBootsname(bootsname);
		notifyObservers();

	}

	@Override
	public String getRegisterNr(String id) {
		return boat.getRegisterNr();
	}

	@Override
	public void setRegisterNr(String id, String  registerNr) {
		boat.setRegisterNr(registerNr);
		notifyObservers();

	}

	@Override
	public String getSegelzeichen(String id) {
		return boat.getSegelzeichen();
	}

	@Override
	public void setSegelzeichen(String id, String  segelzeichen) {
		boat.setSegelzeichen(segelzeichen);
		notifyObservers();

	}

	@Override
	public String getHeimathafen(String id) {
		return boat.getHeimathafen();
	}

	@Override
	public void setHeimathafen(String id, String  heimathafen) {
		boat.setHeimathafen(heimathafen);
		notifyObservers();

	}

	@Override
	public String getYachtclub(String id) {
		return boat.getYachtclub();
	}

	@Override
	public void setYachtclub(String id, String  yachtclub) {
		boat.setYachtclub(yachtclub);
		notifyObservers();

	}

	@Override
	public String getEigner(String id) {
		return boat.getEigner();
	}

	@Override
	public void setEigner(String id, String  eigner) {
		boat.setEigner(eigner);
		notifyObservers();

	}

	@Override
	public String getVersicherung(String id) {
		return boat.getVersicherung();
	}

	@Override
	public void setVersicherung(String id, String  versicherung) {
		boat.setVersicherung(versicherung);
		notifyObservers();
	}

	@Override
	public String getRufzeichen(String id) {
		return boat.getRufzeichen();
	}

	@Override
	public void setRufzeichen(String id, String  rufzeichen) {
		boat.setRufzeichen(rufzeichen);
		notifyObservers();
	}

	@Override
	public String getTyp(String id) {
		return boat.getTyp();
	}

	@Override
	public void setTyp(String id, String  typ) {
		boat.setTyp(typ);
		notifyObservers();
	}

	@Override
	public String getKonstrukteur(String id) {
		return boat.getKonstrukteur();
	}

	@Override
	public void setKonstrukteur(String id, String  konstrukteur) {
		boat.setKonstrukteur(konstrukteur);
		notifyObservers();
	}

	@Override
	public double getLaenge(String id) {
		return boat.getLaenge();
	}

	@Override
	public void setLaenge(String id, double  laenge) {
		boat.setLaenge(laenge);
		notifyObservers();
	}

	@Override
	public double getBreite(String id) {
		return boat.getBreite();
	}

	@Override
	public void setBreite(String id, double  breite) {
		boat.setBreite(breite);
		notifyObservers();
	}

	@Override
	public double getTiefgang(String id) {
		return boat.getTiefgang();
	}

	@Override
	public void setTiefgang(String id, double  tiefgang) {
		boat.setTiefgang(tiefgang);
		notifyObservers();
	}

	@Override
	public double getMasthoehe(String id) {
		return boat.getMasthoehe();
	}

	@Override
	public void setMasthoehe(String id, double  masthoehe) {
		boat.setMasthoehe(masthoehe);
		notifyObservers();
	}

	@Override
	public double getVerdraengung(String id) {
		return boat.getVerdraengung();
	}

	@Override
	public void setVerdraengung(String id, double  verdraengung) {
		boat.setVerdraengung(verdraengung);
		notifyObservers();
	}

	@Override
	public String getRiggArt(String id) {
		return boat.getRiggArt();
	}

	@Override
	public void setRiggArt(String id, String  riggArt) {
		boat.setRiggArt(riggArt);
		notifyObservers();
	}

	@Override
	public int getBaujahr(String id) {
		return boat.getBaujahr();
	}

	@Override
	public void setBaujahr(String id, int baujahr) {
		boat.setBaujahr(baujahr);
		notifyObservers();
	}

	@Override
	public String getMotor(String id) {
		return boat.getMotor();
	}

	@Override
	public void setMotor(String id, String  motor) {
		boat.setMotor(motor);
		notifyObservers();
	}

	@Override
	public double getTankGroesse(String id) {
		return boat.getTankGroesse();
	}

	@Override
	public void setTankGroesse(String id, double  tankGroesse) {
		boat.setTankGroesse(tankGroesse);
		notifyObservers();
	}

	@Override
	public double getWassertankGroesse(String id) {
		return boat.getWassertankGroesse();
	}

	@Override
	public void setWassertankGroesse(String id, double  wassertankGroesse) {
		boat.setWassertankGroesse(wassertankGroesse);
		notifyObservers();
	}

	@Override
	public double getAbwassertankGroesse(String id) {
		return boat.getAbwassertankGroesse();
	}

	@Override
	public void setAbwassertankGroesse(String id, double  abwassertankGroesse) {
		boat.setAbwassertankGroesse(abwassertankGroesse);
		notifyObservers();
	}

	@Override
	public double getGrosssegelGroesse(String id) {
		return boat.getGrosssegelGroesse();
	}

	@Override
	public void setGrosssegelGroesse(String id, double  grosssegelGroesse) {
		boat.setGrosssegelGroesse(grosssegelGroesse);
		notifyObservers();
	}

	@Override
	public double getGenuaGroesse(String id) {
		return boat.getGenuaGroesse();
	}

	@Override
	public void setGenuaGroesse(String id, double  genuaGroesse) {
		boat.setGenuaGroesse(genuaGroesse);
		notifyObservers();
	}

	@Override
	public double getSpiGroesse(String id) {
		return boat.getSpiGroesse();
	}

	@Override
	public void setSpiGroesse(String id, double  spiGroesse) {
		boat.setSpiGroesse(spiGroesse);
		notifyObservers();
	}

	@Override
	public String getString(String id) {
		return "Bootsname = " + getBootsname(id) + ", ID = " + id +  ", RegisterNr = "
				+ getRegisterNr(id) + ", Segelzeichen = " + getSegelzeichen(id)
				+ ", Heimathafen = " + getHeimathafen(id) + ", Yachtclub = "
				+ getYachtclub(id) + ", Eigner = " + getEigner(id)
				+ ", Versicherung = " + getVersicherung(id)
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
				+ ", GenuaGroesse = " + getGenuaGroesse(id)
				+ ", SpiGroesse = " + getSpiGroesse(id);
	}

	@Override
	public Map<String, String> getPersons() {
		return personContoller.getPersonList();
	}

	@Override
	public String getPersonnameById(String id) {
		return personContoller.getPersonLastname(id) + ", " + personContoller.getPersonFirstname(id);
	}
	
	@Override
	public Map<String, String> getBoats() {
		Map<String, String> list = new HashMap<String, String>();
		list.put(boat.getId(), boat.getBootsname());
		return list;
	}

	@Override
	public String getBootsnameById(String id) {
		return boat.getBootsname();
	}

	@Override
	public String newBoat() {
		return null;
	}

	@Override
	public void closeDB() {
	}

	@Override
	public void deleteBoat(String id) {
	}

	
}
