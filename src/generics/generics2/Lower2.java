// lower bound for variable type: javac will assume the

package classes.generics;

import java.util.ArrayList;
import java.util.List;

class A2 {}
class B extends A2 {}
class C extends B {}

public class Lower2 {
    static <T extends C> void upperCheck(T something) {}
    static void upperCheck2(List<? extends Number> something) {}
    static void lowerCheck(List<? super Integer> something) {}

    public static void main(String[] args) {

        //lower bounds in variables only check the creation of the instance
        List<? super B> list = new ArrayList<B>();
        list.add( new B() );
        list.add( new C() ); //will implicitly upcast, lower bounds does not apply
//        list.add( new A2() ); //can not downcast

        //lower bounds in methods
        Lower2.lowerCheck(new ArrayList<Number>()); //ok, number is parent of Integer
//        Lower2.lowerCheck(new ArrayList<String>()); //not ok, string is not parent of Integer

        //upper bounds in methods
        Lower2.upperCheck(new C()); // upper bounded method
//        Lower2.upperCheck(new A2()); // can not do

        // upper bounds with wildcards
        Lower2.upperCheck2(new ArrayList<Integer>());
        Lower2.upperCheck2(new ArrayList<>()); // inferred by javac to be <Number>
//        Lower2.upperCheck2(new ArrayList<String>()); //upper bound not met

        //upper bounds in variables (advanced)
//        https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html
//        https://docs.oracle.com/javase/tutorial/java/generics/subtyping.html
        List<? extends B> list2 = new ArrayList<B>();
//        list2.add( new B() ); // curiously, java does not see a B instance as a fit candidate, why is that?
        // this is because java will consider the upper-bounded type parameter as a different type that the regular
        // type parameter, so <?extendsB> does not match <B>
        List<B> lb = new ArrayList<>();
        List<? extends A2> la = lb;
//        la.add(new A());  // compile-time error

    }

}
