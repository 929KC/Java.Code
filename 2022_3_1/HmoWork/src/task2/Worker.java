package task2;

public class Worker  extends Person {
    private String company;
    private int workAge;

    public Worker() {
    }

    public Worker(String company, int workAge) {
        super("叶知秋","男",19,"China");
        this.company = company;
        this.workAge = workAge;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work(){
        System.out.println("每天打代码！");
    }

}
