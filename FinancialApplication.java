import java.util.Scanner;

public class FinancialApplication{

	public static void main(String[] args){
		
		double save_money, interest_rate=(1+0.00417), capital=0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		save_money = scan.nextDouble();

		for (int x=1; x<=6; x++) {
			 capital = (save_money+capital) * interest_rate;
		}
		System.out.println("After six months, the account value is $" + capital);
		
	}
}