package Day3_Different_statements;

public class Condition {
	public static void main(String [] args) {
		
		//To check which number is greater from two numbers
		
		int a = 10;
		int b = 20;
		if (a > b){
			System.out.println("a is bigger");
		}
		else {
			System.out.println("b is bigger");
		}
		
		//To check Even or Odd
		
		int check = 25;
		if(check % 2 == 0) {
			System.out.println("Its a even number");
		}
		else {
			System.out.println("Not a even number");
		}
		
		//To check person is eligible for votting or not
		
		int age = 17;
		if(age < 18) {
			System.out.println("Not Eligible for votting");
		}
		else {
			System.out.println("Eligible");
		}
		
		//To check person is eligible for donating blood or not
		
		int blood = 21;
		if(blood > 18) {
			System.out.println("Eligible to donate");
		}
		else {
			System.out.println("Not Eligible to donate");
		}
		
		//To verify given number is prime or not
		
		int prime = 13;
		boolean isprime = true;
		for(int i = 2 ; i < prime ; i++) {
			if(prime % i == 0) {
				isprime = false;
				break;
			}
		}
		if(isprime) {
			System.out.println("Its a prime numner");
		}
		else {
			System.out.println("Not prime number");
		}
		
	}
}
			



