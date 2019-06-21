package by.htp.katokoleg.task2;

public class Tank {

	private double capasity;
	private double currentLevel;

	public Tank() {
		this.capasity = 50d;
		this.currentLevel = 10d;
	}

	public Tank(double capasity, double currentLevel) {
		this.capasity = capasity;
		this.currentLevel = currentLevel;
	}

	public double getCapasity() {
		return capasity;
	}

	public void setCapasity(double capasity) {
		this.capasity = capasity;
	}

	public double getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(double currentLevel) {
		if (currentLevel < capasity) {
			this.currentLevel = currentLevel;
		} else {
			this.currentLevel = this.capasity;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capasity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(currentLevel);
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
		Tank other = (Tank) obj;
		if (Double.doubleToLongBits(capasity) != Double.doubleToLongBits(other.capasity))
			return false;
		if (Double.doubleToLongBits(currentLevel) != Double.doubleToLongBits(other.currentLevel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tank [capasity=" + capasity + ", currentLevel=" + currentLevel + "]";
	}

	
}
