package ch06.lambda;

@FunctionalInterface
public interface Dice<T, R> {
    public R apply(T t);
}
