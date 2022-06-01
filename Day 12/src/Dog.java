
public class Dog extends Animal{
	public void display()
	{
		System.out.println("I am a dog");
	}
	public void printMessage()
	{
		display();
		super.display();
	}
}
