package previous_exams.exam2_2221;
import java.util.LinkedList;
import java.util.List;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class Q1<T extends A> {

    T instance;
    public Q1(T instance) {
        this.instance = instance;
    }

    public static void main(String[] args)	{
        List<Q1<? super B>> cList = new LinkedList<Q1<? super B>>();
//        cList.add( new Q1<A>(new A() ) );
//        cList.add( new Q1<B>(new B() ) );
//        cList.add( new Q1<C>(new C() ) );
//        cList.add( new Q1<D>(new D() ) );
    }
}

// 1. Explain in English what the first commented line would do if uncommented

//A new Q1<A> instance is created, and since it has a custom constructor, an A instance is passed.
//Q1 has a type parameter that is upper bounded by A.
//The Q1<A> instance is added to the list, which has a lower bound of parameter type B.

// 2a. For all 4 commented lines, which ones will prevent compilation?

//1st,2nd compile
//3re,4th does not

// 2b. For each line commented line, explain why it will/will not prevent compilation.

//While all lines have no conflict with the upper bound in the class signature, the list is lower bounded by B.
//Thus it is not possible to add Q1<C> or Q1<D> instances to the list.
