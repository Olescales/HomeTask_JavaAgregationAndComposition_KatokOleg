package by.htp.katokoleg.task5;

import java.util.Comparator;

public class TouristVoucherDepartureDateComparator implements Comparator<TouristVoucher> {

	public int compare(TouristVoucher o1, TouristVoucher o2) {
		return o1.getDepartureDay().toString().compareToIgnoreCase(o2.getDepartureDay().toString());
	}
}
