// Using Java, remove duplicate characters in a given string keeping only the first occurrences. 
// For example, if the input is ‘tree traversal’ the output will be "tre avsl". 
package toyproblem;
import java.util.HashMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "tREE tOP";//sample string
	    String temp2="";//string with no duplicates
	    HashMap <Integer,Character> tc = new HashMap<Integer,Character>();//create a hashmap to store the char's
	    char [] charArray = s.toCharArray();
	    for (Character c : charArray)//for each char
	    	{
	            if (!tc.containsValue(c))//if the char is not already in the hashmap
	                {
	                    temp2=temp2+c.toString();//add the char to the output string
	                    tc.put(c.hashCode(),c);//and add the char to the hashmap
	                }
	        }

	        System.out.println(temp2);//final string
	    }
		
	}