package sub6;

public class buildingBuilder implements Builder {
    private Building building;

    @Override
    public void reset() {
        building=new Building();

    }

    @Override
    public void setFloor() {

    }

    @Override
    public void setRoof() {
        System.out.println("Roof of ur house is ... ... ... set");
    }

    @Override
    public String setWalls() {
        return "Setting walls of your house is completed";

    }

    public Building getHouse() {
        return building;
    }

    public void setHouse(Building building) {
        this.building = building;
    }

}