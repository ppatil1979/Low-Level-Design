package designPatterns.decorator;

public class Vanillascoop  implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCreamConeConstituents;

    public Vanillascoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public double getCost() {
        if(iceCreamConeConstituents != null) {
            return 10.0 + iceCreamConeConstituents.getCost();
        }
        return 10.0;
    }

    @Override
    public String getDescription() {
        if( iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + ", Vanilla Scoop";
        }
        return "Vanilla Scoop";
    }
    
}
