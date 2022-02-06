package polymorphic_text;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-06
 * Time: 20:38
 */
public class KeyBoard implements USB{
    private  String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public KeyBoard() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keyDown(){
        System.out.println(name + "写下了：老铁，6666，下次再来哦，老弟~~~~");
    }

    @Override
    public  void connect(){
        System.out.println(name + "成功的接入了设备了~~~");
    }

    @Override
    public  void unconnect(){
        System.out.println(name + "成功的从设备弹出了~~~");
    }
}
