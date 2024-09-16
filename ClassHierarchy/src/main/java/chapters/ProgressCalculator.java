package chapters;

@FunctionalInterface
public interface ProgressCalculator<T, U, R> {
    R calculate(T t, U u);

}
