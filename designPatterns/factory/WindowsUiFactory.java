import components.button.Button;
import components.menu.Menu;

public class WindowsUiFactory implements UiFactory {

    @Override
    public Button createButton(Platform platform) {
        System.out.println("Windows UI Factory Creating Button");
        return new components.button.WindowsButton();
    }

    @Override
    public Menu createMenu(Platform platform) {
        System.out.println("Windows UI Factory Creating Menu");
        return new components.menu.WindowsMenu();
    }

}
