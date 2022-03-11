package inthetouge_1;

public abstract  class Person {
	
	private String name;
	private int age;
    private String occupation;
	public Person() {

	}

	public Person(String name, int age,String occupation ) {
		this.name = name;
		this.age = age;
		this.occupation= occupation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOccupation() {
		return occupation;
	}
	public abstract void talk();
	 
}
