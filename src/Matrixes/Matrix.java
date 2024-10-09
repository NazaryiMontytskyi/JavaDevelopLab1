package Matrixes;

import Exceptions.NonFitableDatatype;

public class Matrix<T extends Number> {
    
    private T[][] matrix;

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

    public final T[][] getMatrix()
    {
        return this.matrix;
    }

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
