// Using java solve the problem below:
// Given an array of integers, find the maximum and minimum of this array.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest	
import java.util.Scanner;

public class MaxiMini {

	public static void main(String[] args) {
		 int[] arr = new int[10];
	        Scanner in = new Scanner(System.in);
	        int i, min=0, max=0;
	        for(i=0; i<=arr.length; i++)
	        {
	            System.out.print("Enter any number: ");
	            arr[i] = in.nextInt();          
	        }
	        min = arr[0];
	        for(i=0; i<=9; i++)
	        {
	            if(arr[i] > max)
	            {
	                max = arr[i];
	            }
	            if(arr[i] < min)
	            {
	                min = arr[i];
	            }
	        }
	        System.out.println("Maximum is: " + max);
	        System.out.println("Minimum is: " + min);

	}

}
