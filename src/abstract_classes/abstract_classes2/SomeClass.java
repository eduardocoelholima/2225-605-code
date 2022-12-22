//import abstract_classes.abstract_classes2.SomeAbstractClass;
package abstract_classes.abstract_classes2;

public class SomeClass extends SomeAbstractClass {

    @Override
    void mustBeImplemented() {
        System.out.println("I am implemented!");
    }

    public static void main(String[] args) {

        new SomeClass().mustBeImplemented();


//        Object[] anArray = new Object[3];
//        SomeAbstractClass[] anotherArray = new SomeAbstractClass[5];             // ***
//        anotherArray[0] = new SomeAbstractClass(); //

//        SomeInterface.doIt();
//        System.out.println(SomeInterface.staticField);
    }
}
