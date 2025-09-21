package factorymethod;
import fruit.*;

public class AppleFactory implements FruitFactory {
    @Override public Fruit createFruit() { return new Apple(); }
}

