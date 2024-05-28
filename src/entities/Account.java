package entities;

public class Account {
	private int account;
	private String holder;
	private double balance;
	
	public Account(int account, String holder) {
		this.account = account;
		this.holder = holder;
	}

	public Account(int account, String holder, double deposit) {
		this.account = account;
		this.holder = holder;
		deposit(deposit);;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getAccount() {
		return account;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void sake(double sake) {
		balance -= sake + 5.00;
	}

	public void accountData() {
		System.out.println("Account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", getAccount(), getHolder(), getBalance());
	}	
}
