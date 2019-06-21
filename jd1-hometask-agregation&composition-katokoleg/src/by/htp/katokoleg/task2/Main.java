package by.htp.katokoleg.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Wheel wheel1 = new Wheel(16);
		Wheel wheel2 = new Wheel(16);
		Wheel wheel3 = new Wheel(16);
		Wheel wheel4 = new Wheel(16);
		
		Wheel wheelForChange = new Wheel(16);
		
		List<Wheel> wheels = new ArrayList<Wheel>();
		
		wheels.add(wheel1);
		wheels.add(wheel2);
		wheels.add(wheel3);
		wheels.add(wheel4);
		
		Engine engine1 = new Engine(1584);
		
		Tank tank1 = new Tank();
		
		Car car1 = new Car(wheels, engine1, tank1, "Lada");
		
		CarLogic cl = new CarLogic();
		WheelLogic wl = new WheelLogic();
		System.out.println(wl.isFourWheels(wheels));
		EngineLogic el = new EngineLogic();
		String on = "On";
		System.out.println(el.isEngineSwitchOn(on));
		
		
		cl.drive(wl, wheels, el, on);
		cl.changeWheel(wheels, wheelForChange, 3);
		double fuelLevelAfterFilling = cl.replenish(tank1, 15);
		System.out.println("After replenish you've got " + fuelLevelAfterFilling + " litres of fuel in tank.");
	}

}
