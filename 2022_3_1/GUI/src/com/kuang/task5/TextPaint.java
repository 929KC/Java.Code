package com.kuang.task5;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 13:04
 */
public class TextPaint {
    public static void main(String[] args) {
      MyPaint m=new MyPaint();
      m.loadFrame();
    }
}

class MyPaint extends Frame {
    public void loadFrame() {
        setBounds(200, 200, 600, 500);
        setVisible(true);
    }

    //画笔
    @Override
    public void paint(Graphics g) {
        //画笔，有颜色，
        g.setColor(Color.red);
        g.drawOval(100, 100, 100, 100);
        g.setColor(Color.GREEN);
        g.fillOval(200, 200, 200, 200);

    }
}