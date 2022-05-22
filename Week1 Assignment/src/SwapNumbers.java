
public class SwapNumbers {
	public static void main(String args[])
	{
		int first=5,second=10;
		System.out.println("--Before Swap--");
		System.out.println("First number="+first);
		System.out.println("Second number="+second);
		int temp=first;
		first=second;
		second=temp;
		System.out.println("--After Swap--");
		System.out.println("First number="+first);
		System.out.println("Second number="+second);
	}

}
