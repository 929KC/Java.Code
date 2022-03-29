package com.kuang.shen2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 8:43
 */
public class TtextPanel {
    public static void main(String[] args) {

        Frame frame = new Frame();//窗口
        Panel panel = new Panel();//面板
        //设置布局
        frame.setLayout(null);
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(40, 161, 35));
        //设置panel的坐标
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(193, 15, 60));
        //frame.add(panel),添加到窗口
        frame.add(panel);
        frame.setVisible(true);

        //监听事件关闭窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
             System.exit(0);//结束程序
            }
        });

    }
}
