package UserInterface;

import Exceptions.IncorrectNumbersInput;
import MatrixManager.MatrixManager;
import Matrixes.Matrix;
import NumbersDefine.NumbersDefiner;

/*
 * Клас, що відповідає за взаємодію з користувачем
 * та виводом у консоль всієї інформації
 * 
 * Реалізує інтерфейс та виконавчий метод
 */
public class UserInterface implements IUserExecutable{
    
    IInputCheckable checker;
    IUserInteractable interactor;

    public UserInterface(IInputCheckable checker, IUserInteractable interactor)
    {
        this.checker = checker;
        this.interactor = interactor;
    }

    @Override
    public void run()
    {
        System.out.println((new NumbersDefiner(13)));
        do{
            executeFunction(getAppropriateChoose(getUsersChoose()));
        }while(interactor.getRequest("Continue? (y/n): "));
    }

    private int getUsersChoose()
    {
        String mainMessage = "Choose option:\n" +
        "1. Get sum of column greatest elements\n" + 
        "2. Execute bit excluded OR\n" + 
        "3. Exit\n" +
        ">>>> ";

        boolean flag;
        String input;
        do{
            flag = true;
            input = interactor.userInteraction(mainMessage);
            try{
                if(!checker.isInputCorrect(input))
                {
                    throw new IncorrectNumbersInput();
                }
            }
            catch(IncorrectNumbersInput e)
            {
                flag = false;
                System.out.println(e.getMessage());
            }

        }while(!flag);

        return Integer.parseInt(input);
    }

    private UserChoose getAppropriateChoose(final int choose)
    {
        UserChoose result = null;

        switch(choose)
        {
            case 1:
                result = UserChoose.columnSum;
            break;
            case 2:
                result = UserChoose.bitExcludedOr;
            break;
            case 3:
                result = UserChoose.exit;
            break;
            default:
                result = UserChoose.exit;
            break;
        }

        return result;
    }

    private void executeFunction(final UserChoose choose)
    {
        switch(choose)
        {
            case UserChoose.columnSum:
                this.execSumOfColumns();
            break;
            case UserChoose.bitExcludedOr:
                this.execBitExcludedOr();
            break;
            case UserChoose.exit:
                System.out.println("See you again! :)");
            default:
            break;
        }
    }

    private void execBitExcludedOr()
    {
        Matrix<Float> firstMatrix = new Matrix<>(
            new Float[][]{{(float)1, (float)2, (float)3},{(float)4,(float)5,(float)6},
            {(float)7,(float)8,(float)9}}
        );
        
        Matrix<Float> secondMatrix = new Matrix<>(
            new Float[][]{{(float)10, (float)11, (float)12},
            {(float)13, (float)14, (float)15},
            {(float)16,(float)17,(float)18}}
        );

        System.out.println("First matrix:\n"+firstMatrix);
        System.out.println("Second matrix:\n"+secondMatrix);

        Matrix<Integer> result = (new MatrixManager<Float>()).bitOr(firstMatrix, secondMatrix);

        System.out.println("Resulting matrix:\n" + result);
    }

    private void execSumOfColumns()
    {
        Matrix<Float> matrix = new Matrix<>(
            new Float[][]{
            {(float)15, (float)7, (float)11},
            {(float)3, (float)11, (float)0},
            {(float)5, (float)4, (float)25}}
        );

        Float resultingSum = (new MatrixManager<Float>())
        .getSum(
            new MatrixManager<Float>().getMaxVector(matrix.getMatrix())
        );

        System.out.println("Matrix:\n"+matrix);
        System.out.println("Sum of max column elements: " + resultingSum);
    }
}
