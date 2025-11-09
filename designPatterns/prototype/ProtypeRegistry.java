package designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtypeRegistry {
    // This class can be used to manage and provide access to student prototypes
    Map<String, Prototype<?>> prototypes = new HashMap<>();

    public void registerPrototype(String Key, Prototype<?> prototype) {
        prototypes.put(Key, prototype);
    }

    public <T extends Prototype<?>> T getPrototype(String Key, Class<T> type) {
        Prototype<?> prototype = prototypes.get(Key);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype found for key: " + Key);
        }
        return type.cast(prototype.clone());
    }
}
