package previous_exams.exam2_2221;

abstract class AbstractClass<T> {
    abstract void go(T aT);
}

interface Interface<T> {
    abstract void go(T aT);
}

class X<T> implements Interface<T> {
    public void go(T aT)	{ System.out.print("running go()"); }
    public void go() {}
}

class Y<T> extends AbstractClass<T> {
    void go(T aT)	{}
    public static void main(String args[])	{
        AbstractClass<Integer> aX = new Y<Integer>();
    }
}

// This program compiles as is.
// 1. What is the effective access modifier used for the abstract method go() in AbstractClass?

//package default

// 2. What is the effective access modifier used for the abstract method go() in Interface?

//public

// 3. If the commented line is uncommented, the program will not compile. Why?

// The implemented method is package default, so it has weaker access modifier
// than the required by the interface, which need to be public.

// 4. After uncommenting the commented line, what modification in class X would allow the program to compile? Explain your solution.

//change go() method in class X to public