package intheheima_1;

public class PhoneDemo {

	public static void main(String[] args) {
	  Phone p=new Phone();
	  //��Ա����
	  System.out.println(p.brand);
	  System.out.println(p.price);
	  //����Ա������ֵ
	  p.brand="��Ϊ";
	  p.price=9999;
	  System.out.println(p.brand);
	  System.out.println(p.price);
	  //ʹ�ó�Ա����
	  p.call();
	  p.call();

	}

}
