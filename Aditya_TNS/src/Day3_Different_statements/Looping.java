package Day3_Different_statements;
import java.util.*;
public class Looping {
	public static void main(String [] args) {
//		for(int i = 100 ; i >= 1 ; --i) {
//			System.out.println(i);
//		}
		
		//Nested for loop
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter beginning");
//		int beg = sc.nextInt();
//		System.out.println("Enter ending");
//		int end = sc.nextInt();
//		for(int i = beg ; i <= end ; i++) {
//			for(int j = 1 ; j <= 10 ; j++) {
//				System.out.println(i + "*" + j + "=" + i * j);
//			}
//			System.out.println();
//		}
		System.out.println("Enter numnber");
		int Even_only = sc.nextInt();
		for(int i = 1 ; i <= Even_only ; i++) {
			if(i % 2 != 0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
	
}
