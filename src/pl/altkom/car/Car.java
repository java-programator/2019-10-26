package pl.altkom.car;

public class Car {
    private Engine engine;
    private GearBox gearBox;

    public Car(Engine engine, GearBox gearBox) {
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public void go(int distance) {
        engine.work();
    }
}
