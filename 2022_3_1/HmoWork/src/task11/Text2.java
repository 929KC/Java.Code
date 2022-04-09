package task11;


public class Text2 {
    public static void main(String[] args)  {
        Student s = new Student();
        try {
            s.speak(1233);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
