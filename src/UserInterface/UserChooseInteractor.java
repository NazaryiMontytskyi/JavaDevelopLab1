package UserInterface;

import java.util.Scanner;

import Exceptions.FalseInputOfAnswer;

public class UserChooseInteractor implements IUserInteractable{

    @Override
    public String userInteraction(final String message)
    {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public boolean getRequest(final String message)
    {
        boolean result = true;
        boolean flag;

        Scanner scanner = new Scanner(System.in);

        do{
            flag = true;
            System.out.print(message);
            String input = scanner.nextLine();

            try{
                if(input.toLowerCase().equals("y"))
                {
                    flag = result = true;
                }
                else if(input.toLowerCase().equals("n"))
                {
                    flag = true;
                    result = false;
                }
                else{
                    throw new FalseInputOfAnswer();
                }
            }
            catch(FalseInputOfAnswer e)
            {
                System.out.println(e.getMessage());
                flag = false;
            }

        }while(!flag);

        return result;
    }

}
