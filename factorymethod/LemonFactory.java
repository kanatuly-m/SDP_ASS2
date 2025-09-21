package factorymethod;
import fruit.*;

public class LemonFactory implements FruitFactory {
    @Override public Fruit createFruit() { return new Lemon(); }
}

