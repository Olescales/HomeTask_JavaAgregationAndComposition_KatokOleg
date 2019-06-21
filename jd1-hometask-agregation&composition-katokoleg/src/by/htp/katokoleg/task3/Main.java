package by.htp.katokoleg.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		City nesvizh = new City("Nesvizh");
		City kobrin = new City("Kobrin");
		City novopolotsk = new City("Novopolotsk");
		City zhodino = new City("Zhodino");
		City kostiukovichi = new City("Kostiukovichi");
		City brest = new City("Brest");
		City grodno = new City("Grodno");
		City gomel = new City("Gomel");
		City mogilev = new City("Mogilev");
		City vitebsk = new City("Vitebsk");
		City minsk = new City("Minsk");
		City lida = new City("Lida");
		
		Borough nesvizhBorough  = new Borough (nesvizh, 12.45);
		Borough kobrinBorough = new Borough (kobrin, 82.45);
		Borough novopolotskBorough  = new Borough (novopolotsk, 45.98);
		Borough zhodinoBorough  = new Borough (zhodino, 15.47);
		Borough kostiukovichiBorough  = new Borough ( kostiukovichi, 25.78);
		Borough brestBorough  = new Borough (brest, 25.78);
		Borough grodnoBorough  = new Borough (grodno, 25.78);
		Borough gomelBorough  = new Borough (gomel, 25.78);
		Borough mogilevBorough  = new Borough (mogilev, 25.78);
		Borough vitebskBorough  = new Borough (vitebsk, 25.78);
		Borough minskBorough  = new Borough (minsk, 25.78);
		Borough lidaBorough  = new Borough (lida, 17.58);
		
		List<Borough> minskAndEtc = new ArrayList<Borough>();
		minskAndEtc.add(nesvizhBorough);
		minskAndEtc.add(minskBorough);
		
		List<Borough> gomelAndEtc = new ArrayList<Borough>();
		gomelAndEtc.add(gomelBorough);
		gomelAndEtc.add(zhodinoBorough);
		
		List<Borough> grodnoAndEtc = new ArrayList<Borough>();
		grodnoAndEtc.add(grodnoBorough);
		grodnoAndEtc.add(lidaBorough);
		
		List<Borough> brestAndEtc = new ArrayList<Borough>();
		brestAndEtc.add(brestBorough);
		brestAndEtc.add(kobrinBorough);
		
		List<Borough> vitebskAndEtc = new ArrayList<Borough>();
		vitebskAndEtc.add(vitebskBorough);
		vitebskAndEtc.add(novopolotskBorough);
		
		List<Borough> mogilevAndEtc = new ArrayList<Borough>();
		mogilevAndEtc.add(mogilevBorough);
		mogilevAndEtc.add(kostiukovichiBorough);
		
		Province minskProvince = new Province (minsk, minskAndEtc);
		Province gomelProvince = new Province (gomel, gomelAndEtc);
		Province grodnoProvince = new Province (grodno, grodnoAndEtc);
		Province brestProvince = new Province (brest, brestAndEtc);
		Province vitebskProvince = new Province (vitebsk, vitebskAndEtc);
		Province mogilevProvince = new Province (mogilev, mogilevAndEtc);
		
		List<Province> provinceList = new ArrayList<Province>();
		provinceList.add(brestProvince);
		provinceList.add(vitebskProvince);
		provinceList.add(gomelProvince);
		provinceList.add(grodnoProvince);
		provinceList.add(mogilevProvince);
		provinceList.add(minskProvince);
		
		State state = new State(minsk, provinceList );
		StateLogic sl = new StateLogic();
		
		System.out.println(state.getCapital());
		System.out.println(sl.numberOfProvinces(provinceList));
		System.out.println(sl.stateSquareCalculation(provinceList));
		
		
		System.out.println("Province centers: ");
		for (Province pr : provinceList) {
			System.out.println(pr.getProvinceCentre());
		}
		
	}

}
