package com.ssg_exe;

public class Person {
    String name;
    int age;
    String sex;
    public static  void study(){
        System.out.println("好好学习，天天向上！");
    }
    public  void showAge(){
        System.out.println("年龄是"+age+"岁");

    }
    public   int  addAge(int i){
             age +=i;
              return age;
    }
}
