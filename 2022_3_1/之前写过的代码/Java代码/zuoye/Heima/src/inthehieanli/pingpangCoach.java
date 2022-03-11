package inthehieanli;

public class pingpangCoach extends Coach implements SpeakEnglish{
	public pingpangCoach() {

	}

	public pingpangCoach(String name, int age) {
		 	super(name,age);
	}

	public void eat() {
		System.out.println("教授吃猪肉 喝白米粥");
	}

	public void teach() {
		System.out.println("教授教学生发球和接球");
	}
	public  void  speak() {
		System.out.println("乒乓球教练说英语");
	}
}
