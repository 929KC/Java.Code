package leibulei4;

public class Outer {
	public void method() {
//        	  new Inner() {
//        		  public void show() {
//        			  System.out.println("�����ಿ��");
//        		  }
//        	  };
//        	  new Inner() {
//        		  public void show() {
//        			  System.out.println("�����ಿ��");
//        		  }
//        	  }.show();
//		 new Inner() {
//   		  public void show() {
//   			  System.out.println("�����ಿ��");
//   		  }
//   	  }.show();
//   	  
//   	 new Inner() {
//		  public void show() {
//			  System.out.println("�����ಿ��");
//		  }
//	  }.show();
	Inner i=new Inner() {
   		  public void show() {
   			  System.out.println("�����ಿ��");
   		  }
   	  };
   	  i.show();
   	  i.show();
          }
}
