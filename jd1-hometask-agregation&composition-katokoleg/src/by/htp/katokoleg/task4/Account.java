package by.htp.katokoleg.task4;

public class Account {

	private String owner;
	private double balance;
	private long accountNumber;
	private String currency;
	private boolean isBlocked;
	
	public Account() {
		
	}
	
	public Account(String owner, double balance, long accountNumber, String currency) {
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.currency = currency;
		this.isBlocked = false;
	}
	
	public Account(String owner, long accountNumber, boolean condition) {
		this.owner = owner;
		this.balance = 0;
		this.accountNumber = accountNumber;
		this.currency = "BYR";
		this.isBlocked = false;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + (isBlocked ? 1231 : 1237);
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [owner=" + owner + ", balance=" + balance + ", accountNumber=" + accountNumber + ", currency="
				+ currency + ", isBlocked=" + isBlocked + "]\n";
	}

	

	
	
	
}
