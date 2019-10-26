package pl.altkom.accounts;

public class Transaction {
    private static int counter;
    private int id;

    public Transaction() {
        counter++;
        id = counter;
    }

    public void commit() {
        System.out.println("Zakomitowano transakcję " + id);
    }

    public void rollback() {
        System.out.println("Wycofano transakcję " + id);
    }
}
