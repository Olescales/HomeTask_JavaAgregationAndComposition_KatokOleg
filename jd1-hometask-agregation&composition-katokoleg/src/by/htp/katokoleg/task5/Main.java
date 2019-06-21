package by.htp.katokoleg.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TouristVoucher tv   = new TouristVoucher(TypeOfRest.EXCURSION,	Transport.BUS, 			Board.BB, "Tallinn-Riga-Vilnius",					"30.09", 4, 1234);
		TouristVoucher tv1  = new TouristVoucher(TypeOfRest.EXCURSION,	Transport.BUS, 			Board.BB, "Vilnius",								"28.09", 2, 300);
		TouristVoucher tv2  = new TouristVoucher(TypeOfRest.CRUISE,		Transport.BUS, 			Board.BB, "Tallinn-Helsinki-Stockholm-Riga-Vilnius","03.10", 6, 1784);
		TouristVoucher tv3  = new TouristVoucher(TypeOfRest.EXCURSION,	Transport.BUS,			Board.BB, "Krakov-Velichka", 						"05.09", 4, 524);
		TouristVoucher tv4  = new TouristVoucher(TypeOfRest.SHOPPING,	Transport.BUS, 			Board.BB, "Vilnuis", 								"30.09", 4, 1234);
		TouristVoucher tv5  = new TouristVoucher(TypeOfRest.REST,		Transport.AVIA, 		Board.ALL, "Kemer", 								"10.07", 7, 2533);
		TouristVoucher tv6  = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.ALL, "Kemer", 								"08.07", 9, 2977);
		TouristVoucher tv7  = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.UAL, "Kemer", 								"15.07", 11, 5697);
		TouristVoucher tv8  = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.HB, "Neo Kalikratia", 						"15.08", 7, 4561);
		TouristVoucher tv9  = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.HB, "Pefkohori", 								"08.06", 8, 4789);
		TouristVoucher tv10 = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.FB, "Santoriny", 								"23.07", 10, 8974);
		TouristVoucher tv11 = new TouristVoucher(TypeOfRest.TREATMENT, 	Transport.BY_YOURSELF, 	Board.BB, "Karlovy Vary",							"18.09", 10, 3259);
		TouristVoucher tv12 = new TouristVoucher(TypeOfRest.TREATMENT, 	Transport.BY_YOURSELF, 	Board.HB, "Karlovy Vary", 							"25.09", 10, 3457);
		TouristVoucher tv13 = new TouristVoucher(TypeOfRest.TREATMENT, 	Transport.TRAIN, 		Board.FB, "Karlovy Vary", 							"20.09", 10, 2987);
		TouristVoucher tv14 = new TouristVoucher(TypeOfRest.EXCURSION, 	Transport.BUS, 			Board.BB, "Prague", 								"04.03", 4, 789);
		TouristVoucher tv15 = new TouristVoucher(TypeOfRest.EXCURSION, 	Transport.BUS, 			Board.BB, "Budapest",								"10.04", 4, 1245);
		TouristVoucher tv16 = new TouristVoucher(TypeOfRest.EXCURSION, 	Transport.TRAIN, 		Board.BB, "Dresden", 								"15.05", 4, 2457);
		TouristVoucher tv17 = new TouristVoucher(TypeOfRest.CRUISE, 	Transport.BUS, 			Board.BB, "Riga-Stockholm", 						"10.08", 7, 2547);
		TouristVoucher tv18 = new TouristVoucher(TypeOfRest.CRUISE, 	Transport.BUS, 			Board.BB, "Fiords", 								"18.07", 8, 3687);
		TouristVoucher tv19 = new TouristVoucher(TypeOfRest.SHOPPING,	Transport.TRAIN, 		Board.BB, "Milan", 									"10.08", 7, 1234);
		TouristVoucher tv20 = new TouristVoucher(TypeOfRest.SHOPPING, 	Transport.AVIA, 		Board.BB, "Milan", 									"15.08", 12, 1234);
		TouristVoucher tv21 = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.FB, "Korfy", 									"30.09", 10, 4985);
		TouristVoucher tv22 = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.HB, "Korfy", 									"30.09", 8, 5841);
		TouristVoucher tv23 = new TouristVoucher(TypeOfRest.REST, 		Transport.AVIA, 		Board.UAL, "Sharm-El-Sheikh", 						"20.11", 12, 2357);
	
		
		Comparator<TouristVoucher> tvbc = new TouristVoucherTransportComparator().thenComparing(new TouristVoucherBoardComparator()).thenComparing(new TouristVoucherDepartureDateComparator());
		List<TouristVoucher> vouchers = new ArrayList<TouristVoucher>();
		
		vouchers.add(tv);
		vouchers.add(tv1);
		vouchers.add(tv2);
		vouchers.add(tv3);
		vouchers.add(tv4);
		vouchers.add(tv5);
		vouchers.add(tv6);
		vouchers.add(tv7);
		vouchers.add(tv8);
		vouchers.add(tv9);
		vouchers.add(tv10);
		vouchers.add(tv11);
		vouchers.add(tv12);
		vouchers.add(tv13);
		vouchers.add(tv14);
		vouchers.add(tv15);
		vouchers.add(tv16);
		vouchers.add(tv17);
		vouchers.add(tv18);
		vouchers.add(tv19);
		vouchers.add(tv20);
		vouchers.add(tv21);
		vouchers.add(tv22);
		vouchers.add(tv23);
		
		Collections.sort(vouchers, tvbc);
		
		for (TouristVoucher tvt : vouchers) {
			System.out.print(tvt);
		}
		
		//String dayForSearch = "30 september";
		//TourCompanyLogic tcl = new TourCompanyLogic();
		
	}

}
