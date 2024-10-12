package MatrixManager;

import java.util.*;
import Matrixes.*;

/*
 * Клас, що оперує матрицями та реалізовує відразу декілька інтерфейсів, що
 * відповідають за роботу з матрицями
 */
public class MatrixManager<T extends Number & Comparable<T>> implements ITwoDimesionsManagable<T>, ISummarizable<Float> {
    
    /*
     * Реалізований метод інтерфейсу, що шукає найбільший елемент у масиві
     */
    @Override
    public T getRowMaxAttribute(final T[] row)
    {
        T result = row[0];
        for(T element : row)
        {
            if(result.compareTo(element) < 0)
            {
                result = element;
            }
        }

        return result;
    }

    /*
     * Метод що повертає колонку у вигляді масиву. Передається матриця та номер колонки,
     * а повертається сама колонка.
     */
    @Override
    public T[] getColumn(T[][] matrix, int index)
    {
        if(matrix == null)
        {
            return null;
        }

        if(matrix.length < index || index < 0)
        {
            return null;
        }

        List<T> resultList = new ArrayList<T>();

        for(int i = 0; i < matrix.length; i++)
        {
            resultList.add(matrix[i][index]);
        }

        return resultList.toArray((T[]) java.lang.reflect.Array.newInstance(matrix[0][0].getClass(), resultList.size()));
    }

    /*
     * Отримується сума масиву для типу даних Float
     */
    @Override
    public Float getSum(final Float[] sumArray)
    {
        float sum = (float)0;

        for(float element : sumArray)
        {
            sum += element;
        }

        return sum;
    }

    /*
     * У цьому методі отримується масив максимальних значень у колонках
     */
    public T[] getMaxVector(final T[][] matrix)
    {
        if(matrix == null || matrix.length == 0)
        {
            return null;
        }


        List<T> resultVector = new ArrayList<T>();

        for(int i = 0; i < matrix[0].length; i++)
        {
            resultVector.add(getRowMaxAttribute(getColumn(matrix, i)));
        }

        return resultVector.toArray((T[]) java.lang.reflect.Array.newInstance(matrix[0][0].getClass(), resultVector.size()));
    }


    /*
     * Побітове виключне АБО для двох матриць. У результаті отримується
     * нова цілочисельна матриця
     */
    public Matrix<Integer> bitOr(Matrix<Float> first, Matrix<Float> second)
    {
        if(first == null || second == null)
        {
            return null;
        }

        if(first.getMatrix().length != second.getMatrix().length)
        {
            return null;
        }

        if(first.getMatrix()[0].length != second.getMatrix()[0].length)
        {
            return null;
        }

        final int rows = first.getMatrix().length;
        final int columns = first.getMatrix()[0].length;

        Integer[][] resultMatrix = new Integer[rows][columns];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                resultMatrix[i][j] = Float.floatToIntBits(first.getMatrix()[i][j].floatValue())
                ^ Float.floatToIntBits(second.getMatrix()[i][j].floatValue());

            }
        }

        return new Matrix<Integer>(resultMatrix);
    } 

}
