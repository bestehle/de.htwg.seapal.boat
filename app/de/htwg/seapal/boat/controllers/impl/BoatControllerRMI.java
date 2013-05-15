package de.htwg.seapal.boat.controllers.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.google.inject.Inject;

import de.htwg.seapal.boat.controllers.IBoatControllerRMI;
import de.htwg.seapal.boat.database.IBoatDatabase;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.boat.util.observer.ObservableRMI;
import de.htwg.seapal.person.controllers.IPersonController;

public class BoatControllerRMI /*extends ObservableRMI*/ implements IBoatControllerRMI {

	protected IPersonController personContoller;
	protected IBoatDatabase db;

	@Inject
	public BoatControllerRMI(IBoatDatabase db,
			IPersonController personController) throws RemoteException {
		this.personContoller = personController;
		this.db = db;
	}

	@Override
	public Map<String, String> getBoats() throws RemoteException {
		List<IBoat> query = db.getBoats();
		Map<String, String> map = new HashMap<String, String>();
		for (IBoat boat : query) {
			map.put(boat.getId().toString(), boat.getBoatName());
		}
		return map;
	}

	@Override
	public String getBoatNameById(UUID id) throws RemoteException {
		return getBoatName(id);
	}

	@Override
	public String getBoatName(final UUID id) throws RemoteException {
		return db.getBoat(id).getBoatName();
	}

