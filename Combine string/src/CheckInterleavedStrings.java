// Combine Strings
// Language : Java

public class CheckInterleavedStrings {

	 public static void main(String[] args){
		 		String a1 = "abc";
		 		String b1 = "ijk";
			    int index = 0;

			    int len1 = a1.length() > b1.length()? a1.length():b1.length();
			    int len2 = a1.length() > b1.length()? b1.length():a1.length();

			    for(int i=0;i<len1;i++){

			        if(len2>0){
			            System.out.print(""+a1.charAt(index)+b1.charAt(index));
			            index++;
			            len2--;
			        }
			        else{

			            if(i<a1.length())
			            {
			                System.out.print(""+a1.charAt(index));
			                index++;
			            }
			            else
			            {
			                System.out.print(""+b1.charAt(index));
			                index++;
			            }               
	    }
	
	
   }
	 }
	 }

