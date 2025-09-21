package fruit;

public class Orange implements CitrusFruit {
    @Override public String name() { return "Orange"; }
    @Override public void eat() { System.out.println("Peel the orange and enjoy the juicy slices."); }
}
