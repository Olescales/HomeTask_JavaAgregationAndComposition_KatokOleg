package by.htp.katokoleg.task3;

import java.util.List;

public class State {

	private City capital;
	private List<Province> listProvince;
	
	public State(City capital, List<Province> listProvince) {
		this.capital = capital;
		this.listProvince = listProvince;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public List<Province> getListProvince() {
		return listProvince;
	}

	public void setListProvince(List<Province> listProvince) {
		this.listProvince = listProvince;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((listProvince == null) ? 0 : listProvince.hashCode());
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (listProvince == null) {
			if (other.listProvince != null)
				return false;
		} else if (!listProvince.equals(other.listProvince))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [capital=" + capital + ", listProvince=" + listProvince + "]";
	}
}
