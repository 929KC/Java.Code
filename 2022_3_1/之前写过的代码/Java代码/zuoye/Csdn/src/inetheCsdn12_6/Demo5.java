package inetheCsdn12_6;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		 Scanner sc=new 	Scanner(System.in);
		 System.out.println("����������˰ǰ���ʣ�");
		 //2.����¼��˰ǰ����
	        int money = sc.nextInt();
	        //3.����Ӧ��˰���ֵĹ���
	        double before = money - (money*0.1) - 5000;
	        //4.�����˰����
	        double shui = 0;
	        //5.�����ݶȷ�Χ�����˰��ֵ
	        if(before > 0 && before <=3000){
	            shui = before * 0.03;
	        }else if(before > 3000 && before <=12000){
	            shui = 3000*0.03 + (before-3000) * 0.1;
	        }else if(before > 12000 && before <=25000){
	            shui = 3000*0.03 + 9000*0.1 +  (before-12000)*0.2;
	        }else if(before > 25000 && before <=35000){
	            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + (before-25000)*0.25;
	        }else if(before > 35000 && before <=55000){
	            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + (before-35000)*0.3;
	        }else if(before > 55000 && before <=80000){
	            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + (before-55000)*0.35;
	        }else if(before > 80000){
	            shui = 3000*0.03 + 9000*0.1 + 13000*0.2 + 10000*0.25 + 20000*0.3 + 25000*0.35 + (before-80000)*0.45;
	        }
	        //6.����˰����
	        double after = money - (money*0.1) - shui;
	        //7.��ӡ��˰��˰����
	        System.out.println("��������˰" + shui + "Ԫ");
	        System.out.println("˰����" + after + "Ԫ");
	}


}
