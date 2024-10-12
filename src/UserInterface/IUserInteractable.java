package UserInterface;

/*
 * Інтерфейс, що відповідає за взаємодію з користувачем
 * Метод 1. Передбачає повернення певного відгуку від користувача
 * взамін на отримання ним повідомлення
 * Метод 2. Передбачає отримання позитивного або негативного відгуку від
 * користувача у супроводі з отриманням повідомлення
 */
public interface IUserInteractable {
    
    public String userInteraction(final String message);

    public boolean getRequest(final String message);
}
