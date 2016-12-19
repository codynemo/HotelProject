package src.hotel;

public abstract class Human {
	protected String first_name, last_name;
	protected int age;
	protected long id;

	public Human(String first_name, String last_name, long id) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Name: " + first_name + " " + last_name + "\n" + "ID: " + id;
	}

	public String FiletoString() {
		// TODO Auto-generated method stub
		return String.format("%20s//*&//%20s//*&//%15d", first_name,last_name,id);
	}

}
