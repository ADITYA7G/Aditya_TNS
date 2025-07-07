package Day5_OOPS_implementaions;
import java.util.*;
public class Assignment_encapsulation_constructor {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Assignment_encapsulation_constructor(Assignment_encapsulation_constructor temp) {
		this.id = temp.getId();
		this.name = temp.getName();
		this.age=temp.getAge();
		System.out.println("id"+" "+id+" "+"name"+" "+name+" "+"age"+" "+age);
	}
	public Assignment_encapsulation_constructor() {}

	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Assignment_encapsulation_constructor ob = new Assignment_encapsulation_constructor();
		System.out.println("Enter the id");
		ob.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the name");
		ob.setName(sc.nextLine());
		System.out.println("Enter the age");
		ob.setAge(sc.nextInt());
	}
}


