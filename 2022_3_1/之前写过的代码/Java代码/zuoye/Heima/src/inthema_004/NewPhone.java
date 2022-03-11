package inthema_004;

public class NewPhone extends phone{
//	public void Call (String name) {
//		System.out.println("打开视频功能");
//    	
//		//System.out.println("给"+name+"打电话");
//		super.Call(name);
//    }
	//检查方法重写是否正确@Override
	public void call(String name) {
		System.out.println("打开视频功能");
		super.Call(name);
	}
}
