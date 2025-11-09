package components.button;

public class WindowsButton implements Button {

    @Override
    public Button createButton() {
        System.out.println("Windows Button Created");
        return new WindowsButton();
    }
    
}
