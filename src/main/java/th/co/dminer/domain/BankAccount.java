package th.co.dminer.domain;

/**
 * Created with IntelliJ IDEA.
 * User: boyone
 * Date: 6/28/13
 * Time: 10:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {
    private String tmnId;
    private int balance;

    public BankAccount(String tmnId, int balance) {
        this.tmnId = tmnId;
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getTmnId() {
        return tmnId;
    }

    public void setTmnId(String tmnId) {
        this.tmnId = tmnId;
    }
}
