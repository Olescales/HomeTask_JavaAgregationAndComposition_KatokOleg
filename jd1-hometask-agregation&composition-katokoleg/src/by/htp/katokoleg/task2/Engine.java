package by.htp.katokoleg.task2;

public class Engine {

	private double volume;
	private String typeOfFuel;
	private int numberOfCylinders;

	public Engine() {

	}

	public Engine(double volume) {
		this.volume = volume;
	}
	
	public Engine(double volume, String typeOfFuel, int numberOfCylinders) {
		this.volume = volume;
		this.typeOfFuel = typeOfFuel;
		this.numberOfCylinders = numberOfCylinders;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfCylinders;
		result = prime * result + ((typeOfFuel == null) ? 0 : typeOfFuel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (numberOfCylinders != other.numberOfCylinders)
			return false;
		if (typeOfFuel == null) {
			if (other.typeOfFuel != null)
				return false;
		} else if (!typeOfFuel.equals(other.typeOfFuel))
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + "[volume=" + volume + ", typeOfFuel=" + typeOfFuel + ", numberOfCylinders=" + numberOfCylinders
				+ "]";
	}
	
	
}
