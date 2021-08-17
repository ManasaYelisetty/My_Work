package day2;

class FindMiddleChar {
	public String toFindCharacter(String input) {
		int length = input.length();
		int middleindex = length / 2;
		String output = "";
		if (length % 2 != 0)
			output = output + input.charAt(middleindex);
		else
			output = output + input.substring(middleindex - 1, middleindex+1 );
		return output;
	}

}

public class MiddleCharacter {
public static void main(String[] args) {
			 FindMiddleChar findMiddleChar=new FindMiddleChar();
			 System.out.println("for odd length " + findMiddleChar.toFindCharacter("367"));
			 System.out.println("for even length " + findMiddleChar.toFindCharacter("manasa"));
			}

		}


	


