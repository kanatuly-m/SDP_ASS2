package factorymethod;
import fruit.*;

public class BananaFactory implements FruitFactory {
    @Override public Fruit createFruit() { return new Banana(); }
}
