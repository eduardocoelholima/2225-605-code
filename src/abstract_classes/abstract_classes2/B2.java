package classes.inheritance;

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

    public B2() { System.out.print("*"); }

    public void bMethod () {
        System.out.println("\nb exclusive");
    }

    public void methodOne() {
        System.out.print("B");
    }

    public static void main ( String [] args ) {
        A2 obj = new B2();

//        //downcasting
//        B obj2 = (B) obj;
//        obj2.bMethod();

//        //field hiding
//        System.out.println(obj.value);
//        System.out.println(obj2.value);

    }
}
