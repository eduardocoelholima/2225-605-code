package classes.inheritance;

public interface SomeInterface {

    static final int staticField = 1;

    static void doIt() {
        System.out.println("yep");
        helper();
    }

    static private void helper() {
        System.out.println("this is a private method");
    }

//    non static and non default are not possible: (compile time error)
//    public void what() {
//        System.out.println("is this default or static?");
//    }


}
