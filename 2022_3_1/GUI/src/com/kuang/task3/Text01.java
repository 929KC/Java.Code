package com.kuang.task3;

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
 * Time: 10:21
 */
public class Text01 {
    public static void main(String[] args) {
        //启动
        new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);
        //监听文本框的文字
        MyActionListener mal=new MyActionListener();
        //按下enter就会触发这个输入框的内容
        textField.addActionListener(mal);
        //设置替换编码
        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }

}


class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field =(TextField) e.getSource();//获得资源返回object
        System.out.println(field.getText());//获得文本框内容
        field.setText("");//设置文本内容为空
    }
}
