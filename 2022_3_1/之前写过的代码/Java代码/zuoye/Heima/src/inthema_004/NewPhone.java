package inthema_004;

public class NewPhone extends phone{
//	public void Call (String name) {
//		System.out.println("����Ƶ����");
//    	
//		//System.out.println("��"+name+"��绰");
//		super.Call(name);
//    }
	//��鷽����д�Ƿ���ȷ@Override
	public void call(String name) {
		System.out.println("����Ƶ����");
		super.Call(name);
	}
}
