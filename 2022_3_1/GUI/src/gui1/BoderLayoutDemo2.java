package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ��KC����
 * Date: 2022-04-16
 * Time: 13:20
 */
public class BoderLayoutDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout(20,10));
        frame.add(new Button("���䰴ť��"),BorderLayout.NORTH);
        frame.add(new Button("�ϼ䰴ť��"),BorderLayout.SOUTH);//ֱ�Ӽ��뵽�����У�ֻ�����һ�������Ч
        Panel panel = new Panel();
        panel.add(new Button("�м䰴ť��"));
        panel.add(new TextField("�����ı���"));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
