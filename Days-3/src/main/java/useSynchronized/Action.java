package useSynchronized;

public class Action extends Thread{

    private BankAccount bankAccount;
    private double minusSize;

    public Action(BankAccount bankAccount, double minusSize) {
        this.bankAccount = bankAccount;
        this.minusSize = minusSize;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        }catch (Exception ex) {}
        bankAccount.minus(minusSize);
    }
}
