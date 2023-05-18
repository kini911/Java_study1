package com.yedam.inter2;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();			
		}else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi)vehicle;
			taxi.checkFare();
		}
		vehicle.run();
	}

}
