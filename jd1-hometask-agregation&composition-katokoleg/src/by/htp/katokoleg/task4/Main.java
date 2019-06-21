package by.htp.katokoleg.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Customer client1 = new Customer("Leonid Firs", 30, "male");
		Customer client2 = new Customer("Ivan denisov", 25, "male");
		Customer client3 = new Customer("Olga Nosikova", 37, "female");

		ArrayList<Customer> clients = new ArrayList<Customer>();
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);

		Account account1 = new Account("Leonid Firs", 104276780, 1111222233334444l, "BYR");
		Account account2 = new Account("Leonid Firs", 1100, 1222222434534444l, "USD");
		Account account3 = new Account("Leonid Firs", 12300, 1111496398465444l, "EUR");
		Account account4 = new Account("Leonid Firs", 11100, 2385689679456564l, "RUB");
		Account account5 = new Account("Ivan denisov", -1124, 3464769672651325l, "BYR");
		Account account6 = new Account("Ivan denisov", 14578, 1324598675645444l, "USD");
		Account account7 = new Account("Ivan denisov", 125789, 5279456934565644l, "BYR");
		Account account8 = new Account("Olga Nosikova", -12345, 1345447975646444l, "EUR");
		Account account9 = new Account("Olga Nosikova", 12488, 1345435878068904l, "BYR");
		Account account10 = new Account("Olga Nosikova", 195844, 2312432456567568l, "BYR");

		List<Account> accounts = new ArrayList<Account>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		accounts.add(account5);
		accounts.add(account6);
		accounts.add(account7);
		accounts.add(account8);
		accounts.add(account9);
		accounts.add(account10);

		List<Account> sortedAccounts = new ArrayList<Account>();
		AccountLogic al = new AccountLogic();
///////////////////////////////////////////////////////////////////////////////////
		//System.out.println("Whose account you want to find? Enter Name and Surname: ");
		
		double d = al.calculatingAllAccountsSum(accounts, client3);
		
		System.out.println(d);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println(
				"What currency accounts are you interesting in? Choose: 1 - RUB, 2 - USD, 3 - BYR, 4 - EUR");
		Scanner sc = new Scanner(System.in);
		String currency = sc.next();
		sc.close();

		switch (currency) {
		case "1":
			sortedAccounts = al.searchAccountsDefCurrency("RUB", accounts);
			System.out.println(sortedAccounts = al.sortAccountsByBalance(sortedAccounts));
			break;
		case "2":
			sortedAccounts = al.searchAccountsDefCurrency("USD", accounts);
			System.out.println(sortedAccounts = al.sortAccountsByBalance(sortedAccounts));
			break;
		case "3":
			sortedAccounts = al.searchAccountsDefCurrency("BYR", accounts);
			System.out.println(sortedAccounts = al.sortAccountsByOwner(sortedAccounts));
			break;
		case "4":
			sortedAccounts = al.searchAccountsDefCurrency("EUR", accounts);
			System.out.println(sortedAccounts = al.sortAccountsByBalance(sortedAccounts));
			break;
		}
		System.out.println("=======================================================================");
		
		System.out.println(al.sortAccountsByCurrency(accounts));
		
		
		
	}
}
