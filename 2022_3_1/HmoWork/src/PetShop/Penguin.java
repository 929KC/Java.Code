package PetShop;
/**
* Created with IntelliJ IDEA.
* Description:
*truth:talk  is cheap, show me the code.
*@Author ：KC萧寒
* Date: 2022-03-28
* Time: 11:58
*/public class Penguin extends Pet{
    private String type;

    public  Penguin(String name, String type) {
        super(name);
        this.type = type;
    }

    public void print() {
        System.out.println("**小档案***");
        System.out.println("昵称：" + this.getName());
        System.out.println("品种：" + this.type);
        System.out.println("年龄：" + this.getAge());
        System.out.println("健康值：" + this.getHeath());
        System.out.println("亲密度：" + this.getLove());
        System.out.println("清洁值：" + this.getClean());
        System.out.println("*************");
    }

    public void eat(int food) {
        int heath = 0;
        int clean = 0;
        if (food == 1) {
            heath = this.getHeath();
            clean = this.getClean();
            this.setHeath(heath + 3);
            this.setClean(clean - 3);
        }

        if (food == 2) {
            System.out.println("超级鱼粮");
            heath = this.getHeath();
            clean = this.getClean();
            this.setHeath(heath + 8);
            this.setClean(clean - 3);
        }
    }

    public void toHospital() {
        System.out.println("企鹅正在打针吃药");
        int h = this.getHeath() + 20;
        this.setHeath(h);

    }

    public void play() {
        System.out.println("企鹅正在游泳");
        int love = this.getLove();
        int clean = this.getClean();
        this.setLove(love);
        this.setClean(clean);

    }

    public void study(int thing) {
        System.out.println("正在学习");
        int love = this.getLove();
        int smart = this.getSmart();
        if (thing == 1) {
            this.setLove(love - 3);
            this.setHeath(smart + 8);
        }
        if (thing == 2) {
            this.setLove(love - 6);
            this.setHeath(smart + 10);
        }
    }

    public void bath() {
        System.out.println("企鹅洗澡");
        int clean = this.getClean();
        int love = this.getLove();
        this.setClean(clean);
        this.setLove(love);
    }

}
