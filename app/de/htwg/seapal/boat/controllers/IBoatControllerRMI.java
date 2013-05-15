package de.htwg.seapal.boat.controllers;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;
import java.util.UUID;

import de.htwg.seapal.boat.util.observer.IObservableRMI;

public interface IBoatControllerRMI extends Remote {

	String getBoatName(UUID id) throws RemoteException;

	void setBoatName(UUID id, String BoatName) throws RemoteException;

	String getRegisterNr(UUID id) throws RemoteException;

	void setRegisterNr(UUID id, String registerNr) throws RemoteException;

	String getSailSign(UUID id) throws RemoteException;

	void setSailSign(UUID id, String SailSign) throws RemoteException;

	String getHomePort(UUID id) throws RemoteException;

	void setHomePort(UUID id, String HomePort) throws RemoteException;

	String getYachtclub(UUID id) throws RemoteException;

	void setYachtclub(UUID id, String yachtclub) throws RemoteException;

	String getOwner(UUID id) throws RemoteException;

	void setOwner(UUID id, String Owner) throws RemoteException;

	String getInsurance(UUID id) throws RemoteException;

	void setInsurance(UUID id, String Insurance) throws RemoteException;

	String getCallSign(UUID id) throws RemoteException;

	void setCallSign(UUID id, String CallSign) throws RemoteException;

	String getType(UUID id) throws RemoteException;

	void setType(UUID id, String Type) throws RemoteException;

	String getConstructor(UUID id) throws RemoteException;

	void setConstructor(UUID id, String Constructor) throws RemoteException;

	double getLength(UUID id) throws RemoteException;

	void setLength(UUID id, double Length) throws RemoteException;

	double getWidth(UUID id) throws RemoteException;

	void setWidth(UUID id, double width) throws RemoteException;

	double getDraft(UUID id) throws RemoteException;

	void setDraft(UUID id, double draft) throws RemoteException;

	double getMastHeight(UUID id) throws RemoteException;

	void setMastHeight(UUID id, double mastHeight) throws RemoteException;

	double getDisplacement(UUID id) throws RemoteException;

	void setDisplacement(UUID id, double displacement) throws RemoteException;

	String getRigging(UUID id) throws RemoteException;

	void setRigging(UUID id, String rigging) throws RemoteException;

	int getYearOfConstruction(UUID id) throws RemoteException;

	void setYearOfConstruction(UUID id, int yearOfConstruction) throws RemoteException;

	String getMotor(UUID id) throws RemoteException;

	void setMotor(UUID id, String motor) throws RemoteException;

	double getTankSize(UUID id) throws RemoteException;

	void setTankSize(UUID id, double tankSize) throws RemoteException;

	double getWasteWaterTankSize(UUID id) throws RemoteException;

	void setWasteWaterTankSize(UUID id, double wasteWaterTankSize) throws RemoteException;

	double getFreshWaterTankSize(UUID id) throws RemoteException;

	void setFreshWaterTankSize(UUID id, double freshWaterTankSize) throws RemoteException;

	double getMainSailSize(UUID id) throws RemoteException;

	void setMainSailSize(UUID id, double mainSailSize) throws RemoteException;

	double getGenuaSize(UUID id) throws RemoteException;

	void setGenuaSize(UUID id, double genuaSize) throws RemoteException;

	double getSpiSize(UUID id) throws RemoteException;

	void setSpiSize(UUID id, double spiSize) throws RemoteException;

	String getString(UUID id) throws RemoteException;

	UUID newBoat() throws RemoteException;

	void deleteBoat(UUID id) throws RemoteException;

	void closeDB() throws RemoteException;

	Map<String, String> getBoats() throws RemoteException;

	String getBoatNameById(UUID id) throws RemoteException;

	Map<String, String> getPersons() throws RemoteException;

	String getPersonBoatNameById(String id) throws RemoteException;

}
