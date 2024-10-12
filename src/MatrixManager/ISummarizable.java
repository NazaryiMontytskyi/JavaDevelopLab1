package MatrixManager;

/*
 * Інтерфейс, що передбачає наявність методу для
 * підрахунку суми в будь-якій множині даних
 */
public interface ISummarizable<T> {

    public T getSum(final T[] sumArray);
}
