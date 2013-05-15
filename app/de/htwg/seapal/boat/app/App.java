package de.htwg.seapal.boat.app;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.controllers.IBoatControllerRMI;
import de.htwg.seapal.boat.controllers.impl.BoatControllerRMI;
import de.htwg.seapal.boat.views.tui.BoatTUI;
import de.htwg.seapal.person.app.PersonDemoImplModule;

public class App {

	/**
	 * @param args
	 */
	public class Test {
		
	}
	
	public static void main(String[] args) {

		Application play = new DefaultApplication(new File("."),
				App.class.getClassLoader(), null, Mode.Dev());

		// Play.start(play);

		try {

			// Set up Google Guice Dependency Injector
			Injector injector = Guice.createInjector(new BoatImplModule(),
					new PersonDemoImplModule());

			// Build up the application, resolving dependencies automatically by
			// Guice
			IBoatController controller = injector
					.getInstance(IBoatController.class);

			IBoatControllerRMI rmiController = injector
					.getInstance(IBoatControllerRMI.class);

			Registry registry = LocateRegistry.getRegistry();
			IBoatControllerRMI stub = (IBoatControllerRMI) UnicastRemoteObject
					.exportObject(rmiController, 0);
			registry.rebind("BoatControllerRMI", stub);

			BoatTUI tui = new BoatTUI(controller);

			tui.printTUI();
			// continue to read user input on the tui until the user decides to
			// quit
			boolean continu = true;
			Scanner scanner = new Scanner(System.in);
			while (continu) {
				continu = tui.processInputLine(scanner.next());
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		} finally {
			Play.stop();
		}

	}
}
