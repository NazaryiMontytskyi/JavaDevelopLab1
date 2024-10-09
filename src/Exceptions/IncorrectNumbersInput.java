package Exceptions;

public class IncorrectNumbersInput extends Exception {
    public IncorrectNumbersInput()
    {
        super("Input of numbers has to contain only digits without any other symbols");
    }
}
