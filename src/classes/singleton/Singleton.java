package classes.singleton;

/**
 * Simple implementation of the Singleton pattern.
 * This class uses a lazy initialization to create
 * the singleton instance.
 * @author RIT CS
 */
public class Singleton {

    /**
     * The instance of the singleton class
     */
    private static Singleton instance;

    /**
     * Private constructor to prevent clients
     * for calling it and break the singleton pattern
     */
    private Singleton(){}

    /**
     * Global access points to the singleton instance.
     * Initialization on first use.
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
