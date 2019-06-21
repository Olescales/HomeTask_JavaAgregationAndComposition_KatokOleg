package by.htp.katokoleg.task4;

import java.util.Comparator;

public class AccountBalanceComparator implements Comparator<Account> {

	public int compare(Account account1, Account account2) {
		if (account1.getBalance() > account2.getBalance()) {
			return 1;
		} else if (account1.getBalance() < account2.getBalance()) {
			return -1;
		} else {
			return 0;
		}
	}

}
