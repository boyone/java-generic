package th.co.dminer.service;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import th.co.dminer.dao.AccountDAO.AccountDAO;
import th.co.dminer.domain.BankAccount;
import th.co.dminer.domain.Profile;

/**
 * Created with IntelliJ IDEA.
 * User: boyone
 * Date: 6/28/13
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class BalanceServiceTest {

    private BalanceService service;
    private AccountDAO dao;

    @Before
    public void setup() {
        dao = new AccountDAO();
        service = new BalanceService();
        service.setAccountDAO(dao);
    }

    @Test
    public void doService() throws Exception {
        Profile profile = new Profile("tmn.00001");
        BankAccount bankAccount = service.doService(profile);

        Assert.assertNotNull(bankAccount);
        Assert.assertEquals(1000, bankAccount.getBalance());
        Assert.assertEquals("tmn.00001", bankAccount.getTmnId());
    }
}
