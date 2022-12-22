package lambda.lambda2;

@FunctionalInterface
public interface MyPredicate<T, R> {

    boolean test(T t, R r);

}
