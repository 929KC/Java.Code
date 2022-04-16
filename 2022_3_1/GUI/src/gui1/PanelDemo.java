package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-16
 * Time: 11:50
 */
public class PanelDemo {
    public static void main(String[] args) {
        //创建窗口
        Frame frame = new Frame();
        //创建面板
        Panel panel = new Panel();
        //给面板加文本框
        panel.add(new TextField("你好世界"));
        panel.add(new Button("确定"));
        //将面板加入到窗口
        frame.add(panel);
        //设置窗口位置及大小
        frame.setBounds(100,100,300,500);
        frame.setVisible(true);
    }
}
