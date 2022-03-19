package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 18:01
 */
public class HeroNode2 {
    public int SerialNumber;//编号
    public String name;
    public String nickName;//昵称
    public HeroNode2 next;
    public HeroNode2 pre;

    public HeroNode2(int serialNumber, String name, String nickName) {
        this.SerialNumber = serialNumber;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "SerialNumber=" + SerialNumber +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

}
