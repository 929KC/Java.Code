package inthecsdn1;

import java.util.Scanner;

public class TestBlm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		double height=0;
//		double weight=0;
//		double bim=0;
		System.out.println("������������أ�");
		//double  weight=sc.nextDouble();
		double   weight=new Scanner(System.in).nextDouble();
		System.out.println("�����������ߣ�");
	    double	 height=new Scanner(System.in).nextDouble();
//	      bim=weight/(height*height);
//	      if(bim<18.5) {
//	    	  System.out.println("����");
//	      }else if(bim>18.5&&bim<22.9) {
//	    	  System.out.println("ƫ��");
//	      }else if(bim>23&&bim<29.9) {
//	    		  System.out.println("����");
//	      }else if(bim>30) {
//	    	  System.out.println("�ضȷ���");
//	      }else if(bim>40) {
//	    	  System.out.println("���ȷ���");
//	      }
		getBlm(weight,height);


	}
	public static void getBlm(double w,double h) {
		double bim=w/(h*h);
		String s="";
		if(bim<18.5) {
			s="����";
		}else if(bim<=22.9) {
			s="����";
		}else if(bim<=24.9) {
			s="ƫ��";
		}else if(bim<=29.9) {
			s="����";
		}else if(bim>30) {
			s="�ضȷ���";
		}else  {
			s="���ȷ���";
		}
		System.out.println("���BIMָ����"+bim);
		System.out.println("����������ڣ�"+s);
		
	}

}
