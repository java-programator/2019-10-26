package pl.altkom.car;

public class DieselEngine implements Engine {
    @Override
    public void work() {
        System.out.println("BRUM BRUM - DIESEL");
    }
}
