package String;

public class StringDemo {

    public static void main(String[] args) {
        //方式1：直接使用双引号得到字符串对象
        String name="我是叶子秋";
        System.out.println(name);

    //方式2
    //public String()：创建一个空白的对象内容
        String s1=new String();
        System.out.println(s1);


    //2.public String（String）:根据传入的字符串内容，来创建字符串对象
        String s2=new String("我是叶秋涵");
        System.out.println(s2);
    //3.public String(char[] c) :根据字符数组的内容 来创建字符串对象
        char arr[]={'a','b','c'};
        String s3=new String(arr);
        System.out.println(s3);
    //4.public String(byte[]  b):根据字节数组的内容 来创建对象
        byte arr2 []={97,98,99,65,66,67};
        String s4=new String(arr2);
        System.out.println(s4);
        System.out.println("************");
    }
}
