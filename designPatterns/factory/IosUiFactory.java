import components.button.Button;
import components.button.IosButton;
import components.menu.IosMenu;
import components.menu.Menu;

public class IosUiFactory implements UiFactory {

    @Override
    public Button createButton(Platform platform) {
        System.out.println("iOS UI Factory Creating Button");
        return new IosButton();
    }

    @Override
    public Menu createMenu(Platform platform) {
        System.out.println("iOS UI Factory Creating Menu");
        return new IosMenu();
    }

}
