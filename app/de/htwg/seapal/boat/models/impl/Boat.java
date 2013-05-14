package de.htwg.seapal.boat.models.impl;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.ektorp.support.CouchDbDocument;

import de.htwg.seapal.boat.models.IBoat;

@Entity
public class Boat extends CouchDbDocument implements IBoat {

	public Boat() {
		this.id = UUID.randomUUID().toString();
	}

	@Id
	private String id;

	private String boatName;
	private String registerNr;
	private String sailSign;
	private String homePort;
	private String yachtclub;
	private String owner;
	private String insurance;
	private String callSign;
	private String type;
	private String constructor;
	private double length;
	private double width;
	private double draft;
	private double mastHeight;
	private double displacement;
	private String rigging;
	private int yearOfConstruction;
	private String motor;
	private double tankSize;
	private double wasteWaterTankSize;
	private double freshWaterTankSize;
	private double mainSailSize;
	private double genuaSize;
	private double spiSize;

	@JsonIgnore
	@Override
	public UUID getUUId() {
		return UUID.fromString(id);
	}

	@JsonProperty("_id")
	public String getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(UUID id) {
		this.id = id.toString();
	}

	@Override
	public String getBoatName() {
		return boatName;
	}

	@Override
	public void setBoatName(String boatName) {
		this.boatName = boatName;
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
	public String getSailSign() {
		return sailSign;
	}

	@Override
	public void setSailSign(String sailSign) {
		this.sailSign = sailSign;
	}

	@Override
	public String getHomePort() {
		return homePort;
	}

	@Override
	public void setHomePort(String homePort) {
		this.homePort = homePort;
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
	public String getOwner() {
		return owner;
	}

	@Override
	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String getInsurance() {
		return insurance;
	}

	@Override
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Override
	public String getCallSign() {
		return callSign;
	}

	@Override
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getConstructor() {
		return constructor;
	}

	@Override
	public void setConstructor(String constructor) {
		this.constructor = constructor;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getDraft() {
		return draft;
	}

	@Override
	public void setDraft(double draft) {
		this.draft = draft;
	}

	@Override
	public double getMastHeight() {
		return mastHeight;
	}

	@Override
	public void setMastHeight(double mastHeight) {
		this.mastHeight = mastHeight;
	}

	@Override
	public double getDisplacement() {
		return displacement;
	}

	@Override
	public void setDisplacement(double displacement) {
		this.displacement = displacement;
	}

	@Override
	public String getRigging() {
		return rigging;
	}

	@Override
	public void setRigging(String rigging) {
		this.rigging = rigging;
	}

	@Override
	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	@Override
	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
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
	public double getTankSize() {
		return tankSize;
	}

	@Override
	public void setTankSize(double tankSize) {
		this.tankSize = tankSize;
	}

	@Override
	public double getWasteWaterTankSize() {
		return wasteWaterTankSize;
	}

	@Override
	public void setWasteWaterTankSize(double wasteWaterTankSize) {
		this.wasteWaterTankSize = wasteWaterTankSize;
	}

	@Override
	public double getFreshWaterTankSize() {
		return freshWaterTankSize;
	}

	@Override
	public void setFreshWaterTankSize(double freshWaterTankSize) {
		this.freshWaterTankSize = freshWaterTankSize;
	}

	@Override
	public double getMainSailSize() {
		return mainSailSize;
	}

	@Override
	public void setMainSailSize(double mainSailSize) {
		this.mainSailSize = mainSailSize;
	}

	@Override
	public double getGenuaSize() {
		return genuaSize;
	}

	@Override
	public void setGenuaSize(double genuaSize) {
		this.genuaSize = genuaSize;
	}

	@Override
	public double getSpiSize() {
		return spiSize;
	}

	@Override
	public void setSpiSize(double spiSize) {
		this.spiSize = spiSize;
	}

}
