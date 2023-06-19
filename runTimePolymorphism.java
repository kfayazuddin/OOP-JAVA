package OOP;

public class runTimePolymorphism 
{
	int a;
	void run()
	{
		System.out.println("This function from rumTimePolymorphism class");
	}
	void say(int a)
	{
		this.a = a;
	}
    void call()
    {
    	System.out.println("Help me please");
    }
	public static void main(String[] args) 
	{
		runTime obj = new runTime();
		obj.run();
		obj.call();
	}

}
class runTime extends runTimePolymorphism
{
	void run()
	{
		System.out.println("This class is from runTime class");
	}
}
