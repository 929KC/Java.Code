package inthe12_7;

public class ForBreak {

	public static void main(String[] args) {
		//������������,����ӡ��һ�γ��ִ���0.999 ʱ�Ĵ��������ɵ������
		
		for(int i=1; ; i++) {
			double d = Math.random();
			if(d>0.999) {
				
				System.out.println("��"+i+"�β����˴���0.999�������Ϊ��"+d);
			}
		}
		

	}

}
