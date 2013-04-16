package de.htwg.seapal.boat.controllers;

import java.util.Map;

import de.htwg.seapal.boat.util.observer.IObservable;

public interface IBoatController extends IObservable {
	
	public String getBootsname(String id);
	public void setBootsname(String id, String  bootsname);
	public String getRegisterNr(String id);
	public void setRegisterNr(String id, String  registerNr);
	public String getSegelzeichen(String id);
	public void setSegelzeichen(String id, String  segelzeichen);
	public String getHeimathafen(String id);
	public void setHeimathafen(String id, String  heimathafen);
	public String getYachtclub(String id);
	public void setYachtclub(String id, String  yachtclub);
	public String getEigner(String id);
	public void setEigner(String id, String  eigner);
	public String getVersicherung(String id);
	public void setVersicherung(String id, String  versicherung);
	public String getRufzeichen(String id);
	public void setRufzeichen(String id, String  rufzeichen);
	public String getTyp(String id);
	public void setTyp(String id, String  typ);
	public String getKonstrukteur(String id);
	public void setKonstrukteur(String id, String  konstrukteur);
	public double getLaenge(String id);
	public void setLaenge(String id, double  laenge);
	public double getBreite(String id);
	public void setBreite(String id, double  breite);
	public double getTiefgang(String id);
	public void setTiefgang(String id, double  tiefgang);
	public double getMasthoehe(String id);
	public void setMasthoehe(String id, double  masthoehe);
	public double getVerdraengung(String id);
	public void setVerdraengung(String id, double  verdraengung);
	public String getRiggArt(String id);
	public void setRiggArt(String id, String  riggArt);
	public int getBaujahr(String id);
	public void setBaujahr(String id, int baujahr);
	public String getMotor(String id);
	public void setMotor(String id, String  motor);
	public double getTankGroesse(String id);
	public void setTankGroesse(String id, double  tankGroesse);
	public double getWassertankGroesse(String id);
	public void setWassertankGroesse(String id, double  wassertankGroesse);
	public double getAbwassertankGroesse(String id);
	public void setAbwassertankGroesse(String id, double  abwassertankGroesse);
	public double getGrosssegelGroesse(String id);
	public void setGrosssegelGroesse(String id, double  grosssegelGroesse);
	public double getGenuaGroesse(String id);
	public void setGenuaGroesse(String id, double  genuaGroesse);
	public double getSpiGroesse(String id);
	public void setSpiGroesse(String id, double  spiGroesse);
	public String getString(String id);
	
	public String newBoat();
	
	public Map<String, String> getBoats();
	public String getBootsnameById(String id);
	
	public Map<String, String> getPersons();
	public String getPersonnameById(String id);
}
