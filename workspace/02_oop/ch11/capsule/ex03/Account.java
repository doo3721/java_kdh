package ch11.capsule.ex03;

public class Account {
    private int  balance;

    Account() {
        this(0);
    }

    Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + "원이 입금 되었습니다. 잔고는 " + this.balance + "원 입니다.");
        }
        else if (amount == 0) {
            System.out.println("입금 금액이 없습니다.");
        }
        else {
            System.out.println("입금 금액을 제대로 작성해 주세요.");
        }

    }

    public void withdraw(int amount) {
        if (amount > 0){
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println(amount + "원이 출금 되었습니다. 잔고는 " + this.balance + "원 입니다.");
            }
            else {
                System.out.println("잔고가 부족합니다. 잔고는 " + this.balance + "원 입니다.");
            }
        }
        else if (amount == 0) {
            System.out.println("출금 금액이 없습니다.");
        }
        else {
            System.out.println("출금 금액을 제대로 작성해 주세요.");
        }
    }
}
