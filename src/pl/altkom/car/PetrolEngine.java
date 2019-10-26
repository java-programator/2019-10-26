package pl.altkom.car;

public class PetrolEngine implements Engine {
    @Override
    public void work() {
        System.out.println("WRUM WRUM - PETROL");
    }
}
