package task2;

public class Hero {
    private String name;
    private int life;
    private  int level;

    public Hero() {
    }

    public Hero(String name, int life, int level) {
        this.name = name;
        this.life = 100;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

     public void print(String name,int life,int level){
        if(level==1){
            this.name="普通英雄";
            this.life=100;
        }else if(level==2){
            this.name="高级英雄";
            this.life=200;
        }else{
            System.out.println("不好意思，没有找到你想要的英雄！");
        }
         System.out.println("英雄名字："+name+","+"英雄血量："+life+","+"英雄等级："+level);
     }

     public void fight(String name){
         System.out.println(name+"杀你一百滴血");
     }

    public void fight(String name,int level){
       int count=100;
       if(level==1){
           System.out.println(name+"杀你"+(level*count)+"滴血");
       }else if(level==2){
           System.out.println(name+"杀你"+(level*count)+"滴血");
       }else{
           System.out.println("不好意思，您开挂了,封号12小时");
           System.exit(0);
       }

    }
}
