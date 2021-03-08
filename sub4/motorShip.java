package sub4;

public class motorShip extends Logistics{
    @Override
    Engine createEngine() {
        return new SeaLogistics();
    }
}