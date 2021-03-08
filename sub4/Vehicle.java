package sub4;

public class Vehicle extends Logistics{
    @Override
    Engine createEngine() {
        return new RoadLogistics();
    }
}