package leibulei4;

public class Outer {
	public void method() {
//        	  new Inner() {
//        		  public void show() {
//        			  System.out.println("匿名类部类");
//        		  }
//        	  };
//        	  new Inner() {
//        		  public void show() {
//        			  System.out.println("匿名类部类");
//        		  }
//        	  }.show();
//		 new Inner() {
//   		  public void show() {
//   			  System.out.println("匿名类部类");
//   		  }
//   	  }.show();
//   	  
//   	 new Inner() {
//		  public void show() {
//			  System.out.println("匿名类部类");
//		  }
//	  }.show();
	Inner i=new Inner() {
   		  public void show() {
   			  System.out.println("匿名类部类");
   		  }
   	  };
   	  i.show();
   	  i.show();
          }
}
