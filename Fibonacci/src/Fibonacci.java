// By definition, the first two numbers in the Fibonacci sequence are 0 and 1
//and each subsequent number is the sum of the previous two.
// For example, the first ten Fibonacci numbers are:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
import java.util.Scanner;
import java.util.ArrayList;
//What to do:
// Write a Java function that accepts a number and returns the number at that position 
//in the fibonnaci sequence.
//in your solution, print out the first 15 numbers of the Fibonacci sequence.
import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {

	
	public static void main(String[] args) {
		//input to print fibonacci series upto how many numbers
				Scanner sc = new Scanner(System.in);
				System.out.print("Input an integer to find the Fibonacci series to print: ");
				int num1 = sc.nextInt();
				System.out.println("Input number of iterations");
				int ite = sc.nextInt();
				int num2 = num1 + 1;
				ArrayList<Integer> als = new ArrayList<>();
				for (int z = 0; z < ite; z++){
					als.add(num1);
					num2 = num2 + num1;
					if(ite == als.size()){
						break;
					}
					als.add(num2);
					num1 = num2 + num1; 
					if(ite == als.size()){
						break;
					}
				}
				System.out.println("which number index would you like to find?");
				int get = sc.nextInt();
				System.out.println(get);
				System.out.println(als);
	

	}

}
