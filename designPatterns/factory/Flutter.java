public class Flutter {

    // Flutter specific implementation like non factory methods

    public UiFactory getUiFactory(Platform platform) {
        return UiFactoryFactory.getUiFactory(platform);
        
    }
    
}
