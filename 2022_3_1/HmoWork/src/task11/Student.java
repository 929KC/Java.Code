package task11;

public class Student {
    public void speak(int m) throws MyException {
        if (m > 1000) {
            throw new MyException("m不能大于1000");
        } else {
            System.out.println("m" + "=" + m);
        }
    }
}
