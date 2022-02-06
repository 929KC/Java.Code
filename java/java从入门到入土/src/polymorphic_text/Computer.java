package polymorphic_text;

import Array.Movie;

import java.security.KeyStore;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-06
 * Time: 20:37
 */
public class Computer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     提供一个安装的入口：行为。
     */
    private  String name;

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {

    }

    public void star(){
        System.out.println(name+"开机了！！！");
    }
    public void installUSB(USB u){
        u.connect();
        if (u instanceof Mouse){
            Mouse m=(Mouse) u;
            m.click();
        }else if(u instanceof KeyBoard){
            KeyBoard k=(KeyBoard) u;
            k.keyDown();
        }
        u.unconnect();
    }

}
