package sub5;

public class ModfurnitureFac implements furnitureFac {
    @Override
    public chair createChair() {
        return new Modchair();
    }
}