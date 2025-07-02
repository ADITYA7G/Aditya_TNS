package Day4_Constructor_functions_ScannerClass;

public class Constructor_1 {
		
		int m=23;

		// non-parameterized method
		public void addition()
		{
			int x=20; // local variable
			int y=10;
			int add=x+y;
			System.out.println("Addition of X and Y = "+ add);
			System.out.println(m);
		}
		
		// parameterized method
		
		public void multiply( int a, int b)
		{
			int mult= a*b;
			System.out.println("Multiplication of a and b= "+ mult);
		   // System.out.println(x);
		}
		public static void main(String[] args) {
	   
			Constructor_1 obj1 = new Constructor_1(); // object creation
			obj1.addition(); // method calling
			obj1.multiply(19, 2);
		}
		
}


