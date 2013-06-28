package th.co.dminer.dao.AccountDAO;

import th.co.dminer.domain.BankAccount;

/**
 * Created with IntelliJ IDEA.
 * User: boyone
 * Date: 6/28/13
 * Time: 10:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccountDAO {
    public BankAccount findBankAccount(String tmnId) {
        return new BankAccount(tmnId, 1000);
    }
}
