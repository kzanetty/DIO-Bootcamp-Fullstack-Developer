package entities;

public abstract class Account {

    public static int SUM = 1;
    public static final int NUMBER_AGENCY = 207;

    private Integer number;
    private Integer agency;
    private Double balance;

    private Client client;

    public Account() {
    }

    public Account(Client client) {
        this.number = 1000 + SUM++;
        this.agency = NUMBER_AGENCY;
        this.client = client;
        this.balance = 0.0;
    }
    public Account(Double amount, Client client) {
        this.number = 1000 + SUM++;
        this.agency = NUMBER_AGENCY;
        deposit(amount);
        this.client = client;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getAgency() {
        return agency;
    }

    public Double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void deposit(double amount){
        this.balance +=amount;
    }

    public void withdraw(double amount){
        this.balance -=amount;
    }
    public void transfer(double amount, Account acc){
        withdraw(amount);
        acc.deposit(amount);
    }

    @Override
    public String toString(){
        return  client + "\n"
                + "Number account: " + number
                + " - Agency: " + agency + " - Balance: $" + balance;
    }
}
