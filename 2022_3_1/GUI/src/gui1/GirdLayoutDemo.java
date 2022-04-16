package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author £ºKCÏôº®
 * Date: 2022-04-16
 * Time: 13:32
 */
public class GirdLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("¼ÆËãÆ÷");
        Panel p1 = new Panel();
        p1.add(new TextField(30));
        frame.add(p1, BorderLayout.NORTH);
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3, 5, 4, 4));
        for (int i = 0; i < 10; i++) {
        p2.add(new Button(i+""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        frame.add(p2);
        frame.pack();
        frame.setVisible(true);
    }
}
