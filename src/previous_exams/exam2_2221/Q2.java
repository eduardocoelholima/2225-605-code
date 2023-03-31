package previous_exams.exam2_2221;
import java.util.ArrayList;
import java.util.Collection;
public class Q2<T> {
    public static void main(String[] args)	{
        Collection c = new ArrayList<Q1>();
        c.add(new Q1(new A()));
        c.add(new Q1(new B()));
//        c.add(new Q1(new Object()));
    }
}

// For this question, consider first question's source code as part of the same package
// 1. If this code is compiled with -Xlint, will any message be printed? If so, describe the meaning of message. Assume all dependencies successfully compile.

//Yes. Type checking is bypassed by Collection and Q1 in lines 6-8.

// 2. If the commented line is uncommented, will this code compile? Why?

//Q1 has an type parameter with an upper bound of A, so an Object instance will not be a valid type.
