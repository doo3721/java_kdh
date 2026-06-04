package ch11.capsule.ex03;

public class AccountTest {
    void main() {
//        AccountBad  myAccount = new AccountBad();
        Account  myAccount = new Account();

        myAccount.deposit(10000);
//        myAccount.balance = -10000;
        myAccount.withdraw(5000);
        myAccount.withdraw(10000);

        myAccount.deposit(-10000);
        myAccount.deposit(0);
        myAccount.withdraw(-5000);
        myAccount.withdraw(0);
    }
}
