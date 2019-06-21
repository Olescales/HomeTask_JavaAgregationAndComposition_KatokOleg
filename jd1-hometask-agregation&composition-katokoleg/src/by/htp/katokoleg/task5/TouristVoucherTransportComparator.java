package by.htp.katokoleg.task5;

import java.util.Comparator;

public class TouristVoucherTransportComparator implements Comparator<TouristVoucher> {

	public int compare (TouristVoucher o1, TouristVoucher o2) {
		return o1.getTransport().toString().compareToIgnoreCase(o2.getTransport().toString());
	}
}
