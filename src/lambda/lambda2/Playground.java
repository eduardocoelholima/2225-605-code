package lambda.lambda2;

class LengthTester implements MyPredicate<String, Integer>{

    @Override
    public boolean test(String s, Integer maxLength) {
        return s.length() <= maxLength;
    }
}

public class Playground {

    public static void main(String[] args) {
        System.out.println("Using the classic interface implementation");
        LengthTester tester1 = new LengthTester();
        System.out.println("Is 'hello' less than 6 characters: " + tester1.test("hello", 6));

        System.out.println("Using an anonymous class");
        MyPredicate<String, Integer> tester2 = new MyPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer maxLength) {
                return s.length() <= maxLength;
            }
        };
        System.out.println("Is 'hello' less than 6 characters: " + tester2.test("hello", 6));

        System.out.println("Using a lambda expression");
        MyPredicate<String, Integer> tester3 = (s, l) -> s.length() <= l;
        System.out.println("Is 'hello' less than 6 characters: " + tester3.test("hello", 6));
    }
}

