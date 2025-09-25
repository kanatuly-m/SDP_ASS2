package abstractfactory;
import fruit.*;

public class TemperateFruitFactory implements FruitFamilyFactory {
    @Override
    public SweetFruit  createSweetFruit(){ 
        return new Apple(); 
    }
    @Override 
    public CitrusFruit createCitrusFruit(){ 
        return new Lemon(); 
    }
}

