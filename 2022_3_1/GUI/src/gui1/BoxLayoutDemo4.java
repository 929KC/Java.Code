package gui1;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ��KC����
 * Date: 2022-04-16
 * Time: 15:40
 */
public class BoxLayoutDemo4 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Box hBox=Box.createHorizontalBox();
        hBox.add(new Button("ˮƽ��ť1"));
        hBox.add(new Button("ˮƽ��ť2"));
        hBox.add(Box.createHorizontalStrut(30));
        Box vBox= Box.createVerticalBox();
        vBox.add(new Button("��ֱ1"));
        vBox.add(new Button("��ֱ2"));
        vBox.add(Box.createHorizontalStrut(30));
        vBox.add(new Button("��ֱ3"));
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox);
        frame.pack();
        frame.setVisible(true);

    }
}
