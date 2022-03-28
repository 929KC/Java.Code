package com.kuang.shen;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-28
 * Time: 22:25
 */
public class MyFrame extends Frame {
        static  int id=0;
        public MyFrame(int x,int y,int w,int h,Color color){
            super("Myframe"+(++id));
            setBackground(color);
            setBounds(x,y,w,h);
            setVisible(true);
        }
}
