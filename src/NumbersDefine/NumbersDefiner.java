package NumbersDefine;

public class NumbersDefiner {
    
    private int studentNumber;

    public NumbersDefiner(final int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public boolean setStudentNumber(final int studentNumber)
    {
        if(studentNumber <= 0)
        {
            return false;
        }

        this.studentNumber = studentNumber;
        return true;
    }

    public final int getStudentNumber()
    {
        return this.studentNumber;
    }

    public final int C5()
    {
        return this.getStudentNumber() % TaskNumbers.FIRST_TASK.getAppNum();
    }

    public final int C7()
    {
        return this.getStudentNumber() % TaskNumbers.SECOND_TASK.getAppNum();
    }

    public final int C11()
    {
        return this.getStudentNumber() % TaskNumbers.THIRD_TASK.getAppNum();
    }

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
