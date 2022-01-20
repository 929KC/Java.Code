package com.ssg_exe;

public class PersonText {
    public static void main(String[] args) {
        Person p=new Person();
        p.age=19;
        p.sex="男";
        p.name="叶秋寒";
        p.addAge(2);
        p.study();
        p.showAge();
        System.out.println(p.name+"今年"+p.age+"岁了"+"是一名男性");
        System.out.println("*************************************");
        Person p2=new Person();
        System.out.println(p2.sex);
        System.out.println(p2.age);
        System.out.println(p2.name);
        p2.addAge(2);
        p2.showAge();

    }
}
