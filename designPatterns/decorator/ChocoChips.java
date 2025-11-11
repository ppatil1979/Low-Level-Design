package designPatterns.decorator;

/**
 * A decorator that adds chocolate chips to an ice cream cone.
 * Assumes IceCreamConeConstituents exposes getDescription() and getCost().
 */
public class ChocoChips implements IceCreamConeConstituents {
    private final IceCreamConeConstituents iceCreamConeConstituents;
    private static final double CHOCO_CHIPS_COST = 2.0;

    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + ", ChocoChips";
    }

    @Override
    public double getCost() {
        return iceCreamConeConstituents.getCost() + CHOCO_CHIPS_COST;
    }
}