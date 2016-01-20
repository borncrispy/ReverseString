package textTransformatons;


import java.util.Scanner;

public class ReverseAString {
	static String copy;
	public static void main(String[] args){
		
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter the string you would like reversed: ");
		String input = user.nextLine();
		
		System.out.println(StringReverse(input));
		System.out.println("This is the original sentence: " + copy);
		
	}
	
	public static String StringReverse(String nString){
		copy = nString;
		String[] stringLetters = new String[nString.length()];
		String[] backwards = new String[nString.length()];
		int start, end;
		for(start = 0, end = 0; start < nString.length(); start++, end++){
			stringLetters[start] = nString.substring(start, end + 1);
		}
		int counter = nString.length() - 1;
		for(int i = 0; i < nString.length(); i++){
			backwards[i] = stringLetters[counter];
			counter--;
		}
		StringBuffer results = new StringBuffer();
		for(int j = 0; j < backwards.length; j++){
			results.append(backwards[j]);
		}
		String returnString = results.toString();
		
		return returnString;
	}

}
