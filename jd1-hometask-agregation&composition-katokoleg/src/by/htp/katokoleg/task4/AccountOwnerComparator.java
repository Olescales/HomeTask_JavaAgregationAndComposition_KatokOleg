package by.htp.katokoleg.task4;

import java.util.Comparator;

public class AccountOwnerComparator implements Comparator<Account> {
	
	public int compare(Account account1, Account account2) {
		String acc1 = account1.getOwner();
		String acc2 = account2.getOwner();

		return acc1.compareToIgnoreCase(acc2);
	}
}
