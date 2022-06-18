package entities;

public class CheckingAccount extends Account{

    public CheckingAccount() {
    }

    public CheckingAccount(Client client) {
        super(client);
    }

    public CheckingAccount(Double amount, Client client) {
        super(amount, client);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+10);
    }

    @Override
    public void transfer(double amount, Account acc) {
        super.transfer(amount+10, acc);
    }

    @Override
    public String toString(){
        return "\n \n === Checking Account === \n"
                + super.toString();
    }
}
