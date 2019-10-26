package pl.altkom.car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LiniaProdukcyjna l1 = new LiniaProdukcyjna(
                new DieselEngineFactory(), new ManualGearBoxFactory());
        List<Car> diesle = l1.createCars(10);

        LiniaProdukcyjna l2 = new LiniaProdukcyjna(
                new PetrolEngineFactory(), new ManualGearBoxFactory());
        List<Car> benzynowe = l2.createCars(10);

        LiniaProdukcyjna l3 = new LiniaProdukcyjna(
                new ElectricEngineFactory(), new ManualGearBoxFactory());
        List<Car> elektryki = l3.createCars(10);
    }
}
