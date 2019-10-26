package pl.altkom.car;

public class ElectricEngine implements Engine {
    @Override
    public void work() {
        System.out.println("Nie słychać mnie - ELECTRIC");
    }
}
