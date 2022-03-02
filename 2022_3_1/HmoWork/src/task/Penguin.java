package task;

public class Penguin {
    private String name;
    private String sex;
    private int heath;
    private int live;

    public Penguin() {
    }

    public Penguin(String name, String sex, int heath, int live) {
        this.name = name;
        this.sex = sex;
        this.heath = heath;
        this.live = live;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        if (heath < 0 || heath > 100) {
            System.out.println("健康值应该 在0~100之间，默认值为60.");
            this.heath = 60;
        } else {
            this.heath = heath;
        }
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        if (live < 0 || live > 100) {
            System.out.println("健康值应该 在0~100之间，默认值为60.");
            this.live = 60;
        } else {
            this.live = live;
        }
    }

    public void print() {
        System.out.println("企鹅的自白：");
        System.out.println("我的名字叫" + this.name + "," +
                "健康值是" + "," + this.heath + "," +
                "和主人的亲密度为" + this.live + ","+"我的性别是"+
                this.sex+".");
    }
}
