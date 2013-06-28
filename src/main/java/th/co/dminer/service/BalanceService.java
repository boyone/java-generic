package th.co.dminer.service;

import th.co.dminer.dao.AccountDAO.AccountDAO;
import th.co.dminer.domain.BankAccount;
import th.co.dminer.domain.Profile;

/**
 * Created with IntelliJ IDEA.
 * User: boyone
 * Date: 6/28/13
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class BalanceService extends BaseEntityService<Profile, BankAccount> {

    private AccountDAO accountDAO;

    @Override
    protected String getEntityName() {
        return "BalanceService";
    }

    @Override
    protected BankAccount process(Profile profile) throws Exception {

        return accountDAO.findBankAccount(profile.getTmnId()) ;
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }
}
