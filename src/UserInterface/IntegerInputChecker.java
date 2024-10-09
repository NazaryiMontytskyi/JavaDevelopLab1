package UserInterface;

public class IntegerInputChecker implements IInputCheckable{
    
    @Override
    public boolean isInputCorrect(final String input)
    {
        if(input == null || input.isEmpty())
        {
            return false;
        }

        for(char c : input.toCharArray())
        {
            if(!Character.isDigit(c))
            {
                return false;
            }
        }

        return true;
    }

}
