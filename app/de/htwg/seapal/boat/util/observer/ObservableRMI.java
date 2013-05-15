package de.htwg.seapal.boat.util.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javassist.tools.rmi.RemoteException;

public class ObservableRMI implements IObservableRMI {

	private List<IObserverRMI> subscribers = new ArrayList<IObserverRMI>(2);

	public void addObserver(IObserverRMI s) throws RemoteException {
		subscribers.add(s);
	}

	public void removeObserver(IObserverRMI s) throws RemoteException {
		subscribers.remove(s);
	}

	public void removeAllObservers() throws RemoteException {
		subscribers.clear();
	}

	public void notifyObservers() throws RemoteException {
		notifyObservers(null);
	}

	@Override
	public void notifyObservers(Event e) throws RemoteException {
		for (Iterator<IObserverRMI> iter = subscribers.iterator(); iter
				.hasNext();) {
			IObserverRMI observer = iter.next();
			observer.update(e);
		}
	}
}
