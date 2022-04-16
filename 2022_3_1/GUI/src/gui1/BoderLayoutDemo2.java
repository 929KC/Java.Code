package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-16
 * Time: 13:20
 */
public class BoderLayoutDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout(20,10));
        frame.add(new Button("北间按钮："),BorderLayout.NORTH);
        frame.add(new Button("南间按钮："),BorderLayout.SOUTH);//直接加入到窗口中，只有最后一个组件有效
        Panel panel = new Panel();
        panel.add(new Button("中间按钮："));
        panel.add(new TextField("测试文本额"));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
