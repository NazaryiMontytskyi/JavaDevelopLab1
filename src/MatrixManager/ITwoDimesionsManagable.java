package MatrixManager;

import Matrixes.*;

/*
 * Інтерфейс, що передбачає роботу з двовимірними (матричними)
 * наборами даних
 */
public interface ITwoDimesionsManagable<T> {
    
    public T getRowMaxAttribute(final T[] row);

    public T[] getColumn(final T[][]matrix, final int index);

}
