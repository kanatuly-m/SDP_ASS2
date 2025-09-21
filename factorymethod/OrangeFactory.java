package factorymethod;
import fruit.*;

public class OrangeFactory implements FruitFactory {
    @Override public Fruit createFruit() { return new Orange(); }
}
