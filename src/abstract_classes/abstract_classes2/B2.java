package abstract_classes.abstract_classes2;

/**
 * - Check the main() output, explain what is happening
 *
 * - Can I call a B-specific method on obj? Why?
 * - What does (B) represent in B obj2 = (B)obj?
 * - What is a method override?
 * - What is a field hiding?
 */

public class B2 extends A2
{
    protected int value = 2;

    public B2() { System.out.println("*"); }

    public void bMethod () {
        System.out.println("\nb exclusive");
    }

    public void methodOne() {
        System.out.print("B");
    }

    public static void main ( String [] args ) {
        A2 obj = new B2(); //implicit upcasting
//        ((B2) obj).bMethod();
//        obj.bMethod();
//        //downcasting
        B2 obj2 = (B2) obj;
//        obj2.bMethod();

        //field hiding
        System.out.println(obj.value);
        System.out.println(obj2.value);

    }
}
