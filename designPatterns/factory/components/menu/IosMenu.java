package components.menu;

public class IosMenu implements Menu {

    @Override
    public Menu createMenu() {
        System.out.println("iOS Menu Created");
        return new IosMenu();
    }
    
}
