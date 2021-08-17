package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunRate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int runs = 0, runRate; 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of runs:");
		try {
			runs = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

		System.out.println("Enter number of overs:");
		int overs = Integer.parseInt(reader.readLine());
		 runRate = runs / overs;
		System.out.println("Run rate is " + runRate);

	}

}
