package entities;

public class SavingsAccount extends Account{

    public SavingsAccount() {
    }

    public SavingsAccount(Client client) {
        super(client);
    }

    public SavingsAccount(Double amount, Client client) {
        super(amount, client);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 500){
            System.out.println("Withdraw greater than the limit.");
        } else{
            super.withdraw(amount + 5);
        }
    }

    @Override
    public void transfer(double amount, Account acc) {
        if(amount > 500){
            System.out.println("Transfer greater than the limit of transfer.");
        } else{
            super.transfer((amount+5), acc);
        }
    }

    @Override
    public String toString(){
        return "\n \n === Savings Account === \n"
                + super.toString();
    }
}
