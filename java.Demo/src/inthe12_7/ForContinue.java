package inthe12_7;

public class ForContinue {

	public static void main(String[] args) {
		//��ӡ100���ڳ���β��Ϊ3,5,7��������
		
		for(int  i=1; i<=100; i++) {
			int y=i%10;
			if(y==1||y==3||y==5) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}
