package Service;
import DAO.AccountDao;
import Model.Account;

public class AccountService {
    private AccountDao accountDao;

    public AccountService(){
        accountDao = new AccountDao();
    }

    public AccountService(AccountDao accountDao){
        this.accountDao=accountDao;
    }

    public Account insertAccount(Account account){
        Account result = accountDao.insertAccount(account);
        return result;

    }

    public Account loginAccount(Account account){
        Account result = accountDao.loginAccount(account);
        return result;
    }



    
}
