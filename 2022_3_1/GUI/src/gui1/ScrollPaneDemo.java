package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ��KC����
 * Date: 2022-04-16
 * Time: 12:14
 */
public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        ScrollPane sp=new ScrollPane();
        sp.add(new TextField("�������"));
        sp.add(new Button("������"));
        frame.add(sp);
        frame.setBounds(100,100,300,500);
        frame.setVisible(true);
    }
}
