package exceptions;

/**
 * This class plays with exceptions
 *
 * @author hp bischof
 * <p>
 * Revisions:
 * $Log$
 * @version $Id$
 */

public class Excep_2 {

    public static void main(String[] args) {
        for (int index = 1; index < 3; index++) {
            try {
                new Excep_2().f(index);
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void f(int n) throws NullPointerException,
            InterruptedException {
        System.out.println("f(" + n + ")");
        switch (n) {
            case 1:
                throw new NullPointerException("1");
            default:
                throw new InterruptedException("default");
        }
    }
}
