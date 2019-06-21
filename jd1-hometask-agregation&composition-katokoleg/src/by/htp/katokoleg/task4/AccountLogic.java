package by.htp.katokoleg.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountLogic implements Comparator<Account> {

	public void blockAccount(Account account) {
		if (account.getBalance() <= -1000) {
			account.setBlocked(true);
		}
	}

	public void blockAccount(Account account, String command) {
		if (command.equalsIgnoreCase("Block")) {
			account.setBlocked(true);
		}
	}

	public double calculatingAllAccountsSum(List<Account> accounts, Customer client) {

		double clientAccountsSum = 0;
		for (Account acc : accounts) {
			if (acc.getOwner().equalsIgnoreCase(client.getName())) {
				clientAccountsSum += acc.getBalance();
			}
		}
		return clientAccountsSum;
	}

	public double calculatingPosBalanceAccountsSum(List<Account> accounts, Customer client) {

		double clientPosAccountsSum = 0;
		for (Account acc : accounts) {
			if (acc.getOwner().equalsIgnoreCase(client.getName()) & acc.getBalance() >= 0) {
				clientPosAccountsSum += acc.getBalance();
			}
		}
		return clientPosAccountsSum;
	}

	public double calculatingNegBalanceAccountsSum(List<Account> accounts, Customer client) {

		double clientNegAccountsSum = 0;
		for (Account acc : accounts) {
			if (acc.getOwner().equalsIgnoreCase(client.getName()) & acc.getBalance() < 0) {
				clientNegAccountsSum += acc.getBalance();
			}
		}
		return clientNegAccountsSum;
	}

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Account> searchAccountsDefCurrency(String currency, List<Account> accounts) {

		List<Account> oneCurrencyList = new ArrayList<Account>();

		for (Account acc : accounts) {
			if (acc.getCurrency().equalsIgnoreCase(currency)) {
				oneCurrencyList.add(acc);
			}
		}
		return oneCurrencyList;
	}

	public List<Account> sortAccountsByCurrency(List<Account> accounts) {

		List<Account> sortedListByCurrency = new ArrayList<Account>();

		sortedListByCurrency = accounts;
		Collections.sort(sortedListByCurrency, new AccountCurrencyComparator());

		return sortedListByCurrency;
	}

	public List<Account> sortAccountsByBalance(List<Account> accounts) {

		List<Account> sortedListByBalance = new ArrayList<Account>();

		sortedListByBalance = accounts;
		Collections.sort(sortedListByBalance, new AccountBalanceComparator());

		return sortedListByBalance;
	}

	public List<Account> sortAccountsByOwner(List<Account> accounts) {

		List<Account> sortedListByOwner = new ArrayList<Account>();

		sortedListByOwner = accounts;
		Collections.sort(sortedListByOwner, new AccountOwnerComparator());

		return sortedListByOwner;
	}

}
