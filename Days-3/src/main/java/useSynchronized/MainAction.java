package useSynchronized;

public class MainAction {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000, "Zehra Bilmem");

        Action ac1 = new Action(bankAccount, 100);
        Action ac2 = new Action(bankAccount, 300);
        Action ac3 = new Action(bankAccount, 200);
        Action ac4 = new Action(bankAccount, 100);

        ac1.start();
        ac2.start();
        ac3.start();
        ac4.start();

    }
}
