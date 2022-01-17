package day_3;
/*
*
*
*
* */
public class CustomerText {
    public static void main(String[] args) {
        Customer c=new Customer();


    }
}

class   Customer {
    int age;
    String name;
    boolean isMale;
    public  static void eat(){
        System.out.println("我可以吃饭了");
    }
    public  static  void  talk(){
        System.out.println("我可以说英语");
    }
    public  static  String nation(){
        return "中国";
    }
    public static String getName(){

        return "叶秋涵";
    }


}