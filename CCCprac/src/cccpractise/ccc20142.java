package cccpractise;

import java.util.Scanner;

public class ccc20142 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int voteCount = scanner.nextInt();
		int voteA = 0;
		int voteB = 0;
		String votes = scanner.next();
		for (int i = 0; i < voteCount; i++)

		{
			if (votes.charAt(i) == 'A') {
				voteA = voteA + 1;
			}

			if (votes.charAt(i) == 'B') {
				voteB = voteB + 1;

			}
		}
		if (voteA > voteB) {
			System.out.println("A");
		}
		if (voteB > voteA) {
			System.out.println("B");

		}
		if (voteB == voteA) {
			System.out.println("Tie");
		}

	}

}
