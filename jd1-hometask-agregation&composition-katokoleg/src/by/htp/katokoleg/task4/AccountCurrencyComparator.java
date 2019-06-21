package by.htp.katokoleg.task4;

import java.util.Comparator;

public class AccountCurrencyComparator implements Comparator<Account> {
	public int compare (Account account1, Account account2 ) {
		String acc1 = account1.getCurrency();
		String acc2 = account2.getCurrency();
		
		return acc1.compareToIgnoreCase(acc2);
	}
}
