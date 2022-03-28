package com.kuang.shen;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-28
 * Time: 19:04
 */
public class FrameText {
    public static void main(String[] args) {
        //图形界面
        Frame f = new Frame("java的图形界面");
        //设置可见性
        f.setVisible(true);
        //设置窗口大小
        f.setSize(400, 400);
        //设置背景颜色
        f.setBackground(new Color(85, 150, 68));
        //弹出初始化的设置
        f.setLocation(200,200);
        //设置大小固定
        //f.setResizable(false);
    }
}
