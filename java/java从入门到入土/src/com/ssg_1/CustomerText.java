package com.ssg_1;
/*
*       方法：描述类应该有的功能
*       比如：Math类：sqrt()\random()
*           Scanner类：nextXxx()
*       举例：
*   public void eat(){}
*   public void eat(int hour){}
*   public String grtName(){}
*   public String getName(String nation){}
*方法的声明：权限修饰符 返回值类型  方法名 菜名 （形参列表）{原材料
*
*   方法体 炒菜过程 方法功能的体现
*}
* 说明：默认的权限修饰符先都使用public
* java规定四种修饰符：private ，pubic ,protected,,默认
* 返回值类型：有返回值VS没有返回值
* 如果有返回值，则必须在方法声明时，指定返回值的类型，同时，方法中，需要使用
* return 关键字来返回指定类型的变量或者常量：return+数据
* 无返回值：则方法声明时，使用void表示，无返回值就不使用return，如果使用，只能return ;表示此方法结束的意思
*
* return 关键字的使用
*           1.作用范围
*           2,作用：结束方法
*               对有返回值类型的方法，使用return 数据 方法返回所需的数据
*               return 关键字后不可以声明执行语句
* */
public class CustomerText {
    public static void main(String[] args) {
        Customer c=new Customer();

    }
}
class  Customer{
        String name;
        int age;
       boolean IsMale;

    public static void eat(){
        System.out.println("客户吃饭");
    }

    public static String getName(){
      // return name;
        return "叶秋寒";
    }

    public  static void sleep(int hour){
        System.out.println("客户睡了"+hour+"个小时");

    }

    public String getNation(String nation){
        String info="我的国籍是"+nation;
        return info;
    }

}