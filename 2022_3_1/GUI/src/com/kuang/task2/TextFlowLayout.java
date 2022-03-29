package com.kuang.task2;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 9:29
 */
public class TextFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button btn2 = new Button("button2");
        Button btn3 = new Button("button3");
        Button btn1 = new Button("button1");

        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(200,200);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.setVisible(true);
    }
}
