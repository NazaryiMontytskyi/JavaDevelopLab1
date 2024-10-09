package Exceptions;

public class NonFitableDatatype extends Exception{

    public NonFitableDatatype()
    {
        super("Given datatype doesn't fit to this template.");
    }

}