package intheheima3;

public class StringDemo {

	public static void main(String[] args) {
		String  s1=new String();
		System.out.println("s1:"+s1);
		char [] arr= {'a','b','c' };
		String s2=new  String(arr);
		System.out.println("s2:"+s2);
		
		byte [] bty= {97,98,99};
		String s3=new String(bty);
		System.out.println("s3:"+s3);
		String s="abc";
		System.out.println(s);
				
}
}