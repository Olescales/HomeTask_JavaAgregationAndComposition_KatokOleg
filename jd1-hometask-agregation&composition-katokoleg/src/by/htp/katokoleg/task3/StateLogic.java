package by.htp.katokoleg.task3;

import java.util.List;

public class StateLogic {

	public double stateSquareCalculation(List<Province> listProvince) {
		
		double sumSquare = 0;
		
		for (Province lp : listProvince) {
			sumSquare += lp.getProvinceSquare();
		}
		return sumSquare;
	}

	public int numberOfProvinces (List<Province> listProvince) {
		int numberOfProvines = listProvince.size();
		return numberOfProvines;
	}
}
