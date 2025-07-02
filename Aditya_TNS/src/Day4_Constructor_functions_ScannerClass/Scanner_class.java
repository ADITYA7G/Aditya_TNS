package Day4_Constructor_functions_ScannerClass;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		int id = sc.nextInt();
		System.out.println("ID = "+id);
		
		
		System.out.println("Enter your name :");
		String name= sc.next();
		System.out.println("Name = "+ name);
		
	}

}