package intheheima3;

public class StringDemo2 {

	public static void main(String[] args) {
		//�ù��췽���õ�����
		char []  arr= {'a','b','c'};
		String s1=new String(arr);
		String s2=new String(arr);
		//�ø�ֵ�����õ�����
		String s3="abc";
		String s4="abc";
		//�Ƚ��ַ�����ֵַ�Ƿ���ͬ
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		//�Ƚ��ַ����������Ƿ���ͬ
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
}
}