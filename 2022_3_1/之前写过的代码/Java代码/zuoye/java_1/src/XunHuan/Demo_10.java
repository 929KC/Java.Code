package XunHuan;

public class Demo_10 {

	public static void main(String[] args) {
		          int n=0;
              for(int i=1; i<=100; i++) {
            	  if(i%3==0) {
            		  continue;
            	  } else {
            		  System.out.print(i);
            		  System.out.print("\t");
            		  n++;
            	  }
            		  if(n%5==0) {
            	      System.out.println("");
            		  }
            	  }
              }
	// 07��ï��
}


