package de.htwg.seapal.boat.controllers;

import java.util.Map;

import de.htwg.seapal.boat.util.observer.IObservable;

public interface IBoatController extends IObservable {
	
	public String getId();
	public void setId(String id);
	public String getBootsname();
	public void setBootsname(String bootsname);
	public String getRegisterNr();
	public void setRegisterNr(String registerNr);
	public String getSegelzeichen();
	public void setSegelzeichen(String segelzeichen);
	public String getHeimathafen();
	public void setHeimathafen(String heimathafen);
	public String getYachtclub();
	public void setYachtclub(String yachtclub);
	public String getEigner();
	public void setEigner(String eigner);
	public String getVersicherung();
	public void setVersicherung(String versicherung);
	public String getRufzeichen();
	public void setRufzeichen(String rufzeichen);
	public String getTyp();
	public void setTyp(String typ);
	public String getKonstrukteur();
	public void setKonstrukteur(String konstrukteur);
	public double getLaenge();
	public void setLaenge(double laenge);
	public double getBreite();
	public void setBreite(double breite);
	public double getTiefgang();
	public void setTiefgang(double tiefgang);
	public double getMasthoehe();
	public void setMasthoehe(double masthoehe);
	public double getVerdraengung();
	public void setVerdraengung(double verdraengung);
	public String getRiggArt();
	public void setRiggArt(String riggArt);
	public int getBaujahr();
	public void setBaujahr(int baujahr);
	public String getMotor();
	public void setMotor(String motor);
	public double getTankGroesse();
	public void setTankGroesse(double tankGroesse);
	public double getWassertankGroesse();
	public void setWassertankGroesse(double wassertankGroesse);
	public double getAbwassertankGroesse();
	public void setAbwassertankGroesse(double abwassertankGroesse);
	public double getGrosssegelGroesse();
	public void setGrosssegelGroesse(double grosssegelGroesse);
	public double getGenuaGroesse();
	public void setGenuaGroesse(double genuaGroesse);
	public double getSpiGroesse();
	public void setSpiGroesse(double spiGroesse);
	public String getString();
	
	public Map<String, String> getBoats();
	public String getBootsnameById(String id);
	
	public Map<String, String> getPersons();
	public String getPersonnameById(String id);
}
