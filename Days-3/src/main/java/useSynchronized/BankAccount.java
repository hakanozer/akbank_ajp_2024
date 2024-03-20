package useSynchronized;

public class BankAccount {

    private double total;
    private String name;

    public BankAccount(double total, String name) {
        this.total = total;
        this.name = name;
    }

    synchronized
    public void minus( double size ) {
        if ( size <= total ) {
            total -= size;
            System.out.println("Sayın :" + name + " Çekilen :" + size + " Kalan :" + total);
        }else {
            System.out.println(name + " minus fail :" + total);
        }
    }

}
