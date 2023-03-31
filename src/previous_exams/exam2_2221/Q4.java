package previous_exams.exam2_2221;
import java.io.*;

public class Q4 implements Serializable {
    transient Integer value = 42;

    static void read() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.save"));) {
            Q4 o = (Q4) in.readObject();
            o.value = 42;
            System.out.println("Value = " + o.value);
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }

    static void write() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.save"));) {
            Q4 o = new Q4();
            out.writeObject(o);
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }

    public static void main (String args[] ){
        write();
        read();
    }
}

// 1a. What is the output of this program?

//Value = null

// 1b. Is the object fully serialized? Why?

// The transient field is not serialized.

// 2. If the commented line is uncommented, what would the output of the program be?

//Value = 42
