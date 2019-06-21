package by.htp.katokoleg.task2;

import java.util.List;

public class CarLogic {
	
	private WheelLogic wl;
	private EngineLogic el;
	
	public double replenish(Tank tank, double fuelToReplenish) {
		
		double resultFuelLevel = tank.getCurrentLevel() + fuelToReplenish;
		return resultFuelLevel; 
	}

	public void drive(WheelLogic wl,List<Wheel> wheels, EngineLogic el, String on) {
		if (wl.isFourWheels(wheels) & el.isEngineSwitchOn(on)) {
			System.out.println("drrrrrrrrrrrrrrrrrrr");
		} else {
			System.out.println("pr-pr");
		}
	}
	
	public void changeWheel(List<Wheel> wheels, Wheel wheelForChange, int indexOfWheelToChange) {
		wheels.set(indexOfWheelToChange, wheelForChange);
		System.out.println("Wheel changed successfully");
	}
}
