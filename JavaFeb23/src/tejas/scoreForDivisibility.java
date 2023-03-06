package tejas;

import java.util.Scanner;

public class scoreForDivisibility {

	static int verifyScore(int num) {

		int score;

		if (num % 3 == 0 && num % 5 == 0)
			score = 8;

		else if (num % 5 == 0)
			score = 5;

		else if (num % 3 == 0)
			score = 3;

		else
			score = 0;
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		int score = verifyScore(num);
		System.out.println("score is " + score);
		scanner.close();

	}

}
