import components.button.Button;
import components.menu.Menu;

public interface UiFactory {
    Button createButton(Platform platform);
    Menu createMenu(Platform platform);
}
