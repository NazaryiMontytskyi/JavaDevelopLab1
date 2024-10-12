package Exceptions;

/*
 * Ексепшен, який спрацьовує у випадку, якщо число було
 * введене у некоректному форматі
 */
public class IncorrectNumbersInput extends Exception {
    public IncorrectNumbersInput()
    {
        super("Input of numbers has to contain only digits without any other symbols");
    }
}
