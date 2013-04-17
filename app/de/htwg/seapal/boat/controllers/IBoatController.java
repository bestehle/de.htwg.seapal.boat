package de.htwg.seapal.boat.controllers;

import java.util.Map;

import de.htwg.seapal.boat.util.observer.IObservable;

public interface IBoatController extends IObservable {
	
	String getBootsname(String id);
	void setBootsname(String id, String  bootsname);
	String getRegisterNr(String id);
	void setRegisterNr(String id, String  registerNr);
	String getSegelzeichen(String id);
	void setSegelzeichen(String id, String  segelzeichen);
	String getHeimathafen(String id);
	void setHeimathafen(String id, String  heimathafen);
	String getYachtclub(String id);
	void setYachtclub(String id, String  yachtclub);
	String getEigner(String id);
	void setEigner(String id, String  eigner);
	String getVersicherung(String id);
	void setVersicherung(String id, String  versicherung);
	String getRufzeichen(String id);
	void setRufzeichen(String id, String  rufzeichen);
	String getTyp(String id);
	void setTyp(String id, String  typ);
	String getKonstrukteur(String id);
	void setKonstrukteur(String id, String  konstrukteur);
	double getLaenge(String id);
	void setLaenge(String id, double  laenge);
	double getBreite(String id);
	void setBreite(String id, double  breite);
	double getTiefgang(String id);
	void setTiefgang(String id, double  tiefgang);
	double getMasthoehe(String id);
	void setMasthoehe(String id, double  masthoehe);
	double getVerdraengung(String id);
	void setVerdraengung(String id, double  verdraengung);
	String getRiggArt(String id);
	void setRiggArt(String id, String  riggArt);
	int getBaujahr(String id);
	void setBaujahr(String id, int baujahr);
	String getMotor(String id);
	void setMotor(String id, String  motor);
	double getTankGroesse(String id);
	void setTankGroesse(String id, double  tankGroesse);
	double getWassertankGroesse(String id);
	void setWassertankGroesse(String id, double  wassertankGroesse);
	double getAbwassertankGroesse(String id);
	void setAbwassertankGroesse(String id, double  abwassertankGroesse);
	double getGrosssegelGroesse(String id);
	void setGrosssegelGroesse(String id, double  grosssegelGroesse);
	double getGenuaGroesse(String id);
	void setGenuaGroesse(String id, double  genuaGroesse);
	double getSpiGroesse(String id);
	void setSpiGroesse(String id, double  spiGroesse);
	String getString(String id);
	
	String newBoat();
	void closeDB();
	
	Map<String, String> getBoats();
	String getBootsnameById(String id);
	
	Map<String, String> getPersons();
	String getPersonnameById(String id);
}
