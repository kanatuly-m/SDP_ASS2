package abstractfactory;
import fruit.*;
public class AbstractFactoryClient {
    private final SweetFruit sweet;
    private final CitrusFruit citrus;

    public AbstractFactoryClient(FruitFamilyFactory factory) {
        this.sweet  = factory.createSweetFruit();
        this.citrus = factory.createCitrusFruit();
    }

    public void menu() {
        present(sweet);
        present(citrus);
    }

    private void present(Fruit f) {
        System.out.println("Menu item: " + f.name());
        f.eat();
    }

}
