package Day5_OOPS_implementaions;

public class Serial_number {
	private int serialNum;
	private String names;
	private int age;
	//getter and setter
	public void set_serial_number(int serialNum) {
		//'this' keyword is useful to differentiate local variable and instance variable
		this.serialNum = serialNum;
	}
	public int getserialNum() {
		return serialNum;
	}
	public void setName(String names) {
		this.names = names;
	}
	public String getName() {
		return names;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Serial_number [serialNum=" + serialNum + ", name=" + names + ", age=" + age + "]";
	}
	
}
