import java.util.Scanner;

// BMI  < 18.5              Underweight
// 18.5 ≤ BMI < 25.0   Normal
// 25.0 ≤ BMI < 30.0   Overweight
// 30.0 ≤ BMI               Obese

public class CalculatingBMI{
	public static void main(String[] args) {
		double weight, height, bmi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your weight in pounds: ");
		weight = scan.nextDouble();

		System.out.print("Enter your height in inches: ");
		height = scan.nextDouble();

		bmi = (weight*703) / (height*height);
	

		System.out.println(bmi);

		if (bmi< 18.5) {
			System.out.println("Underweight");
		}	else if (bmi < 25.0) {
			System.out.println("Normal");
		}	else if (bmi< 30.0) {
			System.out.println("Overweight");
		}	else if (bmi >= 30.0) {
			System.out.println("Obese");
		}



	}
}
