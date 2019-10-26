package pl.altkom.accounts;

public class BankServiceProxyImpl implements BankService {

    private BankService orginalService;

    public BankServiceProxyImpl() {
        orginalService = new BankServiceImpl();
    }

    private boolean checkCredentials() {
        return true;
    }

    @Override
    public boolean makeTransfer(String src, String dest, double amoubnt) {
        if (checkCredentials()) {
            return orginalService.makeTransfer(src, dest, amoubnt);
        } else {
            System.out.println("Nie masz uprawnień do zrobienia przelewu");
            return false;
        }
    }
}
