package entities;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Account> account = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void addAccount(Account acc){
        account.add(acc);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name of the bank: " + name);
        for(Account acc : account){
            sb.append(acc + "\n");
        }
        return sb.toString();
    }
}
