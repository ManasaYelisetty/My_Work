package day4;

import java.util.Scanner;

import day4_1.MemberShipCard;
import day4_1.PaybackCard;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select the Card :");
		System.out.println("1.Membership Card");
		System.out.println("2.Payback Card :");
		System.out.println("Select the option");
		int input = scanner.nextInt();
		System.out.println("Enter the Card Details : ");
		String details = scanner.next();
		String[] words = details.split("[|]");
		switch (input) {
		case 1:
			System.out.println("Enter the Rating");
			int rating = scanner.nextInt();
			MemberShipCard card1 = new MemberShipCard(words[0], words[1], words[2], rating);
			System.out.println(card1.getHolderName() + "'s Mambership Card Details");
			System.out.println("Card Number : " + card1.getCardNumber());
			System.out.println("Expiry Date : " + card1.getExpiryDate());
			System.out.println("Rating : " + card1.getRating());
			break;
		case 2:
			System.out.println("Enter Points in the Card");
			int points = scanner.nextInt();
			System.out.println("Enter the Amount");
			double amount = scanner.nextDouble();
			PaybackCard card2 = new PaybackCard(words[0], words[1], words[2], points, amount);
			System.out.println(card2.getHolderName() + "'s Payback Card Details");
			System.out.println("Card Number : " + card2.getCardNumber());
			System.out.println("Expiry Date : " + card2.getExpiryDate());
			System.out.println("Points Earned : " + card2.getPointsEarned());
			System.out.println("Total Amount : " + card2.getTotalAmount());
			break;
		default:
			System.out.println("Select the Vaild Card");
			break;
		}
		scanner.close();
	}

}
