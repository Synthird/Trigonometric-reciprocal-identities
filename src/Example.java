import java.util.Scanner;

// This file is an example of using the trigReciprocal methods.

public class Example {
	private static Scanner scanner = new Scanner(System.in);
	private static TrigReciprocal trigReciprocal = new TrigReciprocal();

	public static void main(String[] args) {
		printHeading("Please choose a trigonometric reciprocal identity");
		System.out.println("1 = Cosecant (csc/cosec)");
		System.out.println("2 = Secant (sec)");
		System.out.println("3 = Cotangent (cot)");

		double choice = input_double("Chosen identity");
		double solving = input_double("Please enter a number into your chosen identity");

		printHeading("ANSWER");

		if (choice == 1.0) {
			double answer = trigReciprocal.csc(solving);

			System.out.println(String.format("csc(%s) = %s", solving, answer));
			printWordAnswer("Cosecant", solving, answer);
		} else if (choice == 2.0) {
			double answer = trigReciprocal.sec(solving);

			System.out.println(String.format("sec(%s) = %s", solving, answer));
			printWordAnswer("Secant", solving, answer);
		} else if (choice == 3.0) {
			double answer = trigReciprocal.cot(solving);

			System.out.println(String.format("cot(%s) = %s", solving, answer));
			printWordAnswer("Cotangent", solving, answer);
		} else {
			System.out.println("Whoops! You didn't choose a trigonometric reciprocal identity....");
		}

		scanner.close();
	}

	private static void printHeading(String title) {
		System.out.println(String.format("--- %s ---", title));
	}

	private static void printWordAnswer(String identityName, double askedNumber, double answer) {
		System.out.println(String.format("%s of %s is %s radians", identityName, askedNumber, answer));
	}

	private static double input_double(String message) {
		double inputed_number = 0;

		System.out.print(String.format("%s: ", message));

		try {
			inputed_number = scanner.nextDouble();
			scanner.nextLine();
		} catch (Exception e) {
			System.out.println("Uh oh! You entered something that isn't a number.......");
			System.exit(0);
		}

		return inputed_number;
	}
}
