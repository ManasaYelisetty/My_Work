package day5;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				try {
				System.out.println("Enter the Numbers");
				int number1 = sc.nextInt();
				int number2 = sc.nextInt();
				
					System.out.println(number1/number2);
				}
				catch(Exception e){
					System.err.println("Exception : "+e);
				}
				sc.close();
			}

		}


