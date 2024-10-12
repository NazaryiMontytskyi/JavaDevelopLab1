package NumbersDefine;

/*
 * Клас, що обчислює константи С5, С7, С11
 */
public class NumbersDefiner {
    
    private int studentNumber; //порядковий номер студента

    /*
     * Конструктор з вхідним параметром та ініціалізацією
     */
    public NumbersDefiner(final int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    /*
     * Метод сетер для встановлення порядкового номеру
     */
    public boolean setStudentNumber(final int studentNumber)
    {
        if(studentNumber <= 0)
        {
            return false;
        }

        this.studentNumber = studentNumber;
        return true;
    }

    /*
     * Метод сетер для отримання порядкового номеру
     */
    public final int getStudentNumber()
    {
        return this.studentNumber;
    }

    /*
     * Отримання константи С5
     */
    public final int C5()
    {
        return this.getStudentNumber() % TaskNumbers.FIRST_TASK.getAppNum();
    }

    /*
     * Отримання константи С7
     */
    public final int C7()
    {
        return this.getStudentNumber() % TaskNumbers.SECOND_TASK.getAppNum();
    }

    /*
     * Отримання константи С11
     */
    public final int C11()
    {
        return this.getStudentNumber() % TaskNumbers.THIRD_TASK.getAppNum();
    }

    /*
     * Перевизначений метод toString
     * успадкований від базового класу Object
     */
    @Override
    public String toString()
    {
        String result = "";
        result += "C5: " + this.C5() + "\n";
        result += "C7: " + this.C7() + "\n";
        result += "C11: " + this.C11();
        return result;

    }

}
