package System.out;

public abstract class Pet {
	private String name;
	private String sex;
       
	
	public Pet(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSex(String sex) {
		this.name = sex;
	}

	public String getSex() {
		return sex;
	}

	public abstract void talk();

	public abstract void eat();

}
