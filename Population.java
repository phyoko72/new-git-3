public class Population
{
	public static void main(String[] args) 
	{
		// The Myanmar Census Bureau projects population based on the following assumptions:

		//  ■ One birth every 7 seconds
		//  ■ One death every 13 seconds
		//  ■ One new immigrant every 45 seconds

		//  Write a program to display the population for each of the next five years.
		// Assume the current population is 52,032,486 and one year has 365 days. 

		// Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated. 
		// For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
		// the fractional part, one of the values involved in the division must be a number with a
		// decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.	

		long birth = 3600/7;
		long death = 3600/13;
		long immigrant = 3600/45;

		System.out.println("Birth per hour: " + birth + ", Death per hour: " + death + ", Immigrant per hour: " + immigrant+ ".");

		System.out.println("===============================");


		long nph = (birth-death)+immigrant;
		System.out.println("Net People per hour: " + nph);

		System.out.println("===============================");

		long npd = nph * 24;
		System.out.println("Net People per day: " + npd);

		System.out.println("===============================");

		long npy = npd * 365;
		System.out.println("Net People per year: " + npy);

		System.out.println("===============================");

		long cp = 52032486;

		// long fy = cp + npy;

		// System.out.println("First Year: " + fy);

		// cp += npy;
		// System.out.println(cp);

		for (int x=1; x<=
			5; x++) {
			System.out.println("Year: " + x + " - Total Population: " + (cp += npy));
		}

		


	}
}