package de.htwg.seapal.boat.util.observer;

import java.rmi.Remote;

import javassist.tools.rmi.RemoteException;


public interface IObserverRMI extends Remote {
	void update(Event e) throws RemoteException;

}
