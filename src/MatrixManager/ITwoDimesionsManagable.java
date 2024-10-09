package MatrixManager;

import Matrixes.*;

public interface ITwoDimesionsManagable<T> {
    
    public T getRowMaxAttribute(final T[] row);

    public T[] getColumn(final T[][]matrix, final int index);

}
