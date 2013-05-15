package de.htwg.seapal.boat.util.observer;

import java.rmi.Remote;

import javassist.tools.rmi.RemoteException;

public interface IObservableRMI extends Remote {

	void addObserver(IObserverRMI s) throws RemoteException;

	void removeObserver(IObserverRMI s) throws RemoteException;

	void removeAllObservers() throws RemoteException;

	void notifyObservers() throws RemoteException;

	void notifyObservers(Event e) throws RemoteException;
}
