package day1;

import java.util.Scanner;

class UserMainCode {
	public static int checkSum(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2!=0) 
				sum=sum+rem;
				num=num/10;
			if(sum%2==0)
				return -1;
			else
				return 1;
		}
		return sum;
	}
}
public class Main {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
        
		int result=UserMainCode.checkSum(num);
		if(result==-1)
			System.out.println("Sum of odd digits is Even");
		else
			System.out.println("Sum of odd digits is Odd");
		sc.close();
	}

}
