package classes.basics;

// we need to import a class identifier to inform the compiler where to find the class
import classes.basics.subpackage.SubPackage;

/**
 * This is java doc! Isn't this amazing?
 */
public class PackageAndImports extends SubPackage {

    // instance state
    String childName = "Child";

    //using the fully qualified name avoids having to import the class name
    //it is common practice to use import to unclutter the code
    java.util.ArrayList arrayList = new java.util.ArrayList();

    // instance behaviour
    String getSomeName() {
        return childName;
    }

    public static void main(String[] args) {
        PackageAndImports aPackage = new PackageAndImports();
        PackageAndImports anotherPackage = new PackageAndImports();
        System.out.println(aPackage.getSomeName());
//        System.out.println(anotherChild.greet());
//        System.out.println(Parent.class.getName());
    }

}
