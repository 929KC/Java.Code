package cn.itcast;

public class Fu {
      private void show1 () {
    	  System.out.println("private");
      }
      void show2() { 
    	  System.out.println("Ĭ��"); 
      }
      protected void show3() {
    	  System.out.println("protected");
      }
      public  void show4() {
    	  System.out.println("public");
      }
      public static void main(String [] args) {
    	  Fu f=new Fu();
    	  f.show1();
    	  f.show2();
    	  f.show3();
    	  f.show4();
    	  
      }
      
}
