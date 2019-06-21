package by.htp.katokoleg.task1;

public class Word {

	private String symbols;
	
	public Word (String symbols) {
		this.symbols = symbols;
	}

	public String getSymbols() {
		return symbols;
	}

	public void setSymbols(String symbols) {
		this.symbols = symbols;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbols == null) ? 0 : symbols.hashCode());
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
		Word other = (Word) obj;
		if (symbols == null) {
			if (other.symbols != null)
				return false;
		} else if (!symbols.equals(other.symbols))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return symbols + " ";
	}
	
}
