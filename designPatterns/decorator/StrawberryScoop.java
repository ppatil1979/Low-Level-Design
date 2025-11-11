package designPatterns.decorator;

public class StrawberryScoop implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCreamConeConstituents;

    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public double getCost() {
        if(iceCreamConeConstituents != null) {
            return 12.0 + iceCreamConeConstituents.getCost();
        }
        return 12.0;
    }

    @Override
    public String getDescription() {
        if( iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + ", Strawberry Scoop";
        }
        return "Strawberry Scoop";
    }

    
}
