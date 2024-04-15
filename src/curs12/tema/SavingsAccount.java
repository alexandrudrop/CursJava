package curs12.tema;

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
        super(accountNumber, balance, accountOwner);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException, InvalidNumberException{
        if (amount > balance) {
            throw new InsufficientFundsException();
        }
        if (amount < 1) {
        	throw new InvalidNumberException();
        }
        balance -= amount;   
    }
}