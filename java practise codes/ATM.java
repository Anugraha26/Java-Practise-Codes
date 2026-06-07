class ATM {
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }
    public void viewBalance() {
        System.out.println("Balance = " + balance);
    }
    public static void main(String[] args) {
        ATM a = new ATM();

        a.deposit(1000);
        a.withdraw(2000);
        a.viewBalance();
    }
}