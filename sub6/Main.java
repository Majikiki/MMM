package sub6;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dir dir=new Dir(new buildingBuilder());
        dir.make("simple");
        System.out.println("Building is completed successful");
    }
}