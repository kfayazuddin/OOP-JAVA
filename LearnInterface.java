package OOP;

public class LearnInterface implements bus
{

	public static void main(String[] args)
	{
		LearnInterface l = new LearnInterface();
		l.speed();
		l.call();
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("This is High Speed");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Call this function");
	}

	@Override
	public void see() {
		// TODO Auto-generated method stub
		
	}


	

}
//	Abstract is the part of interface
// by default properties and methods are public and Abstract
interface bus
{
    void speed();
    void call();
    void see();
}
