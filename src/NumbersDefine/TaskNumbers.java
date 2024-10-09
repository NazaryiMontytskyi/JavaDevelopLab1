package NumbersDefine;

public enum TaskNumbers {
    
    FIRST_TASK(5),
    SECOND_TASK(7),
    THIRD_TASK(11);

    private final int apprNum;

    TaskNumbers(final int apprNum)
    {
        this.apprNum = apprNum;
    }

    public final int getAppNum()
    {
        return this.apprNum;
    }

}
