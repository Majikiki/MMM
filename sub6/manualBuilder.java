package sub6;

public class manualBuilder implements Builder{
    private Manual manual;

    @Override
    public void reset() {
        manual=new Manual();
    }

    @Override
    public String setWalls() {
        return "Setting the walls... ... ... Completed";
    }

    @Override
    public void setRoof() {

    }

    @Override
    public void setFloor() {

    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    public Manual getManual() {
        return manual;
    }
}