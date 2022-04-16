package gui1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ��KC����
 * Date: 2022-04-16
 * Time: 14:36
 */
public class GardLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("����CardLayout");
        Panel p1 = new Panel();
        CardLayout cardLayout = new CardLayout();
        p1.setLayout(cardLayout);
        String[] names = {"��һ��", "�ڶ���", "������", "������", "������"};
        for (int i = 0; i < names.length; i++) {
            p1.add(names[i],new Button(names[i]));
        }
        frame.add(p1);
        Panel p2 = new Panel();
        Button b1 = new Button("��һ��");
        Button b2 = new Button("��һ��");
        Button b3 = new Button("��һ��");
        Button b4 = new Button("���һ��");
        Button b5 = new Button("������");
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                switch (actionCommand) {
                    case "��һ��":
                        cardLayout.previous(p1);
                        break;
                    case "��һ��":
                        cardLayout.next(p1);
                        break;
                    case "��һ��":
                        cardLayout.first(p1);
                        break;
                    case "���һ��":
                        cardLayout.last(p1);
                        break;
                    case "������":
                        cardLayout.show(p1,"������");
                        break;
                }
            }
        };

        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        frame.add(p2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
