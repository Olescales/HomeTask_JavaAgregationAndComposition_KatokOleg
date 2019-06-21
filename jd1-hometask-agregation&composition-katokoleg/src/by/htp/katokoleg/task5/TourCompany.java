package by.htp.katokoleg.task5;

import java.util.List;

public class TourCompany {

	private String title;
	private int license;
	private List<TouristVoucher> vouchers;
	
	public TourCompany() {
		
	}
	
	public TourCompany(String title, int license, List<TouristVoucher> vouchers) {
		this.title = title;
		this.license = license;
		this.vouchers = vouchers;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public List<TouristVoucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<TouristVoucher> vouchers) {
		this.vouchers = vouchers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + license;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
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
		TourCompany other = (TourCompany) obj;
		if (license != other.license)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (vouchers == null) {
			if (other.vouchers != null)
				return false;
		} else if (!vouchers.equals(other.vouchers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [title=" + title + ", license=" + license + ", vouchers=" + vouchers + "]";
	}
	
	
}
