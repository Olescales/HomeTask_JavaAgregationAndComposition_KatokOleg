package by.htp.katokoleg.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TourCompanyLogic {

	public List<TouristVoucher> searchByDepartureDate (List<TouristVoucher> vouchers, String dayForSearch) {
		
		List<TouristVoucher> selectionList = new ArrayList<TouristVoucher>();
		
		Iterator<TouristVoucher> it = vouchers.iterator();
		while(it.hasNext()) {
			TouristVoucher vouch = it.next(); 
			if (vouch.getDepartureDay().equalsIgnoreCase(dayForSearch) ) {
				selectionList.add(vouch);
			}
		}
		return selectionList;
	}

	

	
	
}
