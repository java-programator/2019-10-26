package pl.altkom.car;

public class PetrolEngineFactory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}
