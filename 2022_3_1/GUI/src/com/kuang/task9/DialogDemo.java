package com.kuang.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-29
 * Time: 17:17
 */
public class DialogDemo extends JFrame {

    public DialogDemo() {
        this.setVisible(true);
        this.setSize(700, 700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame 放东西
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);
        //按钮
        JButton button = new JButton("点击弹出一个对话框");
        button.setBounds(30, 30, 200, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialogDemo();
            }
        });
        container.add(button);
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

//弹窗
class MyDialogDemo extends JDialog {
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);
      //  this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(new Label("大哥教您学java"));
    }

}
