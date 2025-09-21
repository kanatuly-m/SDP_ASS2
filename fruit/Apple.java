package fruit;

public class Apple implements SweetFruit {
    @Override public String name() { return "Apple"; }
    @Override public void eat() { System.out.println("Crunch! Eating a fresh apple."); }
}
