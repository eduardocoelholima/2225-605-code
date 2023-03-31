package previous_exams.exam1_2221;
//3

// what is the output of this code?
// how many times fields are updated in this code?
// if we switch access of increment(Inheritance o) method to private, would the execution change?
// could increment() be changed to static?

public class Inheritance {
    private int nsi;

    public Inheritance() {
        this("custom constructor");
        nsi = 42;
        increment();
    }

    private Inheritance(String message) { System.out.println("default constructor"); }

    public static Inheritance increment(Inheritance o) {
        o.nsi += 1;
        return o;
    }

    private Inheritance increment() {
        nsi++;
        return this;
    }

    public String toString() { return String.valueOf(nsi); }

    public static void main(String[] args) {
        System.out.println(new Inheritance().increment());
        System.out.println(Inheritance.increment(new Inheritance()));
    }
}

//default constructor
//44
//default constructor
//44