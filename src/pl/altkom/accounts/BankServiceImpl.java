package pl.altkom.accounts;

public class BankServiceImpl implements BankService {
    private AccountManager accountManager;

    public BankServiceImpl() {
        accountManager = new AccountManager();
    }

    @Override
    public boolean makeTransfer(String src, String dest, double amoubnt) {
        TransactionManager transactionManager = TransactionManager.getInstance();
        Transaction transaction = transactionManager.createTransaction();
        if (accountManager.charge(src, amoubnt)
        && accountManager.deposit(dest, amoubnt)) {
            transaction.commit();
            return true;
        } else {
            transaction.rollback();
            return false;
        }
    }
}
