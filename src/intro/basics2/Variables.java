package classes.basics;

public class Variables {

    // a field can be a class variable
    static int classVariable;

    //a field can also be an instance variable
    int instanceVariable;

    //a local variable is a variable created within a limited scope, e.g. inside a method
    void localVariableMethod() {
        int localVariable = 0;
        localVariable++;
        System.out.println(localVariable);
    }

}
