// Given a number, find the next higher number using only the digits 
//in the given number. For example if the given number is 1508, 
//the next higher number with same digits is 1805.
import java.util.Arrays;
public class NextHighest {
	
	public static void main(String[] args) {
		int num = 1508;
		char[] chars = String.valueOf(num).toCharArray();
		
		Arrays.sort(chars);
			System.out.println();
		
		for(int i = chars.length-1; i >= 0; i--){
			System.out.print(chars[i]);
		}

	}

}
