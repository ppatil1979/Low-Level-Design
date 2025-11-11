package designPatterns.decorator;

public class OrangeCone implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCreamConeConstituents;

    public OrangeCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }  

    public OrangeCone() {
        
    }

    @Override
    public double getCost() {
        if(iceCreamConeConstituents != null) {
            return 1.25 + iceCreamConeConstituents.getCost();
        }
        return 1.25;
    }

    @Override
    public String getDescription() {
        if( iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + ", Orange Cone";
        }
        return "Orange Cone";
    }
    
}
