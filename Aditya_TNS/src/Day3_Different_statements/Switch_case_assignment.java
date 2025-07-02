package Day3_Different_statements;
import java.util.*;
public class Switch_case_assignment {

	public static void main(String[] args) {
		System.out.println("Hey welcome");
		System.out.println("Hey pls enter \n 1 : Withdraw cash \n 2 : Deposite cash \n 3 : show balance \n 4 : Exit");
		int Total_balance = 200000;
		Scanner sc = new Scanner(System.in);
		int Money;
		String x = sc.nextLine();
		int ok = 1;
		switch(x) {
		case "1":
			System.out.println("Enter amount of money that you have to withdraw");
			Money = sc.nextInt();
			Total_balance = 200000 - Money;
			System.out.println("Your available balance is " + Total_balance);
			break;
			
		case "2":
			System.out.println("Enter amount of money that you have to Deposite");
			int Deposite_Money = sc.nextInt();
			Total_balance = 200000 + Deposite_Money;
			System.out.println("Your available balance is " + Total_balance);
			break;
			
		case "3":
			System.out.println("Here is your available balance");
			System.out.println(Total_balance);
			break;
				
		case "4":
			System.out.println("Thank You");
			break;
		}
	}
}
