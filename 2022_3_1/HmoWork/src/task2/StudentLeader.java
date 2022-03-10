package task2;

public class StudentLeader extends Person{
    private String post;

    public StudentLeader() {
    }
    public StudentLeader(String post) {
        super("叶秋涵","女",19,"China");
        this.post = post;
    }
    public void meeting(){
        System.out.println("天天开会");
    }
}
