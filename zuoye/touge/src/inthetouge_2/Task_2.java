package inthetouge_2;

public class Task_2 {

	public static void main(String[] args) {
		for(int x=999; x>=100; x--) {
			int a=x%10;
			int b=x/10%10;
			int c=x/100%10;
			if((a*a*a)+(b*b*b)+(c*c*c)==x) {
				System.out.println(x+"是水仙花数");
			}
			
			
		}

	}

}
