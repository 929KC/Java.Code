package inthecsdn1;

import java.util.Scanner;

public class TestBlm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		double height=0;
//		double weight=0;
//		double bim=0;
		System.out.println("请输入你的体重：");
		//double  weight=sc.nextDouble();
		double   weight=new Scanner(System.in).nextDouble();
		System.out.println("请输入你的身高：");
	    double	 height=new Scanner(System.in).nextDouble();
//	      bim=weight/(height*height);
//	      if(bim<18.5) {
//	    	  System.out.println("过轻");
//	      }else if(bim>18.5&&bim<22.9) {
//	    	  System.out.println("偏胖");
//	      }else if(bim>23&&bim<29.9) {
//	    		  System.out.println("肥胖");
//	      }else if(bim>30) {
//	    	  System.out.println("重度肥胖");
//	      }else if(bim>40) {
//	    	  System.out.println("极度肥胖");
//	      }
		getBlm(weight,height);


	}
	public static void getBlm(double w,double h) {
		double bim=w/(h*h);
		String s="";
		if(bim<18.5) {
			s="过轻";
		}else if(bim<=22.9) {
			s="正常";
		}else if(bim<=24.9) {
			s="偏胖";
		}else if(bim<=29.9) {
			s="肥胖";
		}else if(bim>30) {
			s="重度肥胖";
		}else  {
			s="极度肥胖";
		}
		System.out.println("你的BIM指数："+bim);
		System.out.println("你的体重属于："+s);
		
	}

}
