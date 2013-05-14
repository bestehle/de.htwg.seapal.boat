package de.htwg.seapal.boat.models.mock;

import java.util.UUID;

import de.htwg.seapal.boat.models.IBoat;

public class Boat implements IBoat {

	@Override
	public UUID getUUId() {
		return UUID.fromString("MOCK");
	}

	@Override
	public String getBoatName() {
		return "Black Pearl";
	}

	@Override
	public void setBoatName(String boatName) {
	}

	@Override
	public String getRegisterNr() {
		return "ABC12345";
	}

	@Override
	public void setRegisterNr(String registerNr) {
	}

	@Override
	public String getSailSign() {
		return "KN1520";
	}

	@Override
	public void setSailSign(String sailSign) {
	}

	@Override
	public String getHomePort() {
		return "Konstanz";
	}

	@Override
	public void setHomePort(String homePort) {
	}

	@Override
	public String getYachtclub() {
		return "YachtiKonstanz";
	}

	@Override
	public void setYachtclub(String yachtclub) {
	}

	@Override
	public String getOwner() {
		return "Jack Sparrow";
	}

	@Override
	public void setOwner(String owner) {
	}

	@Override
	public String getInsurance() {
		return "HukPiraten";
	}

	@Override
	public void setInsurance(String insurance) {
	}

	@Override
	public String getCallSign() {
		return "Schwarze Segel";
	}

	@Override
	public void setCallSign(String callSign) {
	}

	@Override
	public String getType() {
		return "Segelboot";
	}

	@Override
	public void setType(String type) {
	}

	@Override
	public String getConstructor() {
		return "Davy Jones";
	}

	@Override
	public void setConstructor(String constructor) {
	}

	@Override
	public double getLength() {
		return 40;
	}

	@Override
	public void setLength(double length) {
	}

	@Override
	public double getWidth() {
		return 15;
	}

	@Override
	public void setWidth(double width) {
	}

	@Override
	public double getDraft() {
		return 3;
	}

	@Override
	public void setDraft(double draft) {
	}

	@Override
	public double getMastHeight() {
		return 25;
	}

	@Override
	public void setMastHeight(double mastHeight) {
	}

	@Override
	public double getDisplacement() {
		return 250;
	}

	@Override
	public void setDisplacement(double displacement) {
	}

	@Override
	public String getRigging() {
		return "rigging";
	}

	@Override
	public void setRigging(String rigging) {
	}

	@Override
	public int getYearOfConstruction() {
		return 1250;
	}

	@Override
	public void setYearOfConstruction(int yearOfConstruction) {
	}

	@Override
	public String getMotor() {
		return "Daimler";
	}

	@Override
	public void setMotor(String motor) {
	}

	@Override
	public double getTankSize() {
		return 220;
	}

	@Override
	public void setTankSize(double tankSize) {
	}

	@Override
	public double getWasteWaterTankSize() {
		return 400;
	}

	@Override
	public void setWasteWaterTankSize(double wasteWaterTankSize) {
	}

	@Override
	public double getFreshWaterTankSize() {
		return 60;
	}

	@Override
	public void setFreshWaterTankSize(double freshWaterTankSize) {
	}

	@Override
	public double getMainSailSize() {
		return 30;
	}

	@Override
	public void setMainSailSize(double mainSailSize) {
	}

	@Override
	public double getGenuaSize() {
		return 25;
	}

	@Override
	public void setGenuaSize(double genuaSize) {
	}

	@Override
	public double getSpiSize() {
		return 32.5;
	}

	@Override
	public void setSpiSize(double spiSize) {
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
