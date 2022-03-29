package com.kuang.task2;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 9:22
 */
public class TextBorderLayout {
    public static void main(String[] args) {
        Frame frame=new Frame("TextBorderLayout");
        Button east=new Button("East");
        Button west=new Button("west");
        Button north=new Button("North");
        Button south=new Button("South");
        Button center=new Button("Center");

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
