package interfaces;

public class SomeClass implements SomeInterface {
    public static void main(String[] args) {
        SomeInterface x = new SomeClass();
        x.doDefault();
        SomeInterface.doStatic();
    }
}
