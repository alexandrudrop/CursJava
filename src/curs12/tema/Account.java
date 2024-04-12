package curs12.tema;

abstract class Account {
    private int accountNumber;
    public double balance;
    public Customer accountOwner;

    public Account(int accountNumber, double balance, Customer accountOwner) {
        this.setAccountNumber(accountNumber);
        this.balance = balance;
        this.accountOwner = accountOwner;
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}