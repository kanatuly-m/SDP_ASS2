package abstractfactory;
import fruit.*;

public interface FruitFamilyFactory {
    SweetFruit  createSweetFruit();
    CitrusFruit createCitrusFruit();
}

