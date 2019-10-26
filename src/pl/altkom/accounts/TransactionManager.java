package pl.altkom.accounts;

public class TransactionManager {
    private TransactionManager instance;

    public TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    private TransactionManager() {

    }

    public Transaction createTransaction() {
        return new Transaction();
    }
}
