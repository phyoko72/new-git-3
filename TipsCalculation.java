import java.util.Scanner;

public class TipsCalculation{
	public static void main(String[] args) {
		double subtotal, gratuity_rate, gratuity, total;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the subtotal and gratuity rate: ");
		subtotal = scan.nextDouble();
		gratuity_rate = scan.nextDouble();

		gratuity = (subtotal*gratuity_rate)/100;
		total = subtotal + gratuity;

		System.out.println("The gratuity is " + gratuity);
		System.out.println("Total is " + total);
	}
}