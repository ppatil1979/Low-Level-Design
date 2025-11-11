package designPatterns.decorator;

public class ChoclateCone implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChoclateCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    public ChoclateCone() {
        
    }

    @Override
    public double getCost() {
        if(iceCreamConeConstituents != null) {
            return 15.0 + iceCreamConeConstituents.getCost();
        }   
        return 15.0;
    }

    @Override
    public String getDescription() {
        if (iceCreamConeConstituents != null) {
            return iceCreamConeConstituents.getDescription() + ", Choclate Cone";
            
        }
        return "Choclate Cone";
    }
    
}
