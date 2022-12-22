package lambda;

import java.util.function.BinaryOperator;

/**
 * Simple example of lambda expressions
 */
public class SumOperation {

    public static void main(String[] args) {

        BinaryOperator<Integer> sumOperation = new BinaryOperator<>() {
            @Override
            public Integer apply(Integer i1, Integer i2) {
                return i1 = i2;
            }
        };
        System.out.println(sumOperation.apply(2,3));

        BinaryOperator<Integer> sumLambda = (i1, i2) -> i1 + i2;
        System.out.println(sumLambda.apply(2,3));
    }
}
