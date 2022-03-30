package com.kuang.snack;

import javax.swing.*;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * truth:talk  is cheap, show me the code.
 *
 * @Author ：KC萧寒
 * Date: 2022-03-30
 * Time: 13:46
 */
public class Data {
    public static URL headerURL = Data.class.getResource("/static/logo.jpg");
    public static ImageIcon header = new ImageIcon(headerURL);

    public static URL upURL = Data.class.getResource("/static/up.jpg");
    public static URL downURL = Data.class.getResource("/static/down.jpg");
    public static URL leftURL = Data.class.getResource("/static/left.jpg");
    public static URL rightURL = Data.class.getResource("/static/right.jpg");
    public static ImageIcon right = new ImageIcon(rightURL);
    public static ImageIcon down = new ImageIcon(downURL);
    public static ImageIcon up = new ImageIcon(upURL);
    public static ImageIcon left = new ImageIcon(leftURL);


    public static URL bodyURL = Data.class.getResource("/static/body.jpg");
    public static ImageIcon body = new ImageIcon(bodyURL);

    public static URL foodURL = Data.class.getResource("/static/food.jpg");
    public static ImageIcon food = new ImageIcon(foodURL);

}
