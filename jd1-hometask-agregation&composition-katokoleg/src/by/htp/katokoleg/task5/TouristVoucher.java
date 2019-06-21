package by.htp.katokoleg.task5;

public class TouristVoucher implements Comparable<TouristVoucher>{

	private TypeOfRest typeOfRest;
	private Transport transport;
	private Board board;
	private String tourProgramm;
	private int restDuration;
	private int cost;
	private String departureDay;
	
	public TouristVoucher() {
		
	}

	public TouristVoucher(TypeOfRest typeOfRest, Transport transport, Board board, String tourProgramm,
			 String departureDay, int restDuration, int cost) {
		this.typeOfRest = typeOfRest;
		this.transport = transport;
		this.board = board;
		this.tourProgramm = tourProgramm;
		this.departureDay = departureDay;
		this.restDuration = restDuration;
		this.cost = cost;
	}

	public TypeOfRest getTypeOfRest() {
		return typeOfRest;
	}

	public void setTypeOfRest(TypeOfRest typeOfRest) {
		this.typeOfRest = typeOfRest;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getTourProgramm() {
		return tourProgramm;
	}

	public void setTourProgramm(String tourProgramm) {
		this.tourProgramm = tourProgramm;
	}

	public int getRestDuration() {
		return restDuration;
	}

	public void setRestDuration(int restDuration) {
		this.restDuration = restDuration;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDepartureDay() {
		return departureDay;
	}

	public void setDepartureDay(String departureDay) {
		this.departureDay = departureDay;
	}
	
	/*@Override
	public int compareTo(TouristVoucher o) {
		
		TouristVoucher entry = (TouristVoucher) o;
	        int result = transport.compareTo(entry.transport);
	        if(result != 0)
	            return result;

	        result = cost - entry.cost;
	        if(result != 0)
	            return (int) result / Math.abs( result );

	        return 0;
	}*/

	@Override
	public int compareTo(TouristVoucher o) {
		
	return transport.compareTo(o.getTransport());
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureDay == null) ? 0 : departureDay.hashCode());
		result = prime * result + ((board == null) ? 0 : board.hashCode());
		result = prime * result + cost;
		result = prime * result + restDuration;
		result = prime * result + ((tourProgramm == null) ? 0 : tourProgramm.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((typeOfRest == null) ? 0 : typeOfRest.hashCode());
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
		TouristVoucher other = (TouristVoucher) obj;
		if (departureDay == null) {
			if (other.departureDay != null)
				return false;
		} else if (!departureDay.equals(other.departureDay))
			return false;
		if (board != other.board)
			return false;
		if (cost != other.cost)
			return false;
		if (restDuration != other.restDuration)
			return false;
		if (tourProgramm == null) {
			if (other.tourProgramm != null)
				return false;
		} else if (!tourProgramm.equals(other.tourProgramm))
			return false;
		if (transport != other.transport)
			return false;
		if (typeOfRest != other.typeOfRest)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [typeOfRest=" + typeOfRest + ", transport=" + transport + ", board=" + board
				+ ", tourProgramm=" + tourProgramm + ", restDuration=" + restDuration + ", cost=" + cost
				+ ", departureDay=\t\t" + departureDay + "]\n";
	}

	
}
