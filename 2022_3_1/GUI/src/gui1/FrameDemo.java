package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-16
 * Time: 11:41
 */
public class FrameDemo {
    public static void main(String[] args) {
        //创建窗口对象
        Frame frame = new Frame("我的第一个窗口");
        //设置大小
        frame.setSize(600,500);
        //设置窗口位置
        frame.setLocation(100,300);
        //设置窗口可见
        frame.setVisible(true);
    }

}
