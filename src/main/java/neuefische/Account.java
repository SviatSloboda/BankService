package neuefische;

import java.math.BigDecimal;

public class Account {
    String accountNumber;
    BigDecimal accountBalance;
    Client client;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Account(String accountNumber, BigDecimal accountBalance, Client client) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.client = client;
    }

    public void depositMoney(BigDecimal depositAmount){
        this.accountBalance = this.accountBalance.add(depositAmount);
    }

    public void withdraw(BigDecimal withdrawAmount){
        if(accountBalance.subtract(withdrawAmount).compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException();
        this.accountBalance = this.accountBalance.subtract(withdrawAmount);
    }
}
