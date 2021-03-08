package sub5;

public class VicfurnitureFac implements furnitureFac{
    @Override
    public chair createChair() {
        return new vicChair();
    }
}