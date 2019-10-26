package pl.altkom.accounts;

import java.util.Random;

public class AccountManager {
    Random r = new Random();

    /**
     * Funkcja pobiera określoną kwotę z podanego konta
     * @param accountNumber numer konta, z którego pieniądze mają być pobrane
     * @param cash kwota do pobrania z konta
     * @return true jeżeli transakcja się powiodła
     */
    public boolean charge(String accountNumber, double cash) {
        System.out.println("Konto " + accountNumber + " pozbawiono " + cash + " dolarów");
        return r.nextBoolean();
    }

    /**
     * Funkcja dodaje określoną kwotę na podanane konto
     * @param accountNumber numer konta, na które mają być przelane środki
     * @param cash kwota do przelania
     * @return true jeżeli transakcja się powiodła
     */
    public boolean deposit(String accountNumber, double cash) {
        System.out.println("Konto " + accountNumber + " dostało " + cash + " dolarów");
        return r.nextBoolean();
    }
}
