import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// This file is an example of using the trigReciprocal class.

public class Example {
	private static Scanner scanner = new Scanner(System.in);
	private static TrigReciprocal trigReciprocal = new TrigReciprocal();

	public static void main(String[] args) {
		printHeading("Please choose a trigonometric reciprocal identity");
		System.out.println("1 = Cosecant (csc)");
		System.out.println("2 = Secant (sec)");
		System.out.println("3 = Cotangent (cot)");

		double choice = inputDouble("Chosen identity");
		double solving = inputDouble("Please enter a number into your chosen identity");

		printHeading("ANSWER");

		if (choice == 1.0) {
			double answer = trigReciprocal.csc(solving);

			System.out.printf("csc(%s) = %s", solving, answer);
			printWordAnswer("Cosecant", solving, answer);
		} else if (choice == 2.0) {
			double answer = trigReciprocal.sec(solving);

			System.out.printf("sec(%s) = %s", solving, answer);
			printWordAnswer("Secant", solving, answer);
		} else if (choice == 3.0) {
			double answer = trigReciprocal.cot(solving);

			System.out.printf("cot(%s) = %s", solving, answer);
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
		System.out.println(String.format("\n%s of %s is %s radian(s)", identityName, askedNumber, answer));
	}

	private static double inputDouble(String message) {
		double inputNumber = 0;

		System.out.print(String.format("%s: ", message));

		try {
			inputNumber = scanner.nextDouble();
			scanner.nextLine();
		} catch (InputMismatchException e) {
			exitWithMessage("Uh oh! You entered something that isn't a number.......");
		} catch (NoSuchElementException e) {
			exitWithMessage("\nYou exited via keyboard!");
		}

		return inputNumber;
	}

	private static void exitWithMessage(String message) {
		System.err.println(message);
		scanner.close();
		System.exit(0);
	}
}
