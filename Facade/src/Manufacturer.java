public class Manufacturer {
    private CarParts gearBox;
    private CarParts steering;
    private CarParts taleLight;
    private CarParts tyre;

    public Manufacturer() {
        gearBox = new GearBox();
        steering = new Steering();
        taleLight = new TaleLight();
        tyre = new Tyre();
    }

    public void manufactureGearBox() {
        gearBox.manufacture();
    }
    public void manufactureStreering() {
        steering.manufacture();
    }
    public void manufactureTaleLight() {
        taleLight.manufacture();
    }
    public void manufactureTyre() {
        tyre.manufacture();
    }
}
