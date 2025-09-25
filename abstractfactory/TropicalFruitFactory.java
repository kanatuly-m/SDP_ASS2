package abstractfactory;
import fruit.*;

public class TropicalFruitFactory implements FruitFamilyFactory {
    @Override 
    public SweetFruit  createSweetFruit(){ 
        return new Banana(); 
    }
    @Override 
    public CitrusFruit createCitrusFruit(){ 
        return new Orange(); 
    }
}

