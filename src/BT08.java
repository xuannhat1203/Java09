class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println("Số tiền gửi không hợp lệ.");
            return this.balance;
        } else {
            this.balance += amount;
            return this.balance;
        }
    }

    public double withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Số dư hiện tại không đủ.");
            return this.balance;
        } else {
            this.balance -= amount;
            return this.balance;
        }
    }

    public boolean transfer(BankAccount toAccount, double amount) {
        if (this.balance >= amount) {
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Chuyển khoản thành công từ " + this.accountHolder + " sang " + toAccount.accountHolder);
            return true;
        } else {
            System.out.println("Số dư tài khoản không đủ để chuyển.");
            return false;
        }
    }

    public void display() {
        System.out.println("Tài khoản: " + this.accountHolder);
        System.out.println("Số tài khoản: " + this.accountNumber);
        System.out.println("Số dư hiện tại: " + this.balance);
    }
}

public class BT08 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("123", "Nguyễn Văn A", 500);
        BankAccount b = new BankAccount("456", "Trần Văn B", 500);
        a.transfer(b, 30.00);
        a.display();
        b.display();
    }
}
