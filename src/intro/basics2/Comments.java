package classes.basics;

public class Comments {

    // an inline comment
    static String classState = "I am a class variable"; //another inline comment


    /*
    A multi-line comment
     */
    static String getClassState() {
        return classState;
    }

    /**
     * This is an example of a javadoc, which is used to generate documentation
     * @return the greeting
     */
    public static String greet() {
        return getClassState();
    }

    public static void main(String[] args) {
        System.out.println(Comments.getClassState());
    }

}
