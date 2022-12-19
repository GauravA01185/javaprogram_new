import java.utill.Scanner;
public class SwapNumeber{
   public static void main(String[] args){
	   Scanner swap=new Scanner(System.in);
	   System.out.println("Enter the first number");
		   int Number1=swap.nextInt();
		   System.out.println("Enter the second number");
	   int Number2=swap.nextInt();
	   Number1 = Number1 + Number2;
	    Number2 = Number1 - Number2;
		 Number1 = Number1 - Number2;
		 System.out.println("After swaping Number1 =  "          +Number1+        "Number2  =   "  +Number2);
   }
}
	   


   