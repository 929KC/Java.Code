package inthehieanli;

public class pingpangCoach extends Coach implements SpeakEnglish{
	public pingpangCoach() {

	}

	public pingpangCoach(String name, int age) {
		 	super(name,age);
	}

	public void eat() {
		System.out.println("���ڳ����� �Ȱ�����");
	}

	public void teach() {
		System.out.println("���ڽ�ѧ������ͽ���");
	}
	public  void  speak() {
		System.out.println("ƹ�������˵Ӣ��");
	}
}
