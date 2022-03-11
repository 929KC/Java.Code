package XunHuan;

public class Demo_4 {

	public static void main(String[] args) {
			int i = 0;
		
		while(i <= 20){
			i++;
			/*****start*****/
			if( i%2==0 ){
                System.out.println( i + "是偶数");
			continue;
            
			}
			System.out.println(i + "是奇数");
			
            if( i==13    ) {
            	System.out.println(i + "是奇数");
            	break;
            }
			
			/*****end*****/
		}

	}

}
