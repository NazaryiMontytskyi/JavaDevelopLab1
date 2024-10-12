package Matrixes;

import Exceptions.NonFitableDatatype;

/*
 * Клас матриця, що може містити
 * будь-який числовий тип даних
 */
public class Matrix<T extends Number> {
    
    private T[][] matrix;   //двовимірний масив, що репрезентує матрицю

    /*
     * Конструктор з параметром, що передає матрицю у клас
     * та присвоює її атрибуту класу
     */
    public Matrix(final T[][] matrixToCopy)
    {
        try{
            if(!(matrixToCopy[0][0] instanceof Number))
            {
                throw new NonFitableDatatype();
            }
        }
        catch(NonFitableDatatype e)
        {
            return;
        }
        
        
        this.matrix = matrixToCopy;
    }

    /*
     * Повертає матрицю у вигляді двовимірного масиву
     */
    public final T[][] getMatrix()
    {
        return this.matrix;
    }

    /*
     * Успадкований метод toString, що успадковується
     * від класу Object
     */
    @Override
    public String toString()
    {
        String result = "";
        for(T[] row : this.matrix)
        {
            for(T number : row)
            {
                result += number.toString() + " ";
            }
            result += "\n";
        }
        return result;
    }

}
