package classes.singleton;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // trying to invoke the Singleton constructor
//        Singleton s3 = new Singleton(); // compile error

        System.out.println("Same instance? " + (s1 == s2));
    }
}
