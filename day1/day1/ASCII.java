package day1;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter a character");
	        char n=s.next().charAt(0);
	        int asciiValue=n;
	        System.out.println("ASCII value of "+n+ " is: "+asciiValue);
	        s.close();
	    }
	}

	




