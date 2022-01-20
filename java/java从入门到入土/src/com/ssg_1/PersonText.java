
package com.ssg_1;
/*
* 一，设计类
*  属性=成员变量=field=域，字段
* 方法=成员方法=函数=method
* 创建类的对象=类的实例化=实例化累
*
*面向对象的两个要素
* 类：对一类事物的描述，是抽象的，概念上的定义
* 对象:是实际存在的该类事物的每个个体，因此也称为实例
* >面向对象程序设计的重点是类的设计
* >设计类就是设计类的成员
*面向对象的使用(面向对象思想的落地)
* 1.创建类，设计类的成员
* 2.创建类的对象
* 3.通过“对象.属性”或者"对象.方法"调用对象的结构
* 三，如果创建一个多类的多个对象，则每个对象拥有一套类的属性(static)
* */
public class PersonText {
    public static void main(String[] args) {
           //创建对象即实例化
            Person p=new Person();//new 在内存中开辟空间，地址值传给p,Person可以看做变量，p即变量名
            //调用对象结构，属性，方法
            //调用属性，“对象.属性”
        p.age=18;
        System.out.println(p.age+"岁");
        p.isMale=true;
        p.name="叶秋涵";
        System.out.println(p.name);
    // 调用方法
        p.eat();
        p.talk("chinese");
        p.sleep();
        System.out.println("***************");
        Person p2=new Person();
        System.out.println(p2.age);
        System.out.println(p2.isMale);
        System.out.println(p2.name);
        System.out.println("*************");
        Person p3=p;//将p的地址值赋给p3，导致p与p3指向堆空间中的同一对象
        System.out.println(p3.name);


    }
}
 class Person{
    //属性
     String name;
     int age=1;
     boolean isMale;
     //方法
public static  void eat()
{
    System.out.println("我可以吃东西！");

}
public static  void talk(String langues){

    System.out.println("我可以说"+langues);

}
public static void sleep(){

    System.out.println("我可以睡觉");
}

 }

