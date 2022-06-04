/*To get a number from the user and print whether 
 it is positive or negative using scanner class*/
import java.util.Scanner;
public class SignChecking {
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("The Number is Positive");
		}
		else if(num<0)
		{
			System.out.println("The Number is Negative");
		}
		else
		{
			System.out.println("The Number is Zero");
		}
	}

}
