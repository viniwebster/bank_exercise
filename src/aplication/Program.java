package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit? (y/n)");
		char response = sc.next().charAt(0);

		while (response != 'y' && response != 'n') {
			System.out.print("Please insert y for yes or n for no!");
			response = sc.next().charAt(0);
		}

		double deposit;
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			account = new Account(accountNumber, holder, deposit);
		} else {
			account = new Account(accountNumber, holder);
		}

		account.accountData();

		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		account.accountData();

		System.out.print("Enter a withdraw value: ");
		account.sake(sc.nextDouble());
		account.accountData();

		sc.close();
	}

}
