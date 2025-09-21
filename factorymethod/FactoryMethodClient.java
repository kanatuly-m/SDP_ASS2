package factorymethod;
import fruit.*;

public class FactoryMethodClient {
    private final FruitFactory factory;

    public FactoryMethodClient(FruitFactory factory) {
        this.factory = factory;
    }

    public Fruit order() {
        return factory.createFruit(); // depends on Creator, not on concrete product
    }
}
