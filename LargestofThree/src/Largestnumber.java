

public class Largestnumber {
       public void LargestNumofThree(double Num1, int Num2, int Num3) {
    	   if(Num1>Num2 && Num1>Num3){
             int Num = (int) Num1;
            System.out.println(Num);
       }
             else if(Num2>Num3){
               	 int Num = (int) Num2;
            	 System.out.println(Num);
             }
             else{
            	 System.out.println(Num3);
             }
 }
}