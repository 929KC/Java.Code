package polymorphic_text;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-06
 * Time: 20:38
 */
public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public Mouse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  void connect() {
        System.out.println(name+"从设备接入");
    }
    @Override
    public void unconnect() {
        System.out.println(name+"从设备弹出");
    }

    public void click(){
        System.out.println(name + "双击点亮小红心~~~~");
    }
}
