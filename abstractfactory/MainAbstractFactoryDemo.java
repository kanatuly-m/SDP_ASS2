package abstractfactory;

public class MainAbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Tropical Family ===");
        new AbstractFactoryClient(new TropicalFruitFactory()).menu();

        System.out.println("\n=== Temperate Family ===");
        new AbstractFactoryClient(new TemperateFruitFactory()).menu();
    }
}
