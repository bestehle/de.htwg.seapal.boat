package de.htwg.seapal.boat.controllers;

import java.util.Map;
import java.util.UUID;

import de.htwg.seapal.boat.util.observer.IObservable;

public interface IBoatController extends IObservable {

	String getName(UUID id);

	void setName(UUID id, String Name);

	String getRegisterNr(UUID id);

	void setRegisterNr(UUID id, String registerNr);

	String getSegelzeichen(UUID id);

	void setSegelzeichen(UUID id, String segelzeichen);

	String getHeimathafen(UUID id);

	void setHeimathafen(UUID id, String heimathafen);

	String getYachtclub(UUID id);

	void setYachtclub(UUID id, String yachtclub);

	String getEigner(UUID id);

	void setEigner(UUID id, String eigner);

	String getVersicherung(UUID id);

	void setVersicherung(UUID id, String versicherung);

	String getRufzeichen(UUID id);

	void setRufzeichen(UUID id, String rufzeichen);

	String getTyp(UUID id);

	void setTyp(UUID id, String typ);

	String getKonstrukteur(UUID id);

	void setKonstrukteur(UUID id, String konstrukteur);

	double getLaenge(UUID id);

	void setLaenge(UUID id, double laenge);

	double getBreite(UUID id);

	void setBreite(UUID id, double breite);

	double getTiefgang(UUID id);

	void setTiefgang(UUID id, double tiefgang);

	double getMasthoehe(UUID id);

	void setMasthoehe(UUID id, double masthoehe);

	double getVerdraengung(UUID id);

	void setVerdraengung(UUID id, double verdraengung);

	String getRiggArt(UUID id);

	void setRiggArt(UUID id, String riggArt);

	int getBaujahr(UUID id);

	void setBaujahr(UUID id, int baujahr);

	String getMotor(UUID id);

	void setMotor(UUID id, String motor);

	double getTankGroesse(UUID id);

	void setTankGroesse(UUID id, double tankGroesse);

	double getWassertankGroesse(UUID id);

	void setWassertankGroesse(UUID id, double wassertankGroesse);

	double getAbwassertankGroesse(UUID id);

	void setAbwassertankGroesse(UUID id, double abwassertankGroesse);

	double getGrosssegelGroesse(UUID id);

	void setGrosssegelGroesse(UUID id, double grosssegelGroesse);

	double getGenuaGroesse(UUID id);

	void setGenuaGroesse(UUID id, double genuaGroesse);

	double getSpiGroesse(UUID id);

	void setSpiGroesse(UUID id, double spiGroesse);

	String getString(UUID id);

	UUID newBoat();

	void deleteBoat(UUID id);

	void closeDB();

	Map<String, String> getBoats();

	String getNameById(UUID id);

	Map<String, String> getPersons();

	String getPersonnameById(String id);
}
