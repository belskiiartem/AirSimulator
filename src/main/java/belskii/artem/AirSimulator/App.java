package belskii.artem.AirSimulator;

import DispatchingCenter.Borispol;
import belskii.artem.AirSimulator.AirApparat.Airplane;
import belskii.artem.AirSimulator.AirApparat.Helicopter;

public class App {
	public static void main(String[] args) {
		Borispol dispatcherCenter = new Borispol();
		Helicopter helicopter = new Helicopter();
		Airplane airplane = new Airplane();
		try {
			dispatcherCenter.runDispathingCenter();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		while (true) {
			dispatcherCenter.send(helicopter.getCurrentInfo());
			dispatcherCenter.send(airplane.getCurrentInfo());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}

	}
}
