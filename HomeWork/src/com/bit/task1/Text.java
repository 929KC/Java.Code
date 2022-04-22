package com.bit.task1;


import java.util.Random;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();
       int guess=rand.nextInt(100);//[0,100);
        while (true) {
            System.out.println("请输入你猜的数：");
            int num=sc.nextInt();
            if(guess<num){
                System.out.println("你猜的数大了");
            }else if(guess>num){
                System.out.println("你猜的数小了");
            }else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
