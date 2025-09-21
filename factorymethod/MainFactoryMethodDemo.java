package factorymethod;
import fruit.*;

public class MainFactoryMethodDemo {
    public static void main(String[] args) {
        demo(new AppleFactory());
        demo(new BananaFactory());
        demo(new OrangeFactory());
        demo(new LemonFactory());
    }

    private static void demo(FruitFactory factory) {
        FactoryMethodClient client = new FactoryMethodClient(factory);
        Fruit f = client.order();
        System.out.println("Created: " + f.name());
        f.eat();
        System.out.println();
    }
}
