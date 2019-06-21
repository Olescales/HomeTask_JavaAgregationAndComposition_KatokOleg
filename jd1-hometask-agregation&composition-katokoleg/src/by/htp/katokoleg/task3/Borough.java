package by.htp.katokoleg.task3;

public class Borough {

	private City boroughCentre;
	private double boroughSquare;
	
	public Borough(City boroughCentre, double boroughSquare) {
		
		this.boroughCentre = boroughCentre;
		this.boroughSquare = boroughSquare;
	}

	public City getBoroughCentre() {
		return boroughCentre;
	}

	public void setBoroughCentre(City boroughCentre) {
		this.boroughCentre = boroughCentre;
	}

	public double getBoroughSquare() {
		return boroughSquare;
	}

	public void setBoroughSquare(double boroughSquare) {
		this.boroughSquare = boroughSquare;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boroughCentre == null) ? 0 : boroughCentre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(boroughSquare);
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
		Borough other = (Borough) obj;
		if (boroughCentre == null) {
			if (other.boroughCentre != null)
				return false;
		} else if (!boroughCentre.equals(other.boroughCentre))
			return false;
		if (Double.doubleToLongBits(boroughSquare) != Double.doubleToLongBits(other.boroughSquare))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [boroughCentre=" + boroughCentre + ", boroughSquare=" + boroughSquare + "]";
	}

	
}
