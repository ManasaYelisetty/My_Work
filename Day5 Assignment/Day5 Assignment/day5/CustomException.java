package day5;

import java.util.Scanner;

import day5_1.InvalidAgeException;

public class CustomException {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InvalidAgeException  {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the player name: ");
				String name = sc.next();
				System.out.println("Enter the player age: ");
				int age = sc.nextInt();
				try {
					if (age < 19) {
						throw new InvalidAgeException();
					} else {
						System.out.println("Player name: " + name);
						System.out.println("Player age: " + age);
					}
				} catch (InvalidAgeException iae) {
					System.out.println("CustomException: InvalidAgeRangeException ");
				}

				sc.close();
			}
		}


	
