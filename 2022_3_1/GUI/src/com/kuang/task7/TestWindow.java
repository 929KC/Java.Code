package com.kuang.task7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 15:43
 */
public class TestWindow {
    public static void main(String[] args) {
    new WindowFrame();
    }
}

class WindowFrame extends Frame {

    public WindowFrame() {
        setBackground(Color.blue);
        setBounds(100, 100, 200, 200);
        setVisible(true);
      this.addWindowListener(new WindowAdapter() {

          @Override
          public void windowClosing(WindowEvent e) {
              System.out.println("windowClosing");
              System.exit(0);
          }

          @Override
          public void windowActivated(WindowEvent e) {
              WindowFrame source=( WindowFrame)e.getSource();
                source.setTitle("\"被激活了\"");
              System.out.println("windowActivated");
          }
      });
    }

}