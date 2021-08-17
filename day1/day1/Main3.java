package day1;
import java.util.Scanner;
class LargestWord {
	public static String getLargestWord(String str) {
		String[] strarr = str.split(" ");
		int max = 0;
		String result = "";
		for (int i = 0; i < strarr.length; i++) {
			int len = strarr[i].length();
			if (max < len) {
				max = len;
				result = strarr[i];
			}
		}
		return result;
	}
}
public class Main3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = in.nextLine();
		System.out.println(LargestWord.getLargestWord(str));
		in.close();
	}

}