	@Override
	public void setBoatName(UUID id, String BoatName) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setBoatName(BoatName);
		db.saveBoat(boat);
		
	}

	@Override
	public String getRegisterNr(UUID id) throws RemoteException {
		return db.getBoat(id).getRegisterNr();
	}

	@Override
	public void setRegisterNr(UUID id, String registerNr)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setRegisterNr(registerNr);
		db.saveBoat(boat);
		
	}

	@Override
	public String getSailSign(UUID id) throws RemoteException {
		return db.getBoat(id).getSailSign();
	}

	@Override
	public void setSailSign(UUID id, String SailSign) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setSailSign(SailSign);
		db.saveBoat(boat);
		
	}

	@Override
	public String getHomePort(UUID id) throws RemoteException {
		return db.getBoat(id).getHomePort();
	}

	@Override
	public void setHomePort(UUID id, String HomePort) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setHomePort(HomePort);
		db.saveBoat(boat);
		
	}

	@Override
	public String getYachtclub(UUID id) throws RemoteException {
		return db.getBoat(id).getYachtclub();
	}

	@Override
	public void setYachtclub(UUID id, String yachtclub) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setYachtclub(yachtclub);
		db.saveBoat(boat);
		
	}

	@Override
	public String getOwner(UUID id) throws RemoteException {
		return db.getBoat(id).getOwner();
	}

	@Override
	public void setOwner(UUID id, String Owner) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setOwner(Owner);
		db.saveBoat(boat);
		
	}

	@Override
	public String getInsurance(UUID id) throws RemoteException {
		return db.getBoat(id).getInsurance();
	}

	@Override
	public void setInsurance(UUID id, String Insurance) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setInsurance(Insurance);
		db.saveBoat(boat);
		
	}

	@Override
	public String getCallSign(UUID id) throws RemoteException {
		return db.getBoat(id).getCallSign();
	}

	@Override
	public void setCallSign(UUID id, String CallSign) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setCallSign(CallSign);
		db.saveBoat(boat);
		
	}

	@Override
	public String getType(UUID id) throws RemoteException {
		return db.getBoat(id).getType();
	}

	@Override
	public void setType(UUID id, String Type) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setType(Type);
		db.saveBoat(boat);
		
	}

	@Override
	public String getConstructor(UUID id) throws RemoteException {
		return db.getBoat(id).getConstructor();
	}

	@Override
	public void setConstructor(UUID id, String Constructor)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setConstructor(Constructor);
		db.saveBoat(boat);
		
	}

	@Override
	public double getLength(UUID id) throws RemoteException {
		return db.getBoat(id).getLength();
	}

	@Override
	public void setLength(UUID id, double Length) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setLength(Length);
		db.saveBoat(boat);
		
	}

	@Override
	public double getWidth(UUID id) throws RemoteException {
		return db.getBoat(id).getWidth();
	}

	@Override
	public void setWidth(UUID id, double width) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setWidth(width);
		db.saveBoat(boat);
		
	}

	@Override
	public double getDraft(UUID id) throws RemoteException {
		return db.getBoat(id).getDraft();
	}

	@Override
	public void setDraft(UUID id, double draft) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setDraft(draft);
		db.saveBoat(boat);
		
	}

	@Override
	public double getMastHeight(UUID id) throws RemoteException {
		return db.getBoat(id).getMastHeight();
	}

	@Override
	public void setMastHeight(UUID id, double mastHeight)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setMastHeight(mastHeight);
		db.saveBoat(boat);
		
	}

	@Override
	public double getDisplacement(UUID id) throws RemoteException {
		return db.getBoat(id).getDisplacement();
	}

	@Override
	public void setDisplacement(UUID id, double displacement)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setDisplacement(displacement);
		db.saveBoat(boat);
		
	}

	@Override
	public String getRigging(UUID id) throws RemoteException {
		return db.getBoat(id).getRigging();
	}

	@Override
	public void setRigging(UUID id, String rigging) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setRigging(rigging);
		db.saveBoat(boat);
		
	}

	@Override
	public int getYearOfConstruction(UUID id) throws RemoteException {
		return db.getBoat(id).getYearOfConstruction();
	}

	@Override
	public void setYearOfConstruction(UUID id, int yearOfConstruction)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setYearOfConstruction(yearOfConstruction);
		db.saveBoat(boat);
		
	}

	@Override
	public String getMotor(UUID id) throws RemoteException {
		return db.getBoat(id).getMotor();
	}

	@Override
	public void setMotor(UUID id, String motor) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setMotor(motor);
		db.saveBoat(boat);
		
	}

	@Override
	public double getTankSize(UUID id) throws RemoteException {
		return db.getBoat(id).getTankSize();
	}

	@Override
	public void setTankSize(UUID id, double tankSize) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setTankSize(tankSize);
		db.saveBoat(boat);
		
	}

	@Override
	public double getWasteWaterTankSize(UUID id) throws RemoteException {
		return db.getBoat(id).getWasteWaterTankSize();
	}

	@Override
	public void setWasteWaterTankSize(UUID id, double wasteWaterTankSize)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setWasteWaterTankSize(wasteWaterTankSize);
		db.saveBoat(boat);
		
	}

	@Override
	public double getFreshWaterTankSize(UUID id) throws RemoteException {
		return db.getBoat(id).getFreshWaterTankSize();
	}

	@Override
	public void setFreshWaterTankSize(UUID id, double freshWaterTankSize)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setFreshWaterTankSize(freshWaterTankSize);
		db.saveBoat(boat);
		
	}

	@Override
	public double getMainSailSize(UUID id) throws RemoteException {
		return db.getBoat(id).getMainSailSize();
	}

	@Override
	public void setMainSailSize(UUID id, double mainSailSize)
			throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setMainSailSize(mainSailSize);
		db.saveBoat(boat);
		
	}

	@Override
	public double getGenuaSize(UUID id) throws RemoteException {
		return db.getBoat(id).getGenuaSize();
	}

	@Override
	public void setGenuaSize(UUID id, double genuaSize) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setGenuaSize(genuaSize);
		db.saveBoat(boat);
		
	}

	@Override
	public double getSpiSize(UUID id) throws RemoteException {
		return db.getBoat(id).getSpiSize();
	}

	@Override
	public void setSpiSize(UUID id, double spiSize) throws RemoteException {
		IBoat boat = db.getBoat(id);
		boat.setSpiSize(spiSize);
		db.saveBoat(boat);
		
	}

	@Override
	public String getString(UUID id) throws RemoteException {
		return "BoatName = " + getBoatName(id) + ", ID = " + id
				+ ", RegisterNr = " + getRegisterNr(id) + ", SailSign = "
				+ getSailSign(id) + ", HomePort = " + getHomePort(id)
				+ ", Yachtclub = " + getYachtclub(id) + ", Owner = "
				+ getOwner(id) + ", Insurance = " + getInsurance(id)
				+ ", CallSign = " + getCallSign(id) + ", Type = " + getType(id)
				+ ", Constructor = " + getConstructor(id) + ", Length = "
				+ getLength(id) + ", Width = " + getWidth(id) + ", Draft = "
				+ getDraft(id) + ", MastHeight = " + getMastHeight(id)
				+ ", Displacement = " + getDisplacement(id) + ", Rigging = "
				+ getRigging(id) + ", YearOfConstruction = "
				+ getYearOfConstruction(id) + ", Motor = " + getMotor(id)
				+ ", TankSize = " + getTankSize(id) + ", WasteWaterTankSize = "
				+ getWasteWaterTankSize(id) + ", FreshWaterTankSize = "
				+ getFreshWaterTankSize(id) + ", MainSailSize = "
				+ getMainSailSize(id) + ", GenuaSize = " + getGenuaSize(id)
				+ ", SpiSize = " + getSpiSize(id);
	}

	@Override
	public Map<String, String> getPersons() throws RemoteException {
		return personContoller.getPersonList();
	}

	@Override
	public String getPersonBoatNameById(String id) throws RemoteException {
		return personContoller.getPersonLastname(id) + ", "
				+ personContoller.getPersonFirstname(id);
	}

	@Override
	public UUID newBoat() throws RemoteException {
		return db.newBoat();
	}

	public void closeDB() throws RemoteException {
		db.closeDB();
	}

	@Override
	public void deleteBoat(UUID id) throws RemoteException {
		db.deleteBoat(id);
		
	}


}
