package by.htp.katokoleg.task2;

import java.util.List;

public class WheelLogic {
	
	public boolean isFourWheels (List<Wheel> wheels) {
		if (wheels.size() == 4) {
			return true;
		}
		return false;
	}
}
