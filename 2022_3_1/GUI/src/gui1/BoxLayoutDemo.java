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
 * Time: 15:28
 */
public class BoxLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //����frame����
        BoxLayout boxlayout = new BoxLayout(frame,BoxLayout.Y_AXIS);
        frame.setLayout(boxlayout);
        frame.add(new Button("��ť1"));
        frame.add(new Button("��ť2"));
        frame.pack();
        frame.setVisible(true);
    }
}
