package XunHuan;

public class Demo_8 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+j*i);
				
				System.out.print("\t");
			}
			System.out.println("\t");
		}
	}

}
