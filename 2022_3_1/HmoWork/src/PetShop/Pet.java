package PetShop;
import java.util.Random;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-28
 * Time: 11:47
 */
public abstract class Pet {
    private String name;
    private int age;
    private int heath;
    private int clean;
    private int smart;
    private int love ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0&&age<=50){
            this.age = age;
        }else{
            this.age=1;
        }

    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        if(heath>=0&&heath<=100){
            this.heath = heath;
        }else{
            this.age=50;
        }
    }

    public int getClean() {
        return clean;
    }

    public void setClean(int clean) {
        if(clean>=0&&clean<=100){
            this.clean =clean;
        }else{
            this.clean=50;
        }
    }


    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if(smart>=0&&smart<=100){
            this.smart = smart;
        }else{
            this.smart=50;
        }
    }


    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        if(love>=0&&love<=100){
            this.love = love;
        }else{
            this.love=50;
        }
    }


    public Pet(String name){
        this.name=name;
        this.age=1;
        Random r=new Random();
        this.heath=r.nextInt(30)+50;
        this.clean=r.nextInt(40)+40;
        this.love=r.nextInt(15)+5;
        this.smart=r.nextInt(50)+30;

    }

    public abstract void print();

    public abstract void eat(int food);

    public abstract void toHospital();

    public abstract void play();

    public abstract void study(int thing);

    public abstract void bath();
}
