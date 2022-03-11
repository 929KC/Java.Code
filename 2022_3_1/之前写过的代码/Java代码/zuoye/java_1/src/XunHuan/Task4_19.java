package XunHuan;                                                                                                                                                                                                                                                                                                                                                                                                                                             
public class Task4_19 {
	public static void main(String[] args) {
		int year, sum = 0, i = 0;
		for (year = 2000; year <= 2100; year++) {
			if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.printf("%d", year);
				System.out.print("\t");
				sum++;
				i++;
				
			}
			if (i == 5) {
				System.out.println("");
				i=0;
			
			}
		} // 07黄茂荣
		System.out.println("总共输出" + sum + "个闰年");
	}
}
