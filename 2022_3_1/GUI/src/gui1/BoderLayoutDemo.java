package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ��KC����
 * Date: 2022-04-16
 * Time: 12:48
 */
public class BoderLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new BorderLayout(12,12));
        frame.add(new Button("���߰�ť"),BorderLayout.NORTH);
        frame.add(new Button("�ϱ߰�ť"),BorderLayout.SOUTH);
        frame.add(new Button("���߰�ť"),BorderLayout.WEST);
        frame.add(new Button("���߰�ť"),BorderLayout.EAST);
        frame.add(new Button("�м䰴ť"),BorderLayout.CENTER);
        frame.pack();//�Զ�������С
        frame.setVisible(true);



    }
}
