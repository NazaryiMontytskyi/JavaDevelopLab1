package Exceptions;

/*
 * Ексепшен, який спрацьовує у випадку некоректного вводу
 * даних
 */
public class FalseInputOfAnswer extends Exception {
    
    public FalseInputOfAnswer()
    {
        super("The input is wrong. It should be as required by the template!");
    }

}
