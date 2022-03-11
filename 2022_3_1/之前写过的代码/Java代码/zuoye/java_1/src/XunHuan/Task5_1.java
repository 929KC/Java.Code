package XunHuan;
public class Task5_1 {
	public static void main(String[] args) {
		Task5_1 t=new Task5_1();
		t.getSan();
		t.getSan();
		t.getSan();
	}
   public  void   getSan() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//07»ÆÃ¯ÈÙ
   }
}
