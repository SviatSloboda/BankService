package neuefische;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("john", "smith", 1);
        Account account1 = new Account("1",new BigDecimal(32),client1);
        account1.withdraw(new BigDecimal("32"));
    }
}