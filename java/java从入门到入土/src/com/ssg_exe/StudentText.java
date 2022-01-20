package com.ssg_exe;

import java.util.Arrays;

/*
* 数组元素可以为任意类型，包括自定义的类类型
* Math.random()是令系统随机选取大于等于 0.0 且小于 1.0 的伪随机 double 值，是Java语言常用代码。
Math.random()*b 左边闭区间取值0，右边开区间取值b
Math.random()*b + 1 左边闭区间取值0+1，右边开区间取值b+1
* 引用类型的变量;只可能存储两类值：null或者地址值
* */
public class StudentText {
    public static void main(String[] args) {
            Student[] s=new Student[20];//数组对象
        for (int i=0;i<s.length;i++)
        {
            //给数组组元素赋值
            s[i]=new Student();
            //给Student对象的属性赋值
            s[i].number=(i+1);
            //年级[1,6]
            s[i].state=(int)(Math.random()*(6-1+1)+1);
            //成绩[0,100]
            s[i].score=(int)(Math.random()*(100-0+1));

        }
        //遍历学生
        for (int i=0;i< s.length;i++){
           /* System.out.println(s[i].number+","+s[i].state+","+s[i].score);*/
            System.out.println(s[i].info());
        }
        System.out.println("*************************");
        for (int i = 0; i < s.length; i++) {
            if(s[i].state==3){
                System.out.println(s[i].info());
            }
        }
        System.out.println("*************************");
        for (int i = 0; i <s.length-1 ; i++) {
            for(int j=0;j<s.length-1-i;j++){
                if(s[j].score>s[j+1].score){
                    Student temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        for (int i=0;i< s.length;i++){
            /* System.out.println(s[i].number+","+s[i].state+","+s[i].score);*/
            System.out.println(s[i].info());
        }

    }

}
