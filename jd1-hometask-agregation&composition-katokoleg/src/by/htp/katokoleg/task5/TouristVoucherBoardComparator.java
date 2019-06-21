package by.htp.katokoleg.task5;

import java.util.Comparator;

public class TouristVoucherBoardComparator implements Comparator<TouristVoucher> {

	public int compare (TouristVoucher o1, TouristVoucher o2) {
		return o1.getBoard().toString().compareTo(o2.getBoard().toString());
	}
}
