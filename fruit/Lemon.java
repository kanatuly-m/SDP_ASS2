package fruit;

public class Lemon implements CitrusFruit {
    @Override public String name() { return "Lemon"; }
    @Override public void eat() { System.out.println("Sour bite! Use lemon in tea or salad."); }
}
