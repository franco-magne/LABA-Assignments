package combos;

@FunctionalInterface
public interface ComboLevelInformer<T, S> {
    S inform(T t);

}
