package components.button;

public class IosButton implements Button {

    @Override
    public Button createButton() {
        System.out.println("iOS Button Created");
        return new IosButton();
    }
    
}
