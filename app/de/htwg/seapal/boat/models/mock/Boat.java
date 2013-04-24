package de.htwg.seapal.boat.models.mock;

import java.util.UUID;

import de.htwg.seapal.boat.models.IBoat;

public class Boat implements IBoat {

	@Override
	public UUID getId() {
		return UUID.fromString("MOCK");
	}

	@Override
	public String getName() {
		return "Black Pearl";
	}

	@Override
	public void setName(String Name) {
	}

	@Override
	public String getRegisterNr() {
		return "ABC12345";
	}

	@Override
	public void setRegisterNr(String registerNr) {
	}

	@Override
	public String getSegelzeichen() {
		return "KN1520";
	}

	@Override
	public void setSegelzeichen(String segelzeichen) {
	}

	@Override
	public String getHeimathafen() {
		return "Konstanz";
	}

	@Override
	public void setHeimathafen(String heimathafen) {
	}

	@Override
	public String getYachtclub() {
		return "YachtiKonstanz";
	}

	@Override
	public void setYachtclub(String yachtclub) {
	}

	@Override
	public String getEigner() {
		return "Jack Sparrow";
	}

	@Override
	public void setEigner(String eigner) {
	}

	@Override
	public String getVersicherung() {
		return "HukPiraten";
	}

	@Override
	public void setVersicherung(String versicherung) {
	}

	@Override
	public String getRufzeichen() {
		return "Schwarze Segel";
	}

	@Override
	public void setRufzeichen(String rufzeichen) {
	}

	@Override
	public String getTyp() {
		return "Segelboot";
	}

	@Override
	public void setTyp(String typ) {
	}

	@Override
	public String getKonstrukteur() {
		return "Davy Jones";
	}

	@Override
	public void setKonstrukteur(String konstrukteur) {
	}

	@Override
	public double getLaenge() {
		return 40;
	}

	@Override
	public void setLaenge(double laenge) {
	}

	@Override
	public double getBreite() {
		return 15;
	}

	@Override
	public void setBreite(double breite) {
	}

	@Override
	public double getTiefgang() {
		return 3;
	}

	@Override
	public void setTiefgang(double tiefgang) {
	}

	@Override
	public double getMasthoehe() {
		return 25;
	}

	@Override
	public void setMasthoehe(double masthoehe) {
	}

	@Override
	public double getVerdraengung() {
		return 250;
	}

	@Override
	public void setVerdraengung(double verdraengung) {
	}

	@Override
	public String getRiggArt() {
		return "riggArt";
	}

	@Override
	public void setRiggArt(String riggArt) {
	}

	@Override
	public int getBaujahr() {
		return 1250;
	}

	@Override
	public void setBaujahr(int baujahr) {
	}

	@Override
	public String getMotor() {
		return "Daimler";
	}

	@Override
	public void setMotor(String motor) {
	}

	@Override
	public double getTankGroesse() {
		return 220;
	}

	@Override
	public void setTankGroesse(double tankGroesse) {
	}

	@Override
	public double getWassertankGroesse() {
		return 400;
	}

	@Override
	public void setWassertankGroesse(double wassertankGroesse) {
	}

	@Override
	public double getAbwassertankGroesse() {
		return 60;
	}

	@Override
	public void setAbwassertankGroesse(double abwassertankGroesse) {
	}

	@Override
	public double getGrosssegelGroesse() {
		return 30;
	}

	@Override
	public void setGrosssegelGroesse(double grosssegelGroesse) {
	}

	@Override
	public double getGenuaGroesse() {
		return 25;
	}

	@Override
	public void setGenuaGroesse(double genuaGroesse) {
	}

	@Override
	public double getSpiGroesse() {
		return 32.5;
	}

	@Override
	public void setSpiGroesse(double spiGroesse) {
	}

}
