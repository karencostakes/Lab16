import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> primeNumbers = new ArrayList();
		ArrayList<Integer> remainders = new ArrayList();
		Scanner scan1 = new Scanner(System.in);
		int userInput;

		String choice = "yes";

		for (int i = 2; i < 1000; i++) {
			for (int j = (i - 1); j > 1; j--) {

				remainders.add(i % j);

			}

			if (remainders.contains(0)) {

				remainders.clear();
			}

			else {

				primeNumbers.add(i);
				remainders.clear();
			}

		}
		System.out.println(
				"Let's locate some primes!\nThis application will find you any prime, in order from first prime number on.");

		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("Which prime number are you looking for?");
			userInput = scan1.nextInt();
			scan1.nextLine();
			System.out.println("The number " + userInput + " prime is " + primeNumbers.get(userInput - 1));

			System.out.println("Do you want to find another prime number? (please enter yes or no)");
			choice = scan1.nextLine();

			if (choice.equalsIgnoreCase("no")) {
				System.out.println("See you later!");

			}

		}

	}

}
