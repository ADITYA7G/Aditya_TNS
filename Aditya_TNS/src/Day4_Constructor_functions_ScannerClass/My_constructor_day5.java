package Day4_Constructor_functions_ScannerClass;

public class My_constructor_day5 {
	public My_constructor_day5() {
		System.out.println("Default constructor");
	}
	public My_constructor_day5(int id,String Name,int age) {
		System.out.println("Parameterised constructor");
		System.out.println(id + " " + Name + " " + age);
	}
	
	public static void main(String [] args) {
		My_constructor_day5 obj1 = new My_constructor_day5();
		My_constructor_day5 obj2 = new My_constructor_day5(10,"My Name",456);
	}
}
