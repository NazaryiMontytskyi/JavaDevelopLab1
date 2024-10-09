import MatrixManager.MatrixManager;
import Matrixes.*;
import UserInterface.IntegerInputChecker;
import UserInterface.UserChooseInteractor;
import UserInterface.UserInterface;

public class App {
    public static void main(String[] args) throws Exception {
        UserInterface interface1 = new UserInterface(new IntegerInputChecker(), new UserChooseInteractor());
        interface1.run();
    }
}
