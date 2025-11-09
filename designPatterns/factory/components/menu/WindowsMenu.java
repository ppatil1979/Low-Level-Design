package components.menu;

public class WindowsMenu implements Menu {

    @Override
    public Menu createMenu() {
        System.out.println("Windows Menu Created");
        return new WindowsMenu();
    }
    
}
