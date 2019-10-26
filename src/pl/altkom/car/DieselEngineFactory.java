package pl.altkom.car;

public class DieselEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new DieselEngine();
    }
}
