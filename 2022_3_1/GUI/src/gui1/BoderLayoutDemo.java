package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-16
 * Time: 12:48
 */
public class BoderLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout(12,12));
        frame.add(new Button("北边按钮"),BorderLayout.NORTH);
        frame.add(new Button("南边按钮"),BorderLayout.SOUTH);
        frame.add(new Button("西边按钮"),BorderLayout.WEST);
        frame.add(new Button("东边按钮"),BorderLayout.EAST);
        frame.add(new Button("中间按钮"),BorderLayout.CENTER);
        frame.pack();//自动调整大小
        frame.setVisible(true);



    }
}
