package OOP;

public class Abstraction 
{
	
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		bmw b = new bmw();
		b.gear();
	}

}
class bmw extends car{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("This is BMW car");
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("4-gear");
	}
	
}
class mercedes extends car{

	@Override
	public void speed() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is mercedes car");
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("6-gear");
	}
	
}
abstract class car{
	int seater;
	String name;
	public abstract void speed();
	public abstract void gear();
	// Abstract differs with interface is that
	void defaultnum()
	{
		System.out.println("Default number");
	}
}
