package com.kuang.task9;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 21:36
 */
public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;

    public IconDemo() {
    }

    public IconDemo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {
        IconDemo iconDemo = new IconDemo(15, 15);

        JLabel label = new JLabel("kc", iconDemo, SwingConstants.CENTER);
        Container container = this.getContentPane();
        container.add(label);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
    new IconDemo().init();
    }


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
