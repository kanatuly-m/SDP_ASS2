package fruit;

public class Banana implements SweetFruit {
    @Override 
    public String name(){ 
        return "Banana"; 
    }
    @Override 
    public void eat(){ 
        System.out.println("Peel and eat a sweet banana."); 
    }
}

