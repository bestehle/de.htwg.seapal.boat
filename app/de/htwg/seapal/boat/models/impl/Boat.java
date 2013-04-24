package de.htwg.seapal.boat.models.impl;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import de.htwg.seapal.boat.models.IBoat;

@Entity
public class Boat implements IBoat {

	public Boat() {
		this.id = UUID.randomUUID();
	}

	@Id
	private UUID id;

	private String Name;
	private String registerNr;
	private String segelzeichen;
	private String heimathafen;
	private String yachtclub;
	private String eigner;
	private String versicherung;
	private String rufzeichen;
	private String typ;
	private String konstrukteur;
	private double laenge;
	private double breite;
	private double tiefgang;
	private double masthoehe;
	private double verdraengung;
	private String riggArt;
	private int baujahr;
	private String motor;
	private double tankGroesse;
	private double wassertankGroesse;
	private double abwassertankGroesse;
	private double grosssegelGroesse;
	private double genuaGroesse;
	private double spiGroesse;

	@Override
	public UUID getId() {
		return id;
	}

	@Override
	public String getName() {
		return Name;
	}

	@Override
	public void setName(String Name) {
		this.Name = Name;
	}

	@Override
	public String getRegisterNr() {
		return registerNr;
	}

	@Override
	public void setRegisterNr(String registerNr) {
		this.registerNr = registerNr;
	}

	@Override
	public String getSegelzeichen() {
		return segelzeichen;
	}

	@Override
	public void setSegelzeichen(String segelzeichen) {
		this.segelzeichen = segelzeichen;
	}

	@Override
	public String getHeimathafen() {
		return heimathafen;
	}

	@Override
	public void setHeimathafen(String heimathafen) {
		this.heimathafen = heimathafen;
	}

	@Override
	public String getYachtclub() {
		return yachtclub;
	}

	@Override
	public void setYachtclub(String yachtclub) {
		this.yachtclub = yachtclub;
	}

	@Override
	public String getEigner() {
		return eigner;
	}

	@Override
	public void setEigner(String eigner) {
		this.eigner = eigner;
	}

	@Override
	public String getVersicherung() {
		return versicherung;
	}

	@Override
	public void setVersicherung(String versicherung) {
		this.versicherung = versicherung;
	}

	@Override
	public String getRufzeichen() {
		return rufzeichen;
	}

	@Override
	public void setRufzeichen(String rufzeichen) {
		this.rufzeichen = rufzeichen;
	}

	@Override
	public String getTyp() {
		return typ;
	}

	@Override
	public void setTyp(String typ) {
		this.typ = typ;
	}

	@Override
	public String getKonstrukteur() {
		return konstrukteur;
	}

	@Override
	public void setKonstrukteur(String konstrukteur) {
		this.konstrukteur = konstrukteur;
	}

	@Override
	public double getLaenge() {
		return laenge;
	}

	@Override
	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	@Override
	public double getBreite() {
		return breite;
	}

	@Override
	public void setBreite(double breite) {
		this.breite = breite;
	}

	@Override
	public double getTiefgang() {
		return tiefgang;
	}

	@Override
	public void setTiefgang(double tiefgang) {
		this.tiefgang = tiefgang;
	}

	@Override
	public double getMasthoehe() {
		return masthoehe;
	}

	@Override
	public void setMasthoehe(double masthoehe) {
		this.masthoehe = masthoehe;
	}

	@Override
	public double getVerdraengung() {
		return verdraengung;
	}

	@Override
	public void setVerdraengung(double verdraengung) {
		this.verdraengung = verdraengung;
	}

	@Override
	public String getRiggArt() {
		return riggArt;
	}

	@Override
	public void setRiggArt(String riggArt) {
		this.riggArt = riggArt;
	}

	@Override
	public int getBaujahr() {
		return baujahr;
	}

	@Override
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	@Override
	public String getMotor() {
		return motor;
	}

	@Override
	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Override
	public double getTankGroesse() {
		return tankGroesse;
	}

	@Override
	public void setTankGroesse(double tankGroesse) {
		this.tankGroesse = tankGroesse;
	}

	@Override
	public double getWassertankGroesse() {
		return wassertankGroesse;
	}

	@Override
	public void setWassertankGroesse(double wassertankGroesse) {
		this.wassertankGroesse = wassertankGroesse;
	}

	@Override
	public double getAbwassertankGroesse() {
		return abwassertankGroesse;
	}

	@Override
	public void setAbwassertankGroesse(double abwassertankGroesse) {
		this.abwassertankGroesse = abwassertankGroesse;
	}

	@Override
	public double getGrosssegelGroesse() {
		return grosssegelGroesse;
	}

	@Override
	public void setGrosssegelGroesse(double grosssegelGroesse) {
		this.grosssegelGroesse = grosssegelGroesse;
	}

	@Override
	public double getGenuaGroesse() {
		return genuaGroesse;
	}

	@Override
	public void setGenuaGroesse(double genuaGroesse) {
		this.genuaGroesse = genuaGroesse;
	}

	@Override
	public double getSpiGroesse() {
		return spiGroesse;
	}

	@Override
	public void setSpiGroesse(double spiGroesse) {
		this.spiGroesse = spiGroesse;
	}

}
