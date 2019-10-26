package pl.altkom.car;

import java.util.ArrayList;
import java.util.List;

public class LiniaProdukcyjna {

    private EngineFactory engineFactory;
    private GearBoxFactory gearBoxFactory;

    public LiniaProdukcyjna(EngineFactory engineFactory, GearBoxFactory gearBoxFactory) {
        this.engineFactory = engineFactory;
        this.gearBoxFactory = gearBoxFactory;
    }

    public List<Car> createCars(int number) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Engine engine = engineFactory.createEngine();
            GearBox gearBox = gearBoxFactory.createGearBox();
            result.add(new Car(engine, gearBox));
        }
        return result;
    }
}
