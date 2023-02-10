package interfaces;

public interface SomeInterface {
//    private int something = 10; // does not work: must be public

     private void doSomething() {
        System.out.println("private method");
//        System.out.println(something);
    }

    default void doDefault() {
        System.out.println("default method");
        doSomething();
    }

    public static void doStatic() {
        System.out.println("static context");
    }

}
