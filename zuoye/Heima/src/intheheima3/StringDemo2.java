package intheheima3;

public class StringDemo2 {

	public static void main(String[] args) {
		//用构造方法得到对象
		char []  arr= {'a','b','c'};
		String s1=new String(arr);
		String s2=new String(arr);
		//用赋值方法得到对象
		String s3="abc";
		String s4="abc";
		//比较字符串地址值是否相同
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		//比较字符串的内容是否相同
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
}
}