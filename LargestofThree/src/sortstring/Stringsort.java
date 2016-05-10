

package sortstring;
 //Using the Java language, have the function ThirdGreatest(strArr)
 //take the array of strings stored in strArr and return the third largest word within in.
 //So for example: if strArr is ["hello", "world", "before", "all"]
 //your output should be world because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.
 
 //use the main method only for calling the function where your logic lies. :-)
 
 import java.util.Arrays;
public class Stringsort {
	private static String thirdLargest(String[] x) {
		    				
		     int[] order = new int[x.length];					//Array containing x's lengths
		     String result="";
		     for(int i=0;i<x.length;i++){
		         order[i]=x[i].length();							//Adding all array x's lengths
		     }
		     Arrays.sort(order);									//Sorting lengths in numerical order
		     for(int i=0;i<x.length;i++){
		         if(x[i].length()==order[order.length-3]){		//Finding array x value using length
		             result=x[i];
		         }
		     }
		     return result;
	}  
	public static void main(String[] args) {
		 String x[] = {"Hyphen", "Kickers", "Maybach", "Acid", "Progressive", "Migos"};
		    System.out.println(thirdLargest(x));              //Array x containing strings
		 }

	}


