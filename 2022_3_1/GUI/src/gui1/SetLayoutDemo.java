package gui1;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author £ºKCÏôº®
 * Date: 2022-04-16
 * Time: 12:28
 */
public class SetLayoutDemo {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,12,12));
        for (int i =1;i<=100;i++){
            frame.add(new Button("°´Å¥"+i));
        }
        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
    }
}
