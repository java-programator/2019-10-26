package pl.altkom.car;

public class ManualGearBoxFactory implements GearBoxFactory {
    @Override
    public GearBox createGearBox() {
        return new ManualGearBox();
    }
}
