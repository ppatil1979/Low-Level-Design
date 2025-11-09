public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.getUiFactory(Platform.IOS);
        uiFactory.createButton(Platform.IOS);
        uiFactory.createMenu(Platform.IOS);
    }
    
}
