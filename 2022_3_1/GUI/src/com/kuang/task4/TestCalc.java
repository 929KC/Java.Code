package com.kuang.task4;


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
 * Time: 11:43
 */
public class TestCalc {
    public static void main(String[] args) {
        new Caculator().loadFrame();
    }
}

//计算器类
class Caculator extends Frame {

    TextField num1, num2, num3;

    public void loadFrame() {
        //三个文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);
        //一个按钮
        Button button = new Button("=");
        button.addActionListener(new MyActionListener());
        //一个标签
        Label label = new Label("+");
        //布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }

    //监听器类
    private class MyActionListener implements ActionListener {

        //  private TextField num1, num2, num3;
        //获取计算器的对象
        Caculator caculator = null;

        /* public MyActionListener(TextField num1,TextField num2,TextField num3){
             this.num1=num1;
             this.num2=num2;
             this.num3=num3;
         }*/
   /*     public MyActionListener(Caculator caculator) {
            this.caculator = caculator;
        }
*/


        @Override
        public void actionPerformed(ActionEvent e) {
            //获得加数与被加数
            //int n1 = Integer.parseInt(num1.getText());
            //int n2 = Integer.parseInt(num2.getText());
            //相加
            //num3.setText("" + (n1 + n2));
            //清除
            //num1.setText("");
            //num2.setText("");

            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1 + n2));
            num1.setText("");
            num2.setText("");
        }
    }

}

