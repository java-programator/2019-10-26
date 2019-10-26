package pl.altkom.car;

public class ElectricEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}
