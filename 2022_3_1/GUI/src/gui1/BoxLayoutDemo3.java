package gui1;



import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-04-16
 * Time: 15:33
 */
public class BoxLayoutDemo3 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        //创建一个水平的排列组件的Box
        Box hBox= Box.createHorizontalBox();
        hBox.add(new Button("水平按钮1"));
        hBox.add(new Button("水平按钮2"));
        Box vBox= Box.createVerticalBox();
        vBox.add(new Button("垂直1"));
        vBox.add(new Button("垂直2"));
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox);
        frame.pack();
        frame.setVisible(true);
    }
}
