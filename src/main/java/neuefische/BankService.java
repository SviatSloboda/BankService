package neuefische;

import java.math.BigDecimal;
import java.util.List;


public class BankService {
    private List<Account> accounts;

    public String openAnAccount(Client client){
        String accountNumber = (accounts.size() + 1) + "";
        Account account = new Account(accountNumber, new BigDecimal("0"),client);
        accounts.add(account);
        return accountNumber;
    }

    public void transferMoney(String accountThatSendsMoney, String accountThatReceivesMoney, String amount){
        Account sendingAccount = accounts.stream().filter(a -> a.getAccountNumber().equals(accountThatSendsMoney)).toList().getFirst();
        Account receivingAccount = accounts.stream().filter(a -> a.getAccountNumber().equals(accountThatReceivesMoney)).toList().getFirst();
        sendingAccount.withdraw(new BigDecimal(amount));
        receivingAccount.depositMoney(new BigDecimal(amount));
    }
}
