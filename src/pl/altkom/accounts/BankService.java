package pl.altkom.accounts;

public interface BankService {
    boolean makeTransfer(String src, String dest, double amoubnt);
}
