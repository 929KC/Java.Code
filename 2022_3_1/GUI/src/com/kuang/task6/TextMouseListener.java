package com.kuang.task6;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 13:58
 */
public class TextMouseListener {
    public static void main(String[] args) {
        MyFrame m=new MyFrame("画图");
    }
}

class MyFrame extends Frame {
    //画画需要画笔，需要监听鼠标的当前位置，需要集合来存储这个点
    ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(200, 200, 400, 300);
        //存放鼠标的点
        points =new ArrayList<>();
        setVisible(true);
        //鼠标监听器，正对这个窗口
        this.addMouseListener(new MyMouseListener());
    }

    public void paint(Graphics g) {
        //画画，监听鼠标的事件
        Iterator in = points.iterator();
        while (in.hasNext()) {
            Point point = (Point) in.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    public void addPaint(Point point) {
        points.add(point);
    }

    private class MyMouseListener extends MouseAdapter {
        //鼠标。按下，弹起，按住不放
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();
            //这个我们点击的时候，就会在界面上产生一个点
            //这个点就是鼠标的点
            frame.addPaint(new Point(e.getX(), e.getY()));
            frame.repaint();
        }
    }

}
