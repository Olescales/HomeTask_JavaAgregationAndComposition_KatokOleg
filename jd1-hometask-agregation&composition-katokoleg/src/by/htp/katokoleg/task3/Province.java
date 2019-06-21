package by.htp.katokoleg.task3;

import java.util.List;

public class Province {

	private City provinceCentre;
	private List<Borough> listBorough;
	private double provinceSquare;
	
	public Province(City provinceCentre, List<Borough> listBorough) {
		this.provinceCentre = provinceCentre;
		this.listBorough = listBorough;
		for (Borough square : listBorough) {
		this.provinceSquare += square.getBoroughSquare();
		}
	}

	public City getProvinceCentre() {
		return provinceCentre;
	}

	public void setProvinceCentre(City provinceCentre) {
		this.provinceCentre = provinceCentre;
	}

	public List<Borough> getListBorough() {
		return listBorough;
	}

	public void setListBorough(List<Borough> listBorough) {
		this.listBorough = listBorough;
	}

	public double getProvinceSquare() {
		return provinceSquare;
	}

	public void setProvinceSquare(double provinceSquare) {
		this.provinceSquare = provinceSquare;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listBorough == null) ? 0 : listBorough.hashCode());
		result = prime * result + ((provinceCentre == null) ? 0 : provinceCentre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(provinceSquare);
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
		Province other = (Province) obj;
		if (listBorough == null) {
			if (other.listBorough != null)
				return false;
		} else if (!listBorough.equals(other.listBorough))
			return false;
		if (provinceCentre == null) {
			if (other.provinceCentre != null)
				return false;
		} else if (!provinceCentre.equals(other.provinceCentre))
			return false;
		if (Double.doubleToLongBits(provinceSquare) != Double.doubleToLongBits(other.provinceSquare))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [provinceCentre=" + provinceCentre + ", listBorough=" + listBorough + ", provinceSquare="
				+ provinceSquare + "]";
	}
}
