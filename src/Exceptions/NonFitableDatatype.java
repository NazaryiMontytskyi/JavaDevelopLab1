package Exceptions;

/*
 * Ексепшен, який надається у випадку якщо
 * користувач передав не той тип даних
 */
public class NonFitableDatatype extends Exception{

    public NonFitableDatatype()
    {
        super("Given datatype doesn't fit to this template.");
    }

}