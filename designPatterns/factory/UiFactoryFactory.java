public class UiFactoryFactory {

    public static UiFactory getUiFactory(Platform platform) {
        switch (platform) {
            case IOS:
                return new IosUiFactory();
            case WINDOWS:
                return new WindowsUiFactory();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
    
}
