package by.htp.katokoleg.task2;

public class Wheel {

	private double diameter;
	private String typeOfDrive;
	private String typeOfTyre;

	public Wheel() {
		
	}
	
	public Wheel(double diameter) {
		this.diameter = diameter;
	}

	public Wheel(double diameter, String typeOfDrive, String typeOfTyre) {
		this.diameter = diameter;
		this.typeOfDrive = typeOfDrive;
		this.typeOfTyre = typeOfTyre;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public String getTypeOfDrive() {
		return typeOfDrive;
	}

	public void setTypeOfDrive(String typeOfDrive) {
		this.typeOfDrive = typeOfDrive;
	}

	public String getTypeOfTyre() {
		return typeOfTyre;
	}

	public void setTypeOfTyre(String typeOfTyre) {
		this.typeOfTyre = typeOfTyre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((typeOfDrive == null) ? 0 : typeOfDrive.hashCode());
		result = prime * result + ((typeOfTyre == null) ? 0 : typeOfTyre.hashCode());
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
		Wheel other = (Wheel) obj;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		if (typeOfDrive == null) {
			if (other.typeOfDrive != null)
				return false;
		} else if (!typeOfDrive.equals(other.typeOfDrive))
			return false;
		if (typeOfTyre == null) {
			if (other.typeOfTyre != null)
				return false;
		} else if (!typeOfTyre.equals(other.typeOfTyre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [diameter=" + diameter + ", typeOfDrive=" + typeOfDrive + ", typeOfTyre="
				+ typeOfTyre + "]";
	}

}
