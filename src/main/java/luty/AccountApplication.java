package luty;

public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());

        account.deposit(100);
        account.deposit(120);
        account.withdraw(50);
        account.withdraw(1300);

        System.out.println("-----------");
        account.deposit(-20);
        account.withdraw(-20);

        System.out.println("-----------");
        account.withdraw(500);
        account.withdraw(500);
        account.withdraw(500);

        System.out.println("-----------");
        System.out.println(account.toString());

        System.out.println("-----------");
        Account account2 = new Account();
        account2.deposit(300);

        System.out.println("-----------");
        account.transfer(account2,111);
    }
}
