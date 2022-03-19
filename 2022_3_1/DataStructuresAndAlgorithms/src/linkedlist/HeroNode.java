package linkedlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-19
 * Time: 13:56
 */
public class HeroNode {
    public int SerialNumber;//编号
    public String name;
    public String nickName;//昵称
    public HeroNode next;
    public HeroNode pre;

    public HeroNode(int serialNumber, String name, String nickName) {
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
