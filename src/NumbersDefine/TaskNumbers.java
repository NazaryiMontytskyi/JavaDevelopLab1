package NumbersDefine;

/*
 * Enum для подальшого обчислення констант С5, С7, С11
 */
public enum TaskNumbers {
    
    FIRST_TASK(5),  //значення для С5
    SECOND_TASK(7), // значення для С7
    THIRD_TASK(11); // значення для С11

    private final int apprNum; //атрибут значення 

    //приватний конструктор з вхідним параметром
    TaskNumbers(final int apprNum)
    {
        this.apprNum = apprNum;
    }

    //сетер з отриманням значення атрибуту
    public final int getAppNum()
    {
        return this.apprNum;
    }

}
