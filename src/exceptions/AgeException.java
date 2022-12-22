package exceptions;

public class AgeException extends Exception {

    int value;

    public AgeException(String msg, int value) {
        super(msg);
        this.value = value;
    }

    public String toString() {
        return "AgeException: attempted age value of " + value;
    }
}