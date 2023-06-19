package OOP;

public class CompilePolymorphism 
{
	//Poly :Many morphism: forms
	//Two types of Polymorphism : 1.)Compile Time Polymorphism     2.)Run Time Polymorphism
	/* 1.)Compile Time polymorphism: During compilation when there is check ,(or syntax error dectection and all are 
	 * compile time  ) during compilation then it is known as  Compile Time Polymorp.
	 * */
	
	
	/*
	 * 2.)Run Time Polymorphism : During Run Time  example is overriding function of child class function on parent class
	 * */
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
	}

}
