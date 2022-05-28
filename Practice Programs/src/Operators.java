
public class Operators 
{
	public static void main(String args[])
	{
		//Arithmatic Operators
		int a=9,b=4;
		System.out.println(".....Arithmatic Operators.....");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//Unary Operator
		System.out.println(".....Unary Operator.....");
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		//Boolean Operators
		System.out.println(".....Boolean Operators.....");
		boolean A=true;
		System.out.println(!A);
		System.out.println(A);
		//Shift Operators
		System.out.println(".....Shift Operators.....");
		int B=10;
		System.out.println(a<<2);//10*2^2
		//001010 -> doubt
		System.out.println(a>>2);//10/2^2
		//001010-> 000010=2
		System.out.println(a>>>2);
		int C=-10;
		System.out.println(a<<2);//-10*2^2
		System.out.println(a>>2);//-10/2^2
		System.out.println(a>>>2);
		//Relational Operator
		System.out.println("... Relational Operator...");
		int x=10,y=5,z=2,k=3;
		System.out.println(x>=y);
		System.out.println(x==z);
		System.out.println(x!=k);
		System.out.println(y<z);
		//Assignment Operator
		System.out.println("...Asssignment Operator...");
		int r=5;
		System.out.println(r=5);
		System.out.println(r+=5);
		System.out.println(r*=5);
		System.out.println(r/=5);
		System.out.println(r&=5);//Bitwise And
		System.out.println(r|=5);//Bitwise Or
		//Logical Operators
		System.out.println("...Logical Operators...");
		int f=10,g=5,h=3;
		System.out.println(f>g&&f<h);
		System.out.println(f>g||f<h);
		//Ternary Operator
		System.out.println("...Ternary Operator...");
		int i=10,j=5;
		//int max=(i>j)?i:j;
		int max=(i<j)?i:j;
		System.out.println(max);
		
	}
}
