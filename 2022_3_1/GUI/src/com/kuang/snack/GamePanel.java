package com.kuang.snack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-30
 * Time: 13:44
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    //绘制面板，使用画笔画
    //定义蛇的数据结构
    int length;
    int[] snackX = new int[600];
    int[] snackY = new int[500];
    String fx;
    boolean isStart = false;
    Timer time = new Timer(100, this);//单位毫秒
    int foodx;
    int foody;
    Random rand = new Random();

    public GamePanel() {
        init();
        //获得鼠标的监听事件
        this.setFocusable(true);//获得焦点事件
        this.addKeyListener(this);//键盘监听
        time.start();//游戏开始计时器就启动
    }

    //初始化
    public void init() {
        /*length = 3;
        snackX[0] = 100;
        snackY[0] = 100;
        snackX[1] = 75;
        snackY[0] = 100;
        snackX[2] = 50;
        snackY[0] = 100;
        fx = "R";*/
        length = 3;
        snackX[0] = 100;
        snackY[0] = 100;
        snackX[1] = 75;
        snackY[1] = 100;
        snackX[2] = 50;
        snackY[2] = 100;
        fx = "R";
        foodx = 25 + 25 * rand.nextInt(34);
        foody = 75 + 25 * rand.nextInt(24);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        this.setBackground(Color.BLACK);
        //绘制静态面板
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11);//logo
        g.fillRect(25, 75, 850, 600);//游戏界面
        //画蛇
        Data.right.paintIcon(this, g, snackX[0], snackY[0]);
        Data.body.paintIcon(this, g, snackX[1], snackY[1]);
        Data.body.paintIcon(this, g, snackX[2], snackY[2]);
        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snackX[0], snackY[0]);
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this, g, snackX[0], snackY[0]);
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this, g, snackX[0], snackY[0]);
        } else if (fx.equals("D")) {
            Data.down.paintIcon(this, g, snackX[0], snackY[0]);
        }

        for (int j = 1; j < length; j++) {
            Data.body.paintIcon(this, g, snackX[j], snackY[j]);
        }

        if (isStart == false) {
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 300, 300);
        }

        Data.food.paintIcon(this, g, foodx, foody);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {//键盘按压响应
        int KeyCode = e.getKeyCode();//获得键盘的按键是哪一个
        if (KeyCode == KeyEvent.VK_SPACE) {
            isStart = !isStart;
            repaint();
        }

        //小蛇移动
        if (KeyCode == KeyEvent.VK_UP) {
            fx = "U";
        } else if (KeyCode == KeyEvent.VK_LEFT) {
            fx = "L";
        } else if (KeyCode == KeyEvent.VK_RIGHT) {
            fx = "R";
        } else if (KeyCode == KeyEvent.VK_DOWN) {
            fx = "D";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart) {//如果游戏时开始状态,就让小蛇动
            if (snackX[0] == foodx && snackY[0] == foody) {
                length++;
                foodx = 25 + 25 * rand.nextInt(34);
                foody = 75 + 25 * rand.nextInt(24);
            }
            //右移
            for (int i = length - 1; i > 0; i--) {//后一节移位到前一节
                snackX[i] = snackX[i - 1];
                snackY[i] = snackY[i - 1];
            }
            //走向
            if (fx.equals("R")) {
                snackX[0] = snackX[0] + 25;
                if (snackX[0] > 850) {
                    snackX[0] = 25;
                }
            } else if (fx.equals("L")) {
                snackX[0] = snackX[0] - 25;
                if (snackX[0] < 25) {
                    snackX[0] = 850;
                }
            } else if (fx.equals("U")) {
                snackY[0] = snackY[0] - 25;
                if (snackY[0] < 75) {
                    snackY[0] = 650;
                }
            } else if (fx.equals("D")) {
                snackY[0] = snackY[0] + 25;//边界判断
                if (snackY[0] > 650) {
                    snackY[0] = 75;
                }
            }

            repaint();
        }
        time.start();
    }
}
