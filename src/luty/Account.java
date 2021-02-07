package luty;

public class Account {
    private String name;
    private int balance = 0;
    private boolean debit = false;
    private int maxDebit = -1000;

    public void transfer(Account fromAccount, int amount) {
        if (fromAccount.withdraw(amount)){
            this.deposit(amount);
        };
    }

    public void deposit(int amount) {
        if (amount < 1) {
            System.out.println("Podana kwota musi być większa od 0, jest: " + amount);
            return;
        }

        balance += amount;
        if (balance >= 0) {
            debit = false;
        }
        showSummary(amount, true);
    }

    public boolean withdraw(int amount) {
        if (amount < 1) {
            System.out.println("Podana kwota musi być większa od 0, jest: " + amount);
            return false;
        }

        if ((balance - amount) < maxDebit) {
            System.out.println("Kwota debetu nie może przekroczyć 1000 zł");
            return false;
        }

        balance -= amount;
        if (balance < 0) {
            debit = true;
        }

        if (debit) {
            System.out.println("Uwaga ujemny stan konta");
        }
        showSummary(amount, false);
        return true;
    }

    public void showSummary(int amount, boolean isDeposit) {
        String operation = "Wpłata";
        if (!isDeposit){
            operation = "Wypłata";
            amount = -amount;
        }
        System.out.printf("Stan konta: %d | %s: %d | Po operacji: %d\n",
                balance - amount, operation, amount, balance);
    }

    public String toString() {
        return "Account{name: " + name + ", balance: " + balance + "}";
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
