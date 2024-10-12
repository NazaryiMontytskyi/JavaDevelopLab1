package UserInterface;

import java.util.Scanner;

import Exceptions.FalseInputOfAnswer;


/*
 * Клас, що взаємодіє з користувачем та реалізує відповідний інтерфейс
 */
public class UserChooseInteractor implements IUserInteractable{

    /*
     * Реалізація методу з отриманням повідомлення та поверненням
     * відгуку від користувача
     */
    @Override
    public String userInteraction(final String message)
    {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /*
     * Реалізація методу з отриманням позитивної або
     * негативної відповіді від користувача
     */
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
