package designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCream1 = 
         new ChocoChips( 
            new StrawberryScoop(
                new Vanillascoop( 
                    new OrangeCone(
                        new ChocoChips(
                                new ChoclateCone()
                                ) 
                            )
                        )
                    )
                );             
            System.out.println("Description: " + iceCream1.getDescription());
            System.out.println("Cost: " + iceCream1.getCost());
        }
}
