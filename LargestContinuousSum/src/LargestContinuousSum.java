
// Given an array of integers (positive and negative) find the largest continuous sum.

public class LargestContinuousSum{
	public static void main(String[]args){
		
  int currentSum = 0;
  int currentMax = 0;
  int [] anArray = {3,5,7,2,9,100,-9,8};

  for (int j=0; j < anArray.length; j++)
  {
    currentSum += anArray[j];

   if (currentMax < currentSum) 
     currentMax = currentSum;
   else if (currentSum < 0)
     currentSum = 0;
  }
 
	
  System.out.println(currentMax);
  		
	}
	
}    
 
